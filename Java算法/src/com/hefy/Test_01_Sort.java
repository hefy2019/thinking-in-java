package com.hefy;

import com.hefy.Test_01_Sort;

/**
* @author hefy:
* @date 2019年7月15日 下午11:44:23
* @version 1.0
* 类说明
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
	 * 【插入排序】 基本思想：在要排序的一组数中，假设前面（n-1）[n>=2]个数 已经是 排好顺序的，
	 * 现在要把第n个数插到前面的有序数中，使得这n个数也是排好顺序的， 如此反复循环，直到全部排好顺序。
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
	 * 【选择排序】基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的交换，
	 * 然后再剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数与第 一个数比较为止。
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