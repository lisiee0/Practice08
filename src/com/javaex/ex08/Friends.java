package com.javaex.ex08;

public class Friends {
	
	private String name;
	private String hp;
	private String school;
	
	public Friends() {
		
	}
	
	public void setting(String name, String hp, String school) {
		this.name= name;
		this.hp= hp;
		this.school= school;
	}
	
	public void showInfo() {
		System.out.println("이름: "+name+" 핸드폰: "+hp+" 학교: "+school);
	}
}
