import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan3_perkalian_14410100181 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int count=0;
		int hasil=0;
		String faktorial = "" ;
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Masukkan nilai a : ");
		int a = input.nextInt();
		System.out.print("Masukkan nilai b : ");
		int b = input.nextInt();
		
		System.out.println("=================== OUTPUT ===================");
		
		while(count<b){
			hasil = hasil + a;
			if(count==(b-1)){		
				faktorial = faktorial + a ;
			}else{	
				faktorial = faktorial + a + " + " ;
			}
			count++;
			//System.out.println(faktorial);
			//System.out.println(count);
		}
		
		System.out.println("Nilai " +a+ " x " +b+ " = " +faktorial+ " : " +hasil );
		
	 }
}