package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.entity.Student;

public class SpringDBTest {
	
	@Test
	public void test(){
		//定义配置文件的路径
		String xmlPath = "com/config/beans.xml";
		//创建Spring容器，加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//获取Dao实例
		StudentDao dao = (StudentDao) applicationContext.getBean("studentDao");
		
		Student student = dao.getStudentByStuNumber("11503080138");	
		System.out.println(student.toString());
	}
	

}
