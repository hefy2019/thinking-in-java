package com.hefy;

/**
 * @author hefy:
 * @date 2019年7月14日 下午12:58:06
 * @version 1.0 类说明  if() 语句括号中为比较表达式，返回值要么是 true，要么是 false，if(x=y) 是将 y 赋值给 x，但是数据类型是 int 类型的，编译不能通过。
 */
public class Test_1_IfTest {
	public static void main(String[] args) {
		int x = 3;
		int y = 1;
		if (x == y) // 当if (x = y) Type mismatch: cannot convert from int to boolean 代码编译错误
			System.out.println("不相等");
		else
			System.out.println("相等");
	}
}
