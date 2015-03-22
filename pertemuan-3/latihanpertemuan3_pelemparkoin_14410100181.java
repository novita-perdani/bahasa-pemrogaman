import java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan3_pelemparkoin_14410100181 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Masukkan bilangan biner : ");
		int bil_user = input.nextInt();
		int bil_random = (int) Math.random();
		
		System.out.println();
		System.out.println("=================== OUTPUT ===================");
		System.out.println ("Bilangan random dari komputer : " +bil_random);
		
		if (bil_random>=0.5){
			bil_random=1;
			System.out.println ("Koin yang muncul --> gambar");
		}	else {
				bil_random=0;
				System.out.println ("Koin yang muncul --> angka");
			}
		
		
		if (bil_user==bil_random) {
			System.out.println ("Anda menang");
		}	else {
				System.out.println ("Anda kalah");
			}
		
		

		
	 }
}