package com.hfy.array;

import java.util.Arrays;

/**
 * ����������б�(����)
 * @author Administrator
 */
public class MyArrayList {
	//�洢�������͵�Ԫ��
	private Object[] elements = null;
	//�����д洢�˶��ٸ�Ԫ��
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 10;

	public MyArrayList() {//Ĭ�ϵĹ����� 
		this(DEFAULT_INITIAL_CAPACITY);
	}

	//������
	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {//�������
			throw new IllegalArgumentException("��������Ϊ����");
		}
		elements = new Object[initialCapacity];
	}

	// �����µ�Ԫ��
	public void add(Object ele) {
		//�жϺ�����
		if (size == elements.length) {
			Object[] temp = Arrays.copyOf(elements, elements.length * 2);
			elements = temp;
		}
		elements[size] = ele;
		size++;
	}

	// ��ѯָ������λ�õ�Ԫ��
	public Object get(int index) {
		if (index < 0 || index >= size) {//�������
			throw new IllegalArgumentException("����Խ��");
		}
		return elements[index];
	}

	// �滻ָ������λ�õ�Ԫ��ֵ
	public void set(int index, Object newEle) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		elements[index] = newEle;
	}

	// ɾ��ָ������λ�õ�Ԫ��
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		for (int i = index; i < size - 1; i++) {
			//index + 1 λ���ƶ���index λ��
			elements[i] = elements[i + 1];
		}
		//���һ��λ������Ϊnull
		elements[size - 1] = null;
		//�ѳ�����Ա������1
		size--;
	}

	public String toString() {
		if (elements == null) {
			return "null";
		}
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 3 + 1);
		sb.append("[");
		for (int index = 0; index < size; index++) {
			sb.append(elements[index]);
			if (index != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
		}
		return sb.toString();
	}

	//���������Ԫ�ظ���
	public int size() {
		return size;
	}

	//�ж�������Ԫ�ظ����Ƿ�Ϊ: 0
	public boolean isEmpty() {
		return size == 0;
	}

	//��ռ����е�Ԫ��
	public void clear() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
		size = 0;
	} //��ѯJDK�е�ArrayList ���жԱ�
}
