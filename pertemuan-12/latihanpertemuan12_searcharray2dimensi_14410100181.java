import java.lang.System.*;
import java.util.Scanner;

/*
NOVITA PERDANI  - 14410100181
*/


public class latihanpertemuan12_searcharray2dimensi_14410100181 {
	
	
	public static String [][] daftarMhs = { 
											{"08410100375","Purwanto"},
											{"10410100146","Noer Hidayat"},
											{"10410100162","Sandy Perdana"},
											{"11410100142","Himawan Pradipta Utama"},
											{"12410100049","Sujatmiko Hadinugroho"},
											{"12410100070","Denny Kusuma"},
											{"12410100088","Mochammad Afri Fitriansyah"},
											{"12410100131","Pradita Satria Prima"},
											{"12410100159","Fajriyan Nurli"},
											{"12410100160","Hazvi Fahlevi"},
											{"13410100006","Nico Stephanus Kuncoro"},
											{"13410100007","Ramdhani Kurniawan"},
											{"13410100048","Alanvianto Mukti Tamtomo"},
											{"13410100049","Satryo Widodo"},
											{"13410100058","Khamim Ahsanu Amala"},
											{"13410100060","Arfiansyah Agma"},
											{"13410100061","Candra Dwi Prasetya"},
											{"13410100069","Mohammad Rangga Nurcahyo"},
											{"13410100083","Raymond Andreas Soebijantoro"},
											{"13410100153","Dwiki Rizwan Nizar"},
											{"13410100155","Anggy Pranindya Sudarmadji"},
											{"13410100157","Wahyu Alfiyanda"},
											{"13410100180","Rayana Suryatama"},
											{"13410100190","Bryan Asril Zani"},
											{"13410100192","Eko Amiyantho"},
											{"13410100200","Kristin Lebdaningrum"},
											{"13410100206","RB. Nuriana Alim Putra"},
											{"13410100216","Sabdo Wicaksono Putra"},
											{"14410100170","Rizky Akbar"},
											{"14410100172","Abdul Haris"},
											{"14410100173","Ach Nofal Kurniawan"},
											{"14410100174","Andri Anggara"},
											{"14410100175","Auda Rizqi Aulany"},
											{"14410100176","Noppy Wahyono Suwoto"},
											{"14410100177","Arya Teja"},
											{"14410100178","Nuari Imas Masita"},
											{"14410100179","Afif Lutfian Fahmi Chudlori"},
											{"14410100181","Novita Perdani"},
											{"14410100182","Dheta Amelya Kurniawendy"}
										};
	
	
	public static boolean cariByNim(String [][] data_nim, String cari){
		int i = 0; 
		int j = 0;
		boolean ketemu = false;
		for (i=0; i<data_nim.length; i++) {
			for (j=0; j<data_nim[i].length; j++) {
				if (data_nim[i][0].equalsIgnoreCase(cari)) {
					ketemu = true;
				}
			}
		}
		return ketemu;
	}
  
  
	public static boolean cariByNama(String [][] data_nama, String cari2){   
		int k = 0; 
		int l = 0;
		boolean ketemu2 = false;
		for (k=0; k<data_nama.length; k++) {
			for (l=0; l<data_nama[k].length; l++) {
				if (data_nama[k][1].equalsIgnoreCase(cari2)) {
					ketemu2 = true;
				}
			}
		}
		return ketemu2;
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("=================== INPUT ===================");
		System.out.print("Inputkan Nim : "); String nim = input.nextLine();
		System.out.print("Inputkan Nama : "); String nama = input.nextLine();
		
		System.out.println();
		System.out.println("================== OUTPUT ===================");
		if(cariByNim(daftarMhs,nim)==true){
			System.out.println("NIM " +nim+ " KETEMU");
			}else{
				System.out.println("NIM " +nim+ " TIDAK KETEMU");
		}
		
		if(cariByNama(daftarMhs,nama)==true){
			System.out.println("NAMA " +nama+ " KETEMU");
			}else{
				System.out.println("NAMA " +nama+ " TIDAK KETEMU");
		}
		
	}
	 
	 
}