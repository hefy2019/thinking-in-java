package com.hefy.thread;

/**
 * @author hefy:
 * @date 2019��7��12�� ����11:33:57
 * @version 1.0 ��˵��  ����Runnable����һ����ʱ�����������run()�������������������������֮��������������������κ����ڵ��߳�������
 * ʵ���߳���Ϊ��������ʾ�ؽ�һ�������ŵ��߳��ϡ�
 */
public class Test_2_MainThread {
	public static void main(String[] args) {
		Test_1_LiftOff launch = new Test_1_LiftOff();
		launch.run();
	}
}
/*
 * #0(9), #0(8), #0(7), #0(6), #0(5), #0(4), #0(3), #0(2), #0(1), #0(Liftoff),
 */
