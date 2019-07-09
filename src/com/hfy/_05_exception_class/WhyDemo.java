package com.hfy._05_exception_class;

//模拟 C语言  没有异常机制的困惑
//车坏了的异常
class CarWrongException extends Exception {
	private static final long serialVersionUID = 1L;

	public CarWrongException(String message) {
		super(message);
	}

	public CarWrongException(String message, Throwable cause) {
		super(message, cause);
	}
}

//上班迟到异常
class LateException extends Exception {
	private static final long serialVersionUID = 1L;

	public LateException(String message) {
		super(message);
	}

	public LateException(String message, Throwable cause) {
		super(message, cause);
	}
}

//车
class Car {
	public void run() throws CarWrongException {
		int a = 2;
		if (a == 2) {//可能出现的情况
			throw new CarWrongException("车,爆胎了");
		}
		System.out.println("开车上班");
	}
}

//上班的人
class Worker {
	private Car car = null;

	Worker(Car car) {
		this.car = car;
	}

	public void gotoWork() throws LateException {
		try {
			car.run();//正常开车去上班
			System.out.println("开心");
		} catch (CarWrongException e) {
			e.printStackTrace();
			//车抛锚了,出现异常,
			this.walk();//要走路
			throw new LateException("迟到的原因" + e.getMessage(), e);
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
		try {
			worker.gotoWork();
			System.out.println("老板发奖金");
		} catch (LateException e) {
			System.out.println("迟到扣钱");
			e.printStackTrace();
		}
	}
}
