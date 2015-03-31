import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan5_tebakgambar_14410100181 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double [] arrayData;
		int jumlah_gambar = 0;
		int jumlah_angka = 0;
		
		System.out.println("=================== INPUT ====================");
		System.out.print("Masukkan Banyaknya lemparan : ");
		int panjang = input.nextInt();
		arrayData = new double[panjang];
		
		for(int i=0;i<panjang;i++){
			arrayData[i] = Math.random(); 
			if (arrayData[i]>=0.5){
				jumlah_gambar++;	//atau jumlah_gambar = jumlah_gambar + 1;
				System.out.println("Lemparan ke - "+ i +" = gambar");
			}	else {
					jumlah_angka++;		//atau jumlah_angka = jumlah_angka + 1;
					System.out.println("Lemparan ke - "+ i +" = angka");
				}
		}
		
		System.out.println();
		System.out.println("=================== OUTPUT ====================");
		System.out.println("Jumlah gambar yang muncul : " +jumlah_gambar);
		System.out.println("Jumlah angka yang muncul : " +jumlah_angka);
		System.out.println();
		
		if (jumlah_angka>jumlah_gambar) {
			System.out.println("Pemenangnya adalah --> angka");
		} 
			else if (jumlah_angka<jumlah_gambar) {
				System.out.println("Pemenangnya adalah --> gambar");
			} 
				else {
					System.out.println("Hasil permainan --> DRAW");
				}
					
	
	 }
}