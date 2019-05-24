package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(value = { TaskTest1.class, TaskTest2.class, TaskTest3.class })
public class SuitTest {
	/*
	 * 1、测试套件就是组织测试类一起运行的
	 * 
	 * 写一个座位测试套件的入口类，这个类里不包含其他方法
	 * 更改测试运行器Suite.class
	 * 将要测试的类作为数组传入到Suite.SuiteClasses({})中
	 */
}
