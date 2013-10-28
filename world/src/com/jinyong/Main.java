package com.jinyong;

public class Main {

	public Main() {
		
		this.showorld(new Tlbb(), new Qifeng(), new Xlsbz());
		this.showorld(new Sdyxz(), new Guojing(), new Jyzj());
		this.showorld(new Sdxl(), new Yangguo(), new Arxhz());
		this.showorld(new Xkx(), new Shipotian(), new Xkxgf());
		this.showorld(new Yttlj(), new Zhangwuji(), new Jysg());
		this.showorld(new Xsfh(), new Hufei(), new Hjdf());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	public void showorld(Book book, Hero hero, Gongfu gongfu) {
		book.showname();
		hero.showname();
		gongfu.showname();
	}

}
