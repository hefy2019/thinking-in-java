package com.hfy._01_input;

import java.io.Console;

//ֻ�������ڿ���̨��,������Eclipse������ʹ��
public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		//��ȡ�û������һ������
		String line = console.readLine();
		System.out.println(line);
	}
}
//2018/7/4