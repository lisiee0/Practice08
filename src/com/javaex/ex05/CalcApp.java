package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    		
    	Scanner sc= new Scanner(System.in);
    	
    	String order= "";
    	boolean action= true;
    	
    	while(action) {
    		
    		try {
    			System.out.print(">> ");
    			order= sc.nextLine();
    			
    			if(order.equals("/q")) {
    				System.out.println("종료합니다");
    				action= false;
    			}
    			else {
    				String[] oArray= order.split(" ");
		    	
		    		int n01= Integer.parseInt(oArray[0]);
		    		int n02= Integer.parseInt(oArray[2]);
		    	   	
		    	
					if(oArray[1].equals("+")) {
						Add add= new Add();
						add.setValue(n01, n02);
						System.out.println(">> "+add.calculate());			
					}
					
					else if(oArray[1].equals("-")) {
						Sub sub= new Sub();
						sub.setValue(n01, n02);
						System.out.println(">> "+sub.calculate());			
					}
					
					else if(oArray[1].equals("*")) {
						Mul mul= new Mul();
						mul.setValue(n01, n02);
						System.out.println(">> "+mul.calculate());				
					}
					
					else if(oArray[1].equals("/")) {
						Div div= new Div();
						div.setValue(n01, n02);
						System.out.println(">> "+div.calculate());	
					}
					else {
						System.out.println("알 수 없는 연산입니다.");
					}
    			}
    		}
    		catch(NumberFormatException e) {
    			System.out.println("유효하지 않은 명령어 입니다.");
    		}
    	}   	
    	sc.close();
    }
}
