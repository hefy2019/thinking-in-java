package com.hfy._06_java7;

import java.io.IOException;

public class DocDemo {
	public static void main(String[] args) {
		//空指正异常
		String str = null;
		if (str != null) {
			System.out.println(str);
		}
		try {
			DocDemo.doWork("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 描述方法的功能
	 * @param name : 该参数干嘛的
	 * @return 返回的是什么
	 * @throws IoException 如果怎么怎么,就抛出IoException
	 */
	public static int doWork(String name) throws IOException {
		return 0;
	}
} /*	处理异常的原则
		1):异常只能用于非正常情况try-catch的存在也会影响性能
		2):需要为异常提供说明文档,比如java.doc 如果自定义了异常或某一个方法抛出了异常,我们应该记录在文档注释中..
		3):尽可能避免异常  
			如NullPointerException  上述代码中有例子
		4):异常的力度很重要,应该为一个基本操作定义一个try-catch块,不要为了简便,将几百行代码放到一个try-catch块中
		5):不建议在循坏中进行异常处理,建议在循环之外使用try-catch
		6):自定义异常尽量使用RuntimeException类型	
	*/
