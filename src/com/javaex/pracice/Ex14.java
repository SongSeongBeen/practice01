package com.javaex.pracice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("가로를 입력하세요: ");
		double width = sc.nextDouble();
		sc.nextLine();         //하나 더 써줘서 개행문자 넘기기
		System.out.print("세로를 입력하세요: ");
		double height = sc.nextDouble();
		
		
		System.out.print("사각형의 넓이는 "+width*height);
		System.out.print("사각형의 둘레는 "+(width+height)*2);
		
		sc.close();
	}

}