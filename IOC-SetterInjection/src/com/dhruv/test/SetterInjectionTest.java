package com.dhruv.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.dhruv.beans.WishMassegeGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource res=new FileSystemResource("src/com/dhruv/cfg/applicationContext.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("wmg");
		
		WishMassegeGenerator wmg=(WishMassegeGenerator)obj;
		String result=wmg.generateWishMassege("Dhruv");
		System.out.println("Result :"+result);

	}

}
