package com.hefy.thread;

/**
 * @author hefy:
 * @date 2019��7��12�� ����11:54:16
 * @version 1.0 ��˵�� �̵߳ĵ����Ƿ�ȷ���Ե�
 *          ÿ��Thread��"ע��"�����Լ�����һ�����������ã����������������˳�run()������֮ǰ�������������޷��������
 */
public class Test_4_MoreBasicThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new Test_1_LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff");
	}
}
