package com.hefy.thread;

/**
 * @author hefy:
 * @date 2019年7月12日 上午11:43:36
 * @version 1.0 类说明
 *          使用Thread来驱动LiftOff对象，调用Thread对象的start()方法为该线程执行必须的初始化操作，然后调用Runnable的run()方法，
 *          以便在新线程中启动该任务
 *          程序同时执行main()和LiftOff.run()方法。
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
