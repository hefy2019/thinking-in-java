package com.hfy.array;

import java.util.Arrays;

//��Ա���б�
public class PlayerList {
	//�洢������Ա�����º���
		private static Integer[] players = null;
		//������Ա�ĸ���
		private static int size = 0;

		//  1):��ʼ����Ϊ5�������б�,׼�������洢���ϵ�5�����º���
		//public ArrayList(int initialCapacity)
		public static void init(int initialCapacity) {
			if (initialCapacity < 0) {//�������
				throw new IllegalArgumentException("��������Ϊ����");
			}
			players = new Integer[initialCapacity];
		}

		//  2):����5����Ա�ϳ�:[11,22,33,44,55]
		public static void add(Integer playerNum) {
			//�жϺ�����
			if (size == players.length) {
				Integer[] temp = Arrays.copyOf(players, players.length * 2);
				players = temp;
			}
			players[size] = playerNum;
			size++;
		}

		//  3):��ѯָ��λ�õ���Ա�����º����Ƕ���,��ѯ����λ��Ϊ2�����º�����:33
		public static Integer get(int index) {
			if (index < 0 || index >= size) {//�������
				throw new IllegalArgumentException("����Խ��");
			}
			return players[index];
		}

		//  4):�������º����ѯ����Ա�ڳ��ϵ�����λ��,44���ºŵ���Ա�ڳ��ϵ�����λ����:3
		public static int getIntegerByPlayerNum(Integer playerNum) {//���Ա���
			for (int index = 0; index < size; index++) {
				if (players[index].equals(playerNum)) {
					return index;
				}
			}
			//�����쳣
			return -1;
		}

		//  5):�滻��������λ��Ϊ2����Ա,�滻֮���λ�õ����±��Ϊ333,333��33�滻��
		public static void set(int index, Integer playerNum) {
			if (index < 0 || index >= size) {
				throw new IllegalArgumentException("����Խ��");
			}
			players[index] = playerNum;
		}

		//  6):�滻���º���Ϊ22����Ա,�滻֮��Ϊ222
		public static void update(Integer oldPlayerNum, Integer newPlayerNum) {
			int index = getIntegerByPlayerNum(oldPlayerNum);
			if (index > 0) {
				set(index, newPlayerNum);
			}
		}

		//  7):�ѳ�������λ��Ϊ2�����·��³�(ע��:����,û�в�λ)
		public static void delete(int index) {
			if (index < 0 || index >= size) {
				throw new IllegalArgumentException("����Խ��");
			}
			for (int i = index; i < size - 1; i++) {
				//index + 1 λ���ƶ���index λ��
				players[i] = players[i + 1];
			}
			//���һ��λ������Ϊnull
			players[size - 1] = null;
			//�ѳ�����Ա������1
			size--;
		}

		//  8):������Ա�ڳ��ϵ�λ��,��ӡ�����º���,��ӡ���:[11,22,33,44,55]
		public static void print() {
			if (players == null) {
				System.out.println("null");
				return;
			}
			if (size == 0) {
				System.out.println("[]");
				return;
			}
			StringBuilder sb = new StringBuilder(size * 3 + 1);
			sb.append("[");
			for (int index = 0; index < size; index++) {
				sb.append(players[index]);
				if (index != size - 1) {
					sb.append(",");
				} else {
					sb.append("]");
				}
			}
			System.out.println(sb.toString());
		}
}
