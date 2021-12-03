package com.javaex.ex08;

import java.util.Scanner;

public class FriendsApp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요.");
		
		Friends[] friends= new Friends[3];
		
		
		for(int a= 0; a<friends.length; a++) {
			friends[a]= new Friends();
			String info= sc.nextLine();
			String[] sArray= info.split(" ");
			friends[a].setting(sArray[0], sArray[1], sArray[2]);
		}
		
		for(int i= 0; i<friends.length; i++) {
			friends[i].showInfo();
		}	
		sc.close();
	}
}
