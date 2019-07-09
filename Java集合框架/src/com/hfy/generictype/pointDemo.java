package com.hfy.generictype;

//如果泛型不设置默认是Object
public class pointDemo {
	public static void main(String[] args) {
		//情况1:使用String类型
		Point<String> p1 = new Point<String>();
		String x1 = p1.getX();
		//String x2 = (String) x1;
		//情况2:使用Integer类型
		Point<Integer> p2 = new Point<Integer>();
		Integer x2 = p2.getX();
		//情况3:使用Double类型
		Point<Double> p3 = new Point<Double>();
		Double x3 = p3.getX();
	}
	//泛型方法	类型应该由参数决定
	public static <T> T doWork(T val) {
		return val;
	}
}
