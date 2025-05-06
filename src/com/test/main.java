package com.test;
import java.util.*;
public class main {

	public static void main(String[] args) {
		System.out.println("What you want to print for n times type that string");
		String message=sc.next();
		System.out.println("How Many Times");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println(message);
		}
	}

}
