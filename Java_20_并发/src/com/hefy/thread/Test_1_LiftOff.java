package com.hefy.thread;

/**	Java���̻߳�������ռʽ��
 * @author hefy:
 * @date 2019��7��12�� ����11:16:32
 * @version 1.0 ��˵�� LiftOff������ʾ����֮ǰ�ĵ���ʱ,  LiftOff������
 */
public class Test_1_LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public Test_1_LiftOff() {
	}

	public Test_1_LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff") + "),";
	}

	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			Thread.yield(); // �̵߳�����
		}
	}
}
