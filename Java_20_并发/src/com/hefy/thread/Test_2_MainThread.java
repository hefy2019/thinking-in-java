package com.hefy.thread;

/**
 * @author hefy:
 * @date 2019年7月12日 上午11:33:57
 * @version 1.0 类说明  当从Runnable导出一个类时，它必须具有run()方法，但是这个方法并无特殊之处————它不会产生任何内在的线程能力。
 * 实现线程行为，必须显示地将一个任务附着到线程上。
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
