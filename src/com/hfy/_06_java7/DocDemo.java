package com.hfy._06_java7;

import java.io.IOException;

public class DocDemo {
	public static void main(String[] args) {
		//��ָ���쳣
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
	 * ���������Ĺ���
	 * @param name : �ò��������
	 * @return ���ص���ʲô
	 * @throws IoException �����ô��ô,���׳�IoException
	 */
	public static int doWork(String name) throws IOException {
		return 0;
	}
} /*	�����쳣��ԭ��
		1):�쳣ֻ�����ڷ��������try-catch�Ĵ���Ҳ��Ӱ������
		2):��ҪΪ�쳣�ṩ˵���ĵ�,����java.doc ����Զ������쳣��ĳһ�������׳����쳣,����Ӧ�ü�¼���ĵ�ע����..
		3):�����ܱ����쳣  
			��NullPointerException  ����������������
		4):�쳣�����Ⱥ���Ҫ,Ӧ��Ϊһ��������������һ��try-catch��,��ҪΪ�˼��,�������д���ŵ�һ��try-catch����
		5):��������ѭ���н����쳣����,������ѭ��֮��ʹ��try-catch
		6):�Զ����쳣����ʹ��RuntimeException����	
	*/
