import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan2_hargabayarkaos_14410100181 {
	 public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int bayar; // memakai integer agar saat hasilnya koma, dibulatkan kebawah
		int gratis;
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Masukkan Jumlah Kaos : ");
		int jml_kaos = input.nextInt();

       	System.out.print("Masukkan Peraturan Dapat Bonus : ");
		int rule_bonus = input.nextInt();
		
		System.out.print("Masukkan Jumlah Bonus : ");
		int bonus = input.nextInt();
		
		System.out.println("=================== OUTPUT ===================");
		gratis = jml_kaos / (rule_bonus + bonus);
		bayar  = jml_kaos - gratis;
		
		System.out.println("Total yang Gratis : " + gratis);
		System.out.println("Total yang Bayar : " + bayar);
		System.out.println("----------------------------- +");
		System.out.println("Total Kaos          : " + bayar);
	 }
}