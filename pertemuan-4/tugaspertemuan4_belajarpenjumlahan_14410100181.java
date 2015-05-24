import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan4_belajarpenjumlahan_14410100181 {
	 public static void main(String args[]) {
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("=================== INPUT ===================");
		 System.out.print("Masukkan jumlah soal random : "); int n=input.nextInt();
		 
		 int nilai=0;
		 int i=1;
		 int jawab=0;
		 double hasil=0;
		 double a=0;
		 double b=0;
		
		 while (i<=n){
			System.out.println();
			System.out.println("------------------- SOAL "+i+ " ------------------- ");			 
			a = Math.floor(10 * Math.random()); 
			b = Math.floor(10 * Math.random());
			System.out.print(a+" + "+b+" = ");
			jawab = input.nextInt();
			hasil = a + b;
				if (jawab == hasil){
					nilai = nilai + 10;
				}
			System.out.println("Jawaban yang Anda Masukan"+" = "+jawab);
			System.out.println(a+" + "+b+" = "+hasil);
			i++;
			
		 }
		 System.out.println();
		 System.out.println("=================== NILAI ===================");
		 System.out.println("Nilai Anda"+" = "+nilai);
		 
	 }
}