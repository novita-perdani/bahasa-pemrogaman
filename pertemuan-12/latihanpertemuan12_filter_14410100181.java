import java.lang.System.*;
import java.util.Scanner;

/*
NOVITA PERDANI  - 14410100181
*/


public class latihanpertemuan12_filter_14410100181 {
	
	
	public static String daftarNim[] = {"08410100375","10410100146","10410100162","11410100142","12410100049",
										"12410100070","12410100088","12410100131","12410100159","12410100160",
										"13410100006","13410100007","13410100048","13410100049","13410100058",
										"13410100060","13410100061","13410100069","13410100083","13410100153",
										"13410100155","13410100157","13410100180","13410100190","13410100192",
										"13410100200","13410100206","13410100216","14410100170","14410100172",
										"14410100173","14410100174","14410100175","14410100176","14410100177",
										"14410100178","14410100179","14410100181","14410100182"};
										
										
	public static String []daftarNama = {"Purwanto","Noer Hidayat","Sandy Perdana","Himawan Pradipta Utama","Sujatmiko Hadinugroho",
										 "Denny Kusuma","Mochammad Afri Fitriansyah","Pradita Satria Prima","Fajriyan Nurli","Hazvi Fahlevi",
										 "Nico Stephanus Kuncoro","Ramdhani Kurniawan","Alanvianto Mukti Tamtomo","Satryo Widodo","Khamim Ahsanu Amala",
										 "Arfiansyah Agma","Candra Dwi Prasetya","Mohammad Rangga Nurcahyo","Raymond Andreas Soebijantoro","Dwiki Rizwan Nizar",
										 "Anggy Pranindya Sudarmadji","Wahyu Alfiyanda","Rayana Suryatama","Bryan Asril Zani","Eko Amiyantho",
										 "Kristin Lebdaningrum","RB. Nuriana Alim Putra","Sabdo Wicaksono Putra","Rizky Akbar","Abdul Haris",
										 "Ach Nofal Kurniawan","Andri Anggara","Auda Rizqi Aulany","Noppy Wahyono Suwoto","Arya Teja",
										 "Nuari Imas Masita","Afif Lutfian Fahmi Chudlori","Novita Perdani","Dheta Amelya Kurniawendy"};
	

	public static String [] filterNama(String [] data_nama, String cari) {
		//1.Hitung jumlah data yang mengandung kata nama
			int counter = 0;
			for(int i=0;i<data_nama.length;i++) {
				counter++;
			}
		//2. buat array of string dengan panjang jumlah data pada langkah 1
			String[] arr = new String[counter];
		//3. lakukan looping lagi untuk mengecel nama
			counter = 0;
			for(int i=0;i<data_nama.length;i++) {		
		//4. jika mengandung nama yang dicari
				if(data_nama[i].contains(cari)) {
					arr[counter]=data_nama[i];
					counter++;
				}
			}
		//5. return array of string
		return arr;
	}
	
	
	public static String [] filterNim(String [] data_nim, String cari2) {
			int counter2 = 0;
			for(int i=0;i<data_nim.length;i++) {
				counter2++;
			}
			String[] arr2 = new String[counter2];
			counter2 = 0;
			for(int j=0;j<data_nim.length;j++) {		
				if(data_nim[j].contains(cari2)) {
					arr2[counter2]=data_nim[j];
					counter2++;
				}
			}
		return arr2;
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=================== INPUT ===================");
		System.out.print("Inputkan filter nama : "); String filter = input.nextLine();
		
		System.out.println("--------------------------------- OUTPUT ---------------------------------");
		String [] hasilFilterNama = filterNama(daftarNama,filter);
		for(int i=0;i<hasilFilterNama.length;i++) {	
			if(hasilFilterNama[i]!=null){
				System.out.println(hasilFilterNama[i]);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("=================== INPUT ===================");
		System.out.print("Inputkan filter angkatan : "); String filter2 = input.nextLine();
	
		System.out.println("--------------------------------- OUTPUT ---------------------------------");
		String [] hasilFilterNim = filterNim(daftarNim,filter2);
		for(int j=0;j<hasilFilterNim.length;j++) {	
			if(hasilFilterNim[j]!=null){
				System.out.println(hasilFilterNim[j]);
			}
		}
		
		
	 }
	 
	 
}