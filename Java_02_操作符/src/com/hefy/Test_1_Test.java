package com.hefy;

/**
 * @author hefy:
 * @date 2019年7月14日 下午12:53:33
 * @version 1.0 类说明 
 * 因为在 Java 中 + 操作法的优先级大于 ==，所以输出部分表达式等于 “s1 == s2 is:runoob” == “runoob”，该表达式计算结果为 false。
 */
public class Test_1_Test {
	public static void main(String[] args) {
		String s1 = "runoob";
		String s2 = "runoob";
		System.out.println("s1 == s2 is:" + s1 == s2); //false
	}
}
