import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan4_penjumlahanbilrandom_14410100181 {
	 public static void main(String args[]) {
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("=================== INPUT ===================");
		 System.out.print("Masukkan jumlah bilangan random : ");
		 
		 int n=input.nextInt();
		 int i=0;
		 double hasil=0;
		 double hasil_random=0;

		
		 while (i<n){
			hasil_random = Math.floor(10 * Math.random());
			System.out.println("Bilangan random : " +  hasil_random);
			hasil = hasil + hasil_random;
			i++;
		 }
		 System.out.println();
		 System.out.println("=================== OUTPUT ===================");
		 System.out.print("Total jumlah bilangan random : " + hasil);
		 
	 
	 }
}