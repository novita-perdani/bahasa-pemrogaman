import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

/*
OLEH : 
ANGGI PRANINDYA S.    - 13410100155
KRISTIN LEBDANINGRUM  - 13410100200
NOVITA PERDANI        - 14410100181
DHETA AMELYA K.       - 14410100182
*/

public class survey_gadget {
	 public static void main(String args[]) {

		int [][] gadget = {
			{1,0,1,0,0,0}, {0,1,1,0,0,0}, {0,1,0,0,0,0}, {0,1,0,0,0,0}, {0,1,1,0,0,0},
			{1,0,1,0,0,0}, {0,1,1,0,0,0}, {0,1,0,0,0,0}, {0,1,0,0,0,0}, {0,0,0,1,0,0},
			{1,0,1,0,0,0}, {0,1,0,0,0,0}, {0,1,1,0,0,0}, {1,1,0,0,0,0}, {0,0,0,1,0,0},
			{1,0,0,0,0,0}, {0,1,0,0,0,0}, {1,0,0,0,0,0}, {1,1,0,0,0,0}, {1,1,0,0,0,0},
			{1,0,0,0,0,0}, {0,0,0,1,0,0}, {1,0,0,0,0,0}, {0,0,0,1,0,0}, {0,0,1,0,0,0},
			{1,0,0,0,0,0}, {1,1,0,0,0,0}, {1,0,0,0,0,0}, {0,0,0,1,0,0}, {1,0,0,0,0,0},
			{1,0,1,0,0,0}, {1,0,0,0,0,0}, {0,0,1,0,0,0}, {0,0,0,1,0,0}, {0,1,0,0,0,0},
			{1,0,1,0,0,0}, {1,0,0,0,0,0}, {0,0,1,0,0,0}, {1,0,0,0,0,0}, {0,0,0,1,0,0},
			{1,0,1,0,0,0}, {1,0,0,0,0,0}, {0,0,1,0,0,0}, {0,1,0,0,0,0}, {0,0,0,1,0,0},
			{1,0,0,0,0,0}, {1,0,0,0,0,0}, {0,0,1,0,0,0}, {0,1,0,0,0,0}, {0,0,1,0,0,0}
		};
		
		String [] orang 	= {"Kristin", "Anggy", "Novita", "Dheta", "Galih",
								"Ario", "Danica", "Morin", "Benedik", "Putra",
								"Hanif", "Elmy", "Ainur", "Teghar", "Aditya", 
								"Ghifar","Daniel", "Cheva", "Malina", "Abu",
								"Zaki","Dicky", "Zain", "Mahardika", "Bella",
								"Rizal","Bryan", "Dodo", "Raymond", "Anita",
								"Erika","Aisyah", "Prasetya", "Fadlan", "Rendy",
								"Gege","Daus", "Bagus", "Putra", "Aries",
								"Rio","Imas", "Niemas", "Floura", "Pandji",
								"Afif","Hasan", "Hadi", "Agum", "Dewa"};
		
		int [] jml_gadget 	= new int[6];
		int persen			= 0;
		int tot_barang 		= 0;
		int sum_barang 		= 0;

		
		//TOTAL GADGET SEMUA ORANG
		for(int i=0; i<orang.length; i++){
			for (int j=0; j<gadget[i].length; j++) {
				tot_barang = tot_barang + gadget[i][j];
			}
		}

		System.out.println("Nama-Gadget	Android	Blacberry	IOS	Windows	Symbian	Lainnya	Tot-gadget");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		 
		//TAMPILKAN DATA
		for(int i=0; i<orang.length; i++){	//baris array --> berdasarkan gadget
			sum_barang 	= 0;
			System.out.print(orang[i]+"	");	//kolom array --> berdasarkan orang
			for (int j=0; j<gadget[i].length; j++) {
				System.out.print("	 "+gadget[i][j]);
				jml_gadget[j] = jml_gadget[j] + gadget[i][j];
				sum_barang = sum_barang + gadget[i][j];
			}
			System.out.print("	"+sum_barang);
			//System.out.print("		"+(100*sum_barang/tot_barang+"%"));
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("TOTAL GADGET : ");
				
		//TOTAL GADGET SEMUA ORANG
		for(int i=0; i<jml_gadget.length; i++){
				System.out.print("	 " +jml_gadget[i]);
		}
		
		System.out.println();
		//System.out.println("max : " +max);
		//System.out.println("min : " +min);



	 }
}