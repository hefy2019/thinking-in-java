package com.hfy._05_exception_class;

//ģ�� C����  û���쳣���Ƶ�����
//�����˵��쳣
class CarWrongException extends Exception {
	private static final long serialVersionUID = 1L;

	public CarWrongException(String message) {
		super(message);
	}

	public CarWrongException(String message, Throwable cause) {
		super(message, cause);
	}
}

//�ϰ�ٵ��쳣
class LateException extends Exception {
	private static final long serialVersionUID = 1L;

	public LateException(String message) {
		super(message);
	}

	public LateException(String message, Throwable cause) {
		super(message, cause);
	}
}

//��
class Car {
	public void run() throws CarWrongException {
		int a = 2;
		if (a == 2) {//���ܳ��ֵ����
			throw new CarWrongException("��,��̥��");
		}
		System.out.println("�����ϰ�");
	}
}

//�ϰ����
class Worker {
	private Car car = null;

	Worker(Car car) {
		this.car = car;
	}

	public void gotoWork() throws LateException {
		try {
			car.run();//��������ȥ�ϰ�
			System.out.println("����");
		} catch (CarWrongException e) {
			e.printStackTrace();
			//����ê��,�����쳣,
			this.walk();//Ҫ��·
			throw new LateException("�ٵ���ԭ��" + e.getMessage(), e);
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
		try {
			worker.gotoWork();
			System.out.println("�ϰ巢����");
		} catch (LateException e) {
			System.out.println("�ٵ���Ǯ");
			e.printStackTrace();
		}
	}
}
