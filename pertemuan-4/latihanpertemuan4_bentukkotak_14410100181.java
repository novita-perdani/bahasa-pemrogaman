import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan4_bentukkotak_14410100181 {
	 public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("=================== INPUT ===================");
		 System.out.print("Masukkan jumlah bintang : ");
		 int n = input.nextInt();

		 System.out.println();
		 System.out.println("=================== OUTPUT ===================");
		 
		 for (int i=0; i<n; i++) {
			 for (int j=0; j<n; j++){
				 //System.out.print("*");
				 if (i==0|i==n-1|j==0|j==n-1){
					 System.out.print("*");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			System.out.println();
		 }
	 
	 }
}