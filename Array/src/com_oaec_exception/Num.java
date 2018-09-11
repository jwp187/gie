package com_oaec_exception;

import java.util.Scanner;

public class Num {
	public static void main(String[] args) {
		Num num=new Num();
		num.num1();
	}
	void num1(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入a,b，如果a>=b，a,b互换；否则照常输出");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int temp;
		if(a>=b&&a!=0&&b!=0){
			  temp = a; 
			    a = b; 
			    b = temp;
			    System.out.println("Min"+a);
			    System.out.print("MAX"+b);
		}else if(a==0||b==0){
			System.out.println("0");
		}else{
			System.out.println("MAX"+a);
		    System.out.print("Min"+b);
		
	}
		
	}
		
}
