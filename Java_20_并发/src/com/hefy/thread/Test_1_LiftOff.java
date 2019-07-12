package com.hefy.thread;

/**	Java的线程机制是抢占式的
 * @author hefy:
 * @date 2019年7月12日 上午11:16:32
 * @version 1.0 类说明 LiftOff任务将显示发射之前的倒计时,  LiftOff任务类
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
			Thread.yield(); // 线程调度器
		}
	}
}
