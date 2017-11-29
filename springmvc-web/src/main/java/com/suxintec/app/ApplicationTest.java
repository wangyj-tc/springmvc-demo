package com.suxintec.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suxintec.controller.IndexController;

public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/springmvc.xml");
		IndexController iController = (IndexController) app.getBean("indexController");
		iController.index();
	}
}
