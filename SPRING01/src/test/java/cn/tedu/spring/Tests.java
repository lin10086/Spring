package cn.tedu.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	@Test
	public void test() {
		 // ����Spring�����ļ�����ȡSpring����
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        // �������л�ȡ����Ķ���
	//	User user=(User) ac.getBean("user");
		Phone p=(Phone) ac.getBean("phone");
		PhoneFactory.newInstance();
        // ����
		//System.out.println(user);
		System.out.println(p);
        // �ͷ���Դ
		ac.close();
		
	}
}
