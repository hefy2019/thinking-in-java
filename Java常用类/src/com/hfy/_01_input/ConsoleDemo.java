package com.hfy._01_input;

import java.io.Console;

//只能适用于控制台中,不能在Eclipse工具中使用
public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		//读取用户输入的一行数据
		String line = console.readLine();
		System.out.println(line);
	}
}
//2018/7/4