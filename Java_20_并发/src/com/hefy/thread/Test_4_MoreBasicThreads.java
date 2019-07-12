package com.hefy.thread;

/**
 * @author hefy:
 * @date 2019年7月12日 上午11:54:16
 * @version 1.0 类说明 线程的调度是非确定性的
 *          每个Thread都"注册"类它自己，有一个对它的引用，而且在它的任务退出run()并死亡之前，垃圾回收器无法清除它。
 */
public class Test_4_MoreBasicThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new Test_1_LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff");
	}
}
