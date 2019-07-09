package com.hfy._01_why;

import com.hfy._01_why.Car;
import com.hfy._01_why.Worker;

//模拟 C语言  没有异常机制的困惑
//车
class Car {
	public static final int NO_OK = 0;
	public static final int OK = 1;

	public int run() {
		int a = 1;
		if (a == 2) {//可能出现的情况
			System.out.println("车爆胎了");
			return NO_OK;
		} else {
			System.out.println("开车上班");
			return OK;
		}
	}
}

//上班的人
class Worker {
	public static final int LATE = 0;
	public static final int IN_TIME = 1;
	private Car car = null;

	Worker(Car car) {
		this.car = car;
	}

	public int gotoWork() {
		if (car.run() == Car.NO_OK) {
			walk();//走路
			return LATE;
		} else {
			System.out.println("开车到公司");
			return IN_TIME;
		}
	}

	private void walk() {
		System.out.println("走路去上班");
	}
}

public class WhyDemo {
	public static void main(String[] args) {
		Car c = new Car();
		Worker worker = new Worker(c);
		if (worker.gotoWork() == Worker.LATE) {
			System.out.println("扣钱");
		} else {
			System.out.println("发奖金");
		}
		System.out.println("git回滚测试");
	}
}
