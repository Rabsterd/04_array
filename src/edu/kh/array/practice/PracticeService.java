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
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input % 2 == 0 || input < 3) {
			System.out.println("다시 입력하세요.");
			System.out.println("정수 : ");
			int input = sc.nextInt();
		} else {
			
		}
	}
}
