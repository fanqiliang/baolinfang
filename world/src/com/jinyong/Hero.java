package com.jinyong;

public class Hero {
	String name;
	public void showname() {
		System.out.println("主角：");
	}
}

class Qifeng extends Hero {
	
	public void showname() {
		System.out.println("主角：乔峰");
	}
}
class Guojing extends Hero {
	
	public void showname() {
		System.out.println("主角：郭靖");
	}
}
class Zhangwuji extends Hero {
	
	public void showname() {
		System.out.println("主角：张无忌");
	}
}
class Hufei extends Hero {
	
	public void showname() {
		System.out.println("主角：胡婓");
	}
}
class Shipotian extends Hero {
	
	public void showname() {
		System.out.println("主角：石破天");
	}
}
class Yangguo extends Hero {
	
	public void showname() {
		System.out.println("主角：杨过");
	}
}

