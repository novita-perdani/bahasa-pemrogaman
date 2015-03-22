import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan2_swapping_14410100181 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int c=0;
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Masukkan nilai a : ");
		int a = input.nextInt();
		System.out.print("Masukkan nilai b : ");
		int b = input.nextInt();
		
		System.out.println("=================== OUTPUT ===================");
		c=a;   //cara lain : a=a-b, b=b+a, a=b-a
		a=b;
		b=c;
		c=a;
		
		System.out.println("Nilai a : " + a);
		System.out.println("Nilai b : " + b);
		
	 }
}