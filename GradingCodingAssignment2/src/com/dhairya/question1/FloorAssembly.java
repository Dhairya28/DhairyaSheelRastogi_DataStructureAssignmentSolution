package com.dhairya.question1;

import java.util.Scanner;

public class FloorAssembly {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the total no of floors in the building");
	        int noOfFloor = sc.nextInt();

	        int arr[] = new int[noOfFloor+1];

	        for (int i = 1; i <= noOfFloor; i++) {
	            System.out.println("enter the floor size given on day : " + i );
	            int floorSize = sc.nextInt();
	            arr[floorSize] = i;
	        }
	        int j = noOfFloor;

	        System.out.println("The order of construction is as follows");
	        for (int i = 1; i <= noOfFloor; i++) {
	            System.out.println("Day:" + i);
	            while (j >= 1 && arr[j] <= i) {
	                System.out.print(j + " ");
	                j--;
	            }
	            System.out.println(); 
	        }
	}

}
