package com.dsx;

import com.dsx.bean.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld bean = (HelloWorld) classPathXmlApplicationContext.getBean("dsx");
		System.out.println(bean);
		System.out.println(bean.getName());
	}
}