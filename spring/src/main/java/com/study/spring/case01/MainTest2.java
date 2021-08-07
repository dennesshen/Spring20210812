package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Husband husband = (Husband) ctx.getBean("Husband");
		Wife wife = (Wife) ctx.getBean("Wife");
		System.out.println(husband + "的太太是" + wife);
		System.out.println(wife + "的先生是" + husband);
	}

}
