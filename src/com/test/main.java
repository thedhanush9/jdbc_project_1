package com.test;
import java.util.*;
public class main {

	public static void main(String[] args) {
		System.out.println("Printing Square");
		for(int i = 0 ; i < 6 ; i++){
			for(int j = 0 ; j < 6 ; j++){
				if(i==0 || j==0 || i==5 || j==5){
					System.out.print(" * ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
