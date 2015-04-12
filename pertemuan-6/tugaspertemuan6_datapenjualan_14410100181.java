import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan6_datapenjualan_14410100181 {
	 public static void main(String args[]) {

		int [][]jml_brg = {
			{5,10,15,20,25,30},
			{3,6,9,12,15,18},
			{2,4,6,8,10,12},
			{1,2,3,4,5,6},
		};
		
		int []hrg_brg 		= {2000,5000,1000,500};
		String [] barang 	= {"Pensil 2B","Buku Tulis","Penggaris","Tipe ex"};
		int [] perhari 		= new int[6];
		int sum_barang 		= 0;
		int tot_harga  		= 0;
		int persen			= 0;
		int tot_barang 		= 0;
		int min				= 999;
		int max 			= 0;

		/*
		for (int i=0; i<data.length; i++) {
			int sum=0;
			for (int j=0; j<data[i].length; j++) {
				sum = sum + data[j][i];
			}
			//To display the sum
			System.out.println("The sum is : " +sum);
		}
		*/
		
		//TOTAL SELURUH BARANG
		for(int i=0; i<barang.length; i++){
			for (int j=0; j<jml_brg[i].length; j++) {
				tot_barang = tot_barang + jml_brg[i][j];
			}
		}

		System.out.println("Barang-hari	Senin	Selasa	Rabu	Kamis	Jumat	Sabtu	Hrg per-item	TOT BARANG	TOT HARGA	PROSENTASE	MIN	MAX");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		 
		//TAMPILKAN DATA PENJUALAN
		for(int i=0; i<barang.length; i++){	//baris array --> berdasarkan hari
			sum_barang 	= 0;
			min			= 999;
			max			= 0;
			System.out.print(barang[i]+"	");	//kolom array --> berdasarkan barang
			for (int j=0; j<jml_brg[i].length; j++) {
				System.out.print("	 "+jml_brg[i][j]);
				perhari[j] = perhari[j] + jml_brg[i][j];
				sum_barang = sum_barang + jml_brg[i][j];
				if (jml_brg[i][j]>max) {
					max = jml_brg[i][j];
				}
				if (jml_brg[i][j]<min) {
					min = jml_brg[i][j];
				}
			}
			System.out.print(" 	"+hrg_brg[i]);
			System.out.print("		 "+sum_barang);
			System.out.print("		 "+(sum_barang*hrg_brg[i]));
			System.out.print("		 "+(100*sum_barang/tot_barang+"%"));
			System.out.print("		 "+min);
			System.out.print("	 "+max);
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("TOTAL PER-HARI : ");
				
		//TOTAL PER-HARI
		for(int i=0; i<perhari.length; i++){
				System.out.print("	 "+perhari[i]);
			
		}
		
		System.out.println();
		//System.out.println("max : " +max);
		//System.out.println("min : " +min);



	 }
}