import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan2_bonuskaos_14410100181 {
	 public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int total; // memakai integer agar saat hasilnya koma, dibulatkan kebawah
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Masukkan Jumlah Kaos : ");
		int jml_kaos = input.nextInt();

       	System.out.print("Masukkan Peraturan Dapat Bonus : ");
		int rule_bonus = input.nextInt();
		
		System.out.print("Masukkan Jumlah Bonus : ");
		int bonus = input.nextInt();
		
		System.out.println("=================== OUTPUT ===================");
		if(jml_kaos % rule_bonus == 0){
			total = jml_kaos + (jml_kaos/rule_bonus);
		}
		else{
			total = jml_kaos + ((jml_kaos-1)/rule_bonus);
		}
		System.out.println("Total Kaos :" + total);
	 }
}