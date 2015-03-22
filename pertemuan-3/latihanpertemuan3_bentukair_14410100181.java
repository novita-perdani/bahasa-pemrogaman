import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan3_bentukair_14410100181 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Masukkan temperatur air : ");
		int temp_air = input.nextInt();
		String bentuk_air=" ";
		
		System.out.println("=================== OUTPUT ===================");

		if ((temp_air>=-50)&&(temp_air<0))
			bentuk_air="padat";
			else if ((temp_air>=0)&&(temp_air<=100))
			bentuk_air="cair";
			else 
				bentuk_air="gas";
		
		System.out.println("Temperatur air : " + temp_air);
		System.out.println("Bentuk air: " + bentuk_air);
		
	 }
}