package com.hfy.array;

import java.util.Arrays;

//���������˶�Ա�ϳ�
public class FootballPlayerDemo {

	public static void main(String[] args) {
		//��ʼ����Ϊ5�������б�
		PlayerList.init(5);
		//  2):����5����Ա�ϳ�:[11,22,33,44,55]
		PlayerList.add(1);
		PlayerList.add(2);
		PlayerList.add(3);
		PlayerList.add(4);
		PlayerList.add(5);
		PlayerList.add(6);
		PlayerList.add(7);
		PlayerList.add(8);
		PlayerList.add(9);
		PlayerList.add(10);
		PlayerList.add(11);
		//��ӡ
		PlayerList.print();
		//��ѯ����λ��Ϊ2�����º�����:33
		//Integer num = get(2);
		//System.out.println(num);
		//44���ºŵ���Ա�ڳ��ϵ�����λ����:3
		//int index = getIntegerByPlayerNum(44);
		//System.out.println(index);
		//������Ϊ2����Ա�滻Ϊ333
		//set(2,333);
		//print();//[11,22,333,44,55]
		//update(33, 888);
		//print();
		//delete(2);//ɾ������Ϊ2��Ԫ��
		//print();//[11,22,44,55]
	}

}
