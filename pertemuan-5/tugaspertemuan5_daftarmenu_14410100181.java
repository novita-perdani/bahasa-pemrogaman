import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan5_daftarmenu_14410100181 {
	 public static void main(String args[]) {
		 
		Scanner input 			= new Scanner(System.in);
		String pilih 			= "Y";
		int [] pesan 			= new int[100];
		int [] jumlah 			= new int[100];
		String [] daftarmenu 	= {"Soto Ayam", "Soto Daging", "Rawon	", "Es Teh	", "Es Jeruk	"};
		int [] daftarharga 		= {10000, 9000, 8000, 2000, 1000};
		int j 					= 0;
		int bayar				= 0;
		
		System.out.println("DAFTAR MENU MAKANAN DAN MINUMAN");
		System.out.println("-----------------------------------------------");
		
		for(int i=0;i<daftarmenu.length;i++){
			System.out.println((i+1)+". "+daftarmenu[i]);
		}
		
		System.out.println();
		
		while(pilih.equals("Y") || pilih.equals("y")){
			System.out.print("Masukan Pilihan Anda [1-5] : ");
				pesan[j]=input.nextInt();
			System.out.print("--> Jumlah : ");
				jumlah[j]=input.nextInt();
			input.nextLine(); // DITANYAKAN
			System.out.println();
			System.out.print("Ingin Memilih Lagi [Y/T] : ");
				pilih=input.nextLine();
			j++;
		}
		
		System.out.println();
		System.out.println("============================ NOTA ============================");
	    System.out.println("NO|	MENU		|	HARGA	|	JUMLAH	|	TOTAL	|");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		for(int k=0;k<j;k++){
			int total = (jumlah[k]*daftarharga[pesan[k]-1]);
			bayar = bayar + total;
			System.out.println((k+1)+"  |	"+daftarmenu[pesan[k]-1]+"	|"+"	"+daftarharga[pesan[k]-1]+"	|	"+jumlah[k]+"	|"+"	"+total+"	|");
		}
		
		System.out.println("=============================================================");
		System.out.println("TOTAL BAYAR = " + bayar);
	
	 }
}