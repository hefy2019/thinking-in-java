package com.hefy.thread;

/**
 * @author hefy:
 * @date 2019��7��12�� ����11:43:36
 * @version 1.0 ��˵��
 *          ʹ��Thread������LiftOff���󣬵���Thread�����start()����Ϊ���߳�ִ�б���ĳ�ʼ��������Ȼ�����Runnable��run()������
 *          �Ա������߳�������������
 *          ����ͬʱִ��main()��LiftOff.run()������
 */
public class Test_3_BasicThreads {
	public static void main(String[] args) {
		Thread t = new Thread(new Test_1_LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
	}
}
/*
 * Waiting for LiftOff
 * #0(9),#0(8),#0(7),#0(6),#0(5),#0(4),#0(3),#0(2),#0(1),#0(Liftoff),
 */
