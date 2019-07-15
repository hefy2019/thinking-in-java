package com.hefy;

import com.hefy.Test_01_Sort;

/**
* @author hefy:
* @date 2019��7��15�� ����11:44:23
* @version 1.0
* ��˵��
*/
public class Test_01_Sort {

	public static void main(String[] args) {
		int[] arr = { 18, 7, 23, 21, 43, 95, 6, 94 };
		Test_01_Sort basicSort = new Test_01_Sort();
		System.out.println("Before Sorting:");
		basicSort.printArray(arr);
		System.out.println();
		//basicSort.insertSort(arr);
		basicSort.selectSort(arr);
		System.out.println("After Sorting:");
		basicSort.printArray(arr);
	}

	/*
	 * ���������� ����˼�룺��Ҫ�����һ�����У�����ǰ�棨n-1��[n>=2]���� �Ѿ��� �ź�˳��ģ�
	 * ����Ҫ�ѵ�n�����嵽ǰ����������У�ʹ����n����Ҳ���ź�˳��ģ� ��˷���ѭ����ֱ��ȫ���ź�˳��
	 */
	public void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			for (; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	/*
	 * ��ѡ�����򡿻���˼�룺��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õĽ�����
	 * Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ�������� һ�����Ƚ�Ϊֹ��
	 */
	public void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int position = i;
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < temp) {
					temp = arr[j];
					position = j;
				}
			}
			arr[position] = arr[i];
			arr[i] = temp;
		}
	}

	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}