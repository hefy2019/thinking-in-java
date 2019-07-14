package com.hefy;

/**
 * @author hefy:
 * @date 2019年7月14日 下午1:08:54
 * @version 1.0 类说明	delete(x, y) 删除从字符串 x 的索引位置开始到 y-1 的位置，append() 函数用于连接字符串。
 */
public class Test_1_StringBufferTest {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Runoob");
		StringBuffer b = new StringBuffer("Google");
		a.delete(1, 3);
		a.append(b);
		System.out.println(a);	//RoobGoogle
	}
}
