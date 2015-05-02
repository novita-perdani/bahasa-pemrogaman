import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan7_daftarisi_14410100181 {
	 
	 public static int jmlbab() {
		 Scanner input = new Scanner(System.in);
		 System.out.println("=================== INPUT ===================");
		 System.out.print("Masukkan jumlah Bab : ");
		 int n = input.nextInt();
		 System.out.println();
		 return n;
	 }
	 
	 public static String [][] inputdaftarisi(int n) {
		 Scanner input = new Scanner(System.in);
		 String [][] data = new String [n][n];
		 for (int i=0; i<n; i++) {
			 System.out.print("Inputkan Judul : ");
			 data[i][0] = input.nextLine();
			 System.out.print("Inputkan Halaman : ");
			 data[i][1] = input.nextLine();
			 System.out.println("---------------------------------------------");
		 }
		 return data;
	 }
	 
	 public static String [][] showdaftarisi(String [][] data) {
		 System.out.println();
		 System.out.println("=================== DAFTAR ISI ===================");
		 for (int i=0; i<data.length; i++) {
			 System.out.println("Bab " + (i+1) + " : " + data[i][0] + " ............................... " + data[i][1]);
		 }
		 return data;
	 }
	 
	 public static void main(String args[]) {
		 int input = jmlbab() ;	
         String [][] data = inputdaftarisi(input);	
		 showdaftarisi(data);		
	 }
	 
}