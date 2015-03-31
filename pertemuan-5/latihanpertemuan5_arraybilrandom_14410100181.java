import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan5_arraybilrandom_14410100181 {
	 public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int [] arrayData;
		int sum=0;
		int max=0;
		int min=999;
		double avg=0;
		
		System.out.println("=================== INPUT ====================");
		System.out.print("Masukkan Jumlah Bilangan Random : ");
		int panjang = input.nextInt();
		arrayData = new int[panjang];
		
		for(int i=0;i<panjang;i++){
			arrayData[i] = (int)(10 * Math.random());
		}
		
		System.out.println();
		System.out.println("================== OUTPUT ===================");
		System.out.println("---------------------------------- Nilai Array ------------------------------");
		for(int j=0; j<panjang; j++){
			System.out.println("Nilai Array Index ke - "+ j +" = " + arrayData[j]);
			/*for(int k=1; k<panjang; k++){
			System.out.println("*" + arrayData[j]); } */
			sum = sum + arrayData[j];
			if (arrayData[j]>max) {
				max = arrayData[j];
			}
			if (arrayData[j]<min) {
				min = arrayData[j];
			}
		}
		avg = sum / panjang;
		
		System.out.println();
		System.out.println("=========== Nilai Min, Max, Sum, Avg =============");
		System.out.println("Nilai sum = " + sum);
		System.out.println("Nilai avg = " + avg);
		System.out.println("Nilai min = " + min);
		System.out.println("Nilai max = " + max);
		
	
	 }
}