import java.lang.System.*;
import java.util.Scanner;

/*
NOVITA PERDANI  - 14410100181
*/


public class latihanpertemuan12_filterarray2dimensi_14410100181 {
	
	
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
	
	
	public static String [] filterNim(String [][] data_nim, String cari2) {
			int counter2 = 0;
			for(int i=0;i<data_nim.length;i++) {
				counter2++;
			}
			String[] arr2 = new String[counter2];
			counter2 = 0;
			for(int j=0;j<data_nim.length;j++) {		
				if(data_nim[j][0].contains(cari2)) {
					arr2[counter2]=data_nim[j][0];
					counter2++;
				}
			}
		return arr2;
	}
	
	
	public static String [] filterNama(String [][] data_nama, String cari) {
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
				if(data_nama[i][1].contains(cari)) {
					arr[counter]=data_nama[i][1];
					counter++;
				}
			}
		//5. return array of string
		return arr;
	}
	
	
	public static String [][] filterAngkatan(String [][] data_nama, String cari) {
		//1.Hitung jumlah data yang mengandung kata nama
			int counter = 0;
			for(int i=0;i<data_nama.length;i++) {
				counter++;
			}
		//2. buat array of string dengan panjang jumlah data pada langkah 1
			String[][] arr = new String[counter][2];
		//3. lakukan looping lagi untuk mengecel nama
			counter = 0;
			for(int i=0;i<data_nama.length;i++) {		
		//4. jika mengandung nama yang dicari
				if(data_nama[i][0].substring(0,2).equalsIgnoreCase(cari.substring(2,4))) {
					arr[counter][0]=data_nama[i][0];
					arr[counter][1]=data_nama[i][1];
					counter++;
				}
			}
		//5. return array of string
		return arr;
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("================== FILTER NIM ===================");
		System.out.print("Inputkan Nim : "); String nim = input.nextLine();
		System.out.println("-------------------------------------------------");
		String [] hasilFilterNim = filterNim(daftarMhs,nim);
		for(int i=0;i<hasilFilterNim.length;i++) {	
			if(hasilFilterNim[i]!=null){
				System.out.println(hasilFilterNim[i]);
			}
		}
		
		System.out.println();
		System.out.println("================= FILTER NAMA ===================");
		System.out.print("Inputkan Nama : "); String nama = input.nextLine();
		System.out.println("-------------------------------------------------");
		String [] hasilFilterNama = filterNama(daftarMhs,nama);
		for(int i=0;i<hasilFilterNama.length;i++) {	
			if(hasilFilterNama[i]!=null){
				System.out.println(hasilFilterNama[i]);
			}
		}
		
		System.out.println();
		System.out.println("================= FILTER ANGKATAN =================");
		System.out.print("Inputkan Angkatan : "); String angkatan = input.nextLine();
		System.out.println("-------------------------------------------------");
		String [][] hasilFilterAngkatan = filterAngkatan(daftarMhs,angkatan);
		for(int j=0;j<hasilFilterAngkatan.length;j++) {	
			if(hasilFilterAngkatan[j][0]!=null){
				System.out.println("NIM : " + hasilFilterAngkatan[j][0]);
				System.out.println("NAMA : " + hasilFilterAngkatan[j][1]);
				System.out.println();
			}
		}
		
	}
	 
	 
}