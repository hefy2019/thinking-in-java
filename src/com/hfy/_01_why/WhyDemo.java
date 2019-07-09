package com.hfy._01_why;

import com.hfy._01_why.Car;
import com.hfy._01_why.Worker;

//ģ�� C����  û���쳣���Ƶ�����
//��
class Car {
	public static final int NO_OK = 0;
	public static final int OK = 1;

	public int run() {
		int a = 1;
		if (a == 2) {//���ܳ��ֵ����
			System.out.println("����̥��");
			return NO_OK;
		} else {
			System.out.println("�����ϰ�");
			return OK;
		}
	}
}

//�ϰ����
class Worker {
	public static final int LATE = 0;
	public static final int IN_TIME = 1;
	private Car car = null;

	Worker(Car car) {
		this.car = car;
	}

	public int gotoWork() {
		if (car.run() == Car.NO_OK) {
			walk();//��·
			return LATE;
		} else {
			System.out.println("��������˾");
			return IN_TIME;
		}
	}

	private void walk() {
		System.out.println("��·ȥ�ϰ�");
	}
}

public class WhyDemo {
	public static void main(String[] args) {
		Car c = new Car();
		Worker worker = new Worker(c);
		if (worker.gotoWork() == Worker.LATE) {
			System.out.println("��Ǯ");
		} else {
			System.out.println("������");
		}
		System.out.println("git�ع�����");
	}
}
