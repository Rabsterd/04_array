package edu.kh.array.practice;

import java.util.Scanner;

public class PracticeService {
	public void practice1() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]  + " ");
			
			if(arr[i] % 2 == 1) {
				sum += arr[i];
		}
			
		}
		System.out.println(sum);
	}

	public void practice2() {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}			
		} 
		System.out.print(sum);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + " ");
		}
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();
			
			boolean flag = false;
			
			System.out.print("검색할 값 : ");
			int search = sc.nextInt();
			
			
				
				if(arr[i] == search) {
					System.out.println("인덱스 : " + i);
					
					flag = true;
				}
				
				if(!flag) {
					System.out.println("일치하는 값이 존재하지 않습니다.");
				}
			}
			
			
			
			
		
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		String str2 = sc.next();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = str.charAt(i);
		
		
		}
		
		
		
				
	}
	

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input % 2 == 0 || input < 3) {
			System.out.println("다시 입력하세요.");
			System.out.println("정수 : ");
			//int input = sc.nextInt();
		} else {
			
		}
	}
}
