package cn.tedu.spring;

public class PhoneFactory {

	public static Phone newInstance() {
		
		System.out.println("PhoneFactory'snewInstance");
		return new Phone();
		
	}
	public PhoneFactory() {
		System.out.println("PhoneFactory's�Ĺ��췽��");
		
	}
}
