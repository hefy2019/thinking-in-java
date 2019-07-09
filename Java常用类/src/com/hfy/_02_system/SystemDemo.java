package com.hfy._02_system;

import java.util.Arrays;

public class SystemDemo {
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("我被回收了...");
	}
	
	public static void main(String[] args) {
		//数组拷贝操作
		//static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		int[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] dest = new int[10];
		System.out.println(Arrays.toString(dest));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.arraycopy(src, 2, dest, 4, 3);
		System.out.println(Arrays.toString(dest));//[0, 0, 0, 0, 3, 4, 5, 0, 0, 0]
		//static long currentTimeMillis()  	返回以毫秒为单位的当前时间。
		long timeMillis = System.currentTimeMillis();//测试某一个操作的损耗时间
		System.out.println(timeMillis);//1508891953663
		//static void exit(int status) 终止当前正在运行的 Java 虚拟机。 非 0 的状态码表示异常终止。
		System.exit(0);//源代码底层  Runtime.getRuntime().exit(status);
		//System.out.println("ending...");
		//static void gc()	 运行垃圾回收器。 
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		System.gc();
		System.out.println("ending...");
	}
}
