package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	/*
	 * 1.���Է����ϱ���ʹ��@Test��������
	 * 2.���Է�������ʹ��public void �������Σ����ܴ��κεĲ���
	 * 3.�½�һ��Դ����Ŀ¼��������ǵĲ��Դ���
	 * 4.������İ�Ӧ�úͱ������ౣ��һ��
	 * 5.���Ե�Ԫ�е�ÿ������������Ե������ԣ����Է����䲻�����κε�����
	 * 6.������ʹ��Test��Ϊ�����ĺ�׺�����Ǳ��룩
	 * 7.���Է���ʹ��test��Ϊ��������ǰ׺�����Ǳ��룩
	 */

	
	@Test
	public void testAdd() {
		assertEquals(6, new Calculate().add(3, 3));
	}
	
	@Test
	public void testSubstract() {
		assertEquals(3, new Calculate().substract(6, 3));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(2, new Calculate().multiply(1, 2));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2, new Calculate().divide(6, 3));
	}

}
