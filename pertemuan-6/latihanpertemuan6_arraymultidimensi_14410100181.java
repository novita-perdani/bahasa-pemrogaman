import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan6_arraymultidimensi_14410100181 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int [][]data = {
			{1,0,0,0,0,0},
			{0,1,0,0,0,0},
			{0,0,1,0,0,0},
			{0,0,0,1,0,0},
			{0,0,0,0,1,1},
			{0,0,0,0,1,1}
		};
				
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[i].length; j++) { 	
			System.out.print((data[j][i]==1) ? " # ":" . "); 	
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		int [][]data2 = {
			{1,0,0,0,0,0},
			{0,1,0,0,0,0},
			{0,0,1,0,0,0},
			{0,0,0,1,0,0},
			{0,0,0,0,1,1},
			{0,0,0,0,1,1}
		};
		
		for (int i=0; i<data2.length; i++) { 	
			for (int j=(data2[i].length-1); j>=0; j--) { 	//case 3
			System.out.print((data2[j][i]==1) ? " # ":" . ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/*-----------------------------------------------------------------------------------------------------------------------------------*/
		
		/*
		int [][]data2 = {
			{1,1,0,0,0,0},
			{1,1,0,0,0,0},
			{0,0,1,0,0,0},
			{0,0,0,1,0,0},
			{0,0,0,0,1,0},
			{0,0,0,0,0,1}
		};
		for (int i=0; i<data2.length; i++) {
			for (int j=0; j<data2[i].length; j++) { 	
			System.out.print((data2[i][j]==1) ? " # ":" . "); 	// operator ? untuk menentukan kondisi --> "jika benar" : "jika salah"
			}
			System.out.println();
		}
		System.out.println();
		
		
		int [][]data3 = {
			{0,0,0,0,1,1},
			{0,0,0,0,1,1},
			{0,0,0,1,0,0},
			{0,0,1,0,0,0},
			{0,1,0,0,0,0},
			{1,0,0,0,0,0}
		};
		for (int i=0; i<data3.length; i++) {
			for (int j=0; j<data3[i].length; j++) {
			System.out.print((data3[i][j]==1) ? " # ":" . ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		int [][]data4 = {
			{0,0,0,0,0,1},
			{0,0,0,0,0,1},
			{0,0,0,1,0,0},
			{0,0,1,0,0,0},
			{1,1,0,0,0,0},
			{1,1,0,0,0,0}
		};	
		for (int i=0; i<data4.length; i++) {
			for (int j=0; j<data4[i].length; j++) {
			System.out.print((data4[i][j]==1) ? " # ":" . ");
			}
			System.out.println();
		}
		*/
		
		
	 }
}