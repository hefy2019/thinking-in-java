package com.hefy;

/**
 * @author hefy:
 * @date 2019��7��12�� ����9:38:41
 * @version 1.0 ��˵�� Java 5.0������ö�٣�ö�����Ʊ���ֻ����Ԥ���趨�õ�ֵ��ʹ��ö�ٿ��Լ��ٴ����е� bug��
 *          ���磬����Ϊ��֭�����һ�������������ƹ�֭ΪС�����б����󱭡������ζ����������˿͵���������ֳߴ���Ĺ�֭��
 */

class FreshJuice {
	enum FreshJuiceSize {
		SMALL, MEDIUM, LARGE
	}

	FreshJuiceSize size;
}

public class Test_1_FreshJuice {
	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		juice.size = FreshJuice.FreshJuiceSize.SMALL;
		System.out.println(juice.size);
	}
}