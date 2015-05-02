import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

//NOVITA PERDANI - 14410100181

public class tugaspertemuan6_tiketpesawat_14410100181 {
	 public static void main(String args[]) { 
		 Scanner input = new Scanner(System.in);
		 
	
		 String [][]kursi = {
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."},
								{"*",".",".","IIIII","*",".","."}
							};
		 int pil 		= 0;
		 int ketemu		= 0;
		 int kelas 		= 0;
		 int vip 		= 0;
		 int bisnis 	= 0;
		 int ekonomi 	= 0;
		 String huruf   = "";
		 
		 
		 do {
			 System.out.println();
			 System.out.println("==========================");
			 System.out.println("PROGRAM PENJUALAN TIKET PESAWAT");
			 System.out.println("==========================");
			 System.out.println("1. Penjualan Tiket");
			 System.out.println("2. Daftar kursi kosong");
			 System.out.println("3. Daftar kursi isi");
			 System.out.println("4. Daftar semua kursi");
			 System.out.println("5. Total omset");
			 System.out.println("6. Exit");
			 System.out.println("--------------------------");
			 System.out.print("Masukkan pilihan [1-6] : ");
			 pil = input.nextInt();
			 System.out.println();
			 switch (pil) {
				case 1 : 
						ketemu = 0;
						System.out.println("1. VIP 		(Rp. 175.000)");
						System.out.println("2. BISNIS 		(Rp. 150.000)");
						System.out.println("3. EKONOMI 	(Rp. 100.000)");
						System.out.println("--------------------------");
						System.out.print("Pilih Kelas [1-3] : ");
						kelas = input.nextInt(); 
						for(int i=0; i<13; i++){ 
							for (int j=0; j<kursi[i].length; j++) { 
								if(kelas==1){ 
									if(i>=0 && i<=5){ 
										if(kursi[i][j]=="."){ 
											kursi[i][j] = "*";
											ketemu	= 1;
											break;
										}
									}
								}
								else if(kelas==2){ 
									if(i>=6 && i<=10){ 
										if(kursi[i][j]=="."){ 
											kursi[i][j] = "*";
											ketemu	= 1;
											break;
										}
									}
								}	
								else if(kelas==3){ 
									if(i>=11 && i<=12){ 
										if(kursi[i][j]=="."){ 
											kursi[i][j] = "*";
											ketemu	= 1;
											break;
										}
									}
								}								
							}
							if(ketemu == 1){break;} 
						}
						if(ketemu == 0){
							System.out.println("------------------------------------");
							System.out.println("Maaf, Kursi Sudah Terisi Semua...!!!");
							System.out.println("------------------------------------");
						}
						
					break;
				case 2 : 
						for(int i=0; i<13; i++){ 
							for (int j=0; j<kursi[i].length; j++) { 
								if(j==0){
									huruf = "A";
								}else if(j==1){
									huruf = "B";
								}else if(j==2){
									huruf = "C";
								}else if(j==4){
									huruf = "D";
								}else if(j==5){
									huruf = "E";
								}else if(j==6){
									huruf = "F";
								}
								if(kursi[i][j]=="."){
									System.out.print(huruf+"-"+i+" , ");
								}
							}
							System.out.println("");
						}
						break;
				case 3 : 
						for(int i=0; i<13; i++){ 
							for (int j=0; j<kursi[i].length; j++) { 
								if(j==0){
									huruf = "A";
								}else if(j==1){
									huruf = "B";
								}else if(j==2){
									huruf = "C";
								}else if(j==4){
									huruf = "D";
								}else if(j==5){
									huruf = "E";
								}else if(j==6){
									huruf = "F";
								}
								if(kursi[i][j]=="*"){
									System.out.print(huruf+"-"+i+" , ");
								}
							}
							System.out.println("");
						}
						break;
				case 4 : 
						for(int i=0; i<13; i++){ 
							if(i==0){
								System.out.println("	A	B	C		D	E	F");
								System.out.println("	--------------------------------------------------------------------------");
							}
							for (int j=0; j<kursi[i].length; j++) { 
								if(j==0){
								System.out.print(i+"	");
								}
								System.out.print(kursi[i][j] + "	");
							}
							System.out.println("");
						}
						break;
				case 5: 
						vip 		= 0;
						bisnis 		= 0;
						ekonomi 	= 0;
						for(int i=0; i<13; i++){ 
							for (int j=0; j<kursi[i].length; j++) { 					
								if(i>=0 && i<=5){ 
									if(kursi[i][j]=="*"){
										vip = vip + 175000; 
									}
								}else if(i>=6 && i<=10){ 
									if(kursi[i][j]=="*"){
										bisnis = bisnis + 150000; 
									}
								}else if(i>=11 && i<=12){ 
									if(kursi[i][j]=="*"){
										ekonomi = ekonomi + 100000; 
									}	
								}
							}
						}
						System.out.println("TOTAL OMSET :");
						System.out.println("VIP	: "+vip+" ( "+vip/175000+" Kursi )");
						System.out.println("Bisnis	: "+bisnis+" ( "+bisnis/150000+" Kursi )");
						System.out.println("Ekonomi	: "+ekonomi+"   ( "+ekonomi/100000+" Kursi )");
						System.out.println("------------------------ +");
						System.out.println("Total	: "+(vip+bisnis+ekonomi));
						break;
				case 6 :
						System.exit(0);
						break;
			 }
		 }
		 while (pil<6);
		 
		 
	 }
}