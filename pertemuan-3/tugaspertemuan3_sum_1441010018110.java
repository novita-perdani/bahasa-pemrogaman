import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan3_sum_1441010018110 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int count=0;
		int sum=0;
		int max=0;
		int min=999;
		double avg=0;
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Masukkan Jumlah Data : ");
		int jml_data = input.nextInt();
		
		System.out.println("=================== OUTPUT ===================");
		while(count<jml_data){
			System.out.print("Masukkan Nilai : ");
			int nilai_data = input.nextInt();
			sum = sum + nilai_data;
			
			if (nilai_data>max) {
				max = nilai_data;
			}
			if (nilai_data<min) {
				min = nilai_data;
			}
			count++;
		}
		
		avg = sum / (double)jml_data;
		
		System.out.println("Nilai sum :" + sum);
		System.out.println("Nilai avg :" + avg);
		System.out.println("Nilai min :" + min);
		System.out.println("Nilai max :" + max);
	 }
}