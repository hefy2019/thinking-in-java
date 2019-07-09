package com.hfy.array;

import java.util.Arrays;

//球员的列表
public class PlayerList {
	//存储场上球员的球衣号码
		private static Integer[] players = null;
		//场上球员的个数
		private static int size = 0;

		//  1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码
		//public ArrayList(int initialCapacity)
		public static void init(int initialCapacity) {
			if (initialCapacity < 0) {//容量检查
				throw new IllegalArgumentException("容量不能为负数");
			}
			players = new Integer[initialCapacity];
		}

		//  2):安排5个球员上场:[11,22,33,44,55]
		public static void add(Integer playerNum) {
			//判断和扩容
			if (size == players.length) {
				Integer[] temp = Arrays.copyOf(players, players.length * 2);
				players = temp;
			}
			players[size] = playerNum;
			size++;
		}

		//  3):查询指定位置的球员的球衣号码是多少,查询索引位置为2的球衣号码是:33
		public static Integer get(int index) {
			if (index < 0 || index >= size) {//索引检查
				throw new IllegalArgumentException("索引越界");
			}
			return players[index];
		}

		//  4):根据球衣号码查询该球员在场上的索引位置,44球衣号的球员在场上的索引位置是:3
		public static int getIntegerByPlayerNum(Integer playerNum) {//线性遍历
			for (int index = 0; index < size; index++) {
				if (players[index].equals(playerNum)) {
					return index;
				}
			}
			//返回异常
			return -1;
		}

		//  5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333,333把33替换了
		public static void set(int index, Integer playerNum) {
			if (index < 0 || index >= size) {
				throw new IllegalArgumentException("索引越界");
			}
			players[index] = playerNum;
		}

		//  6):替换球衣号码为22的球员,替换之后为222
		public static void update(Integer oldPlayerNum, Integer newPlayerNum) {
			int index = getIntegerByPlayerNum(oldPlayerNum);
			if (index > 0) {
				set(index, newPlayerNum);
			}
		}

		//  7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位)
		public static void delete(int index) {
			if (index < 0 || index >= size) {
				throw new IllegalArgumentException("索引越界");
			}
			for (int i = index; i < size - 1; i++) {
				//index + 1 位置移动到index 位置
				players[i] = players[i + 1];
			}
			//最后一个位置设置为null
			players[size - 1] = null;
			//把场上球员总数减1
			size--;
		}

		//  8):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55]
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
