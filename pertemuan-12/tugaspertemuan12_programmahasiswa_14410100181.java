import java.lang.System.*;
import java.util.Scanner;

/*
NOVITA PERDANI  - 14410100181
*/


public class tugaspertemuan12_programmahasiswa_14410100181 {
	
	
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
	
	
	public static String cariByNim(String [][] mahasiswa, String cari){
		int i = 0; 
		int j = 0;
		String ketemu = "kosong";
		for (i=0; i<mahasiswa.length; i++) {
			if (mahasiswa[i][0].equalsIgnoreCase(cari)) {
				ketemu = i+""; // jika di temukan, di ambil nilai indexnya
			}
		}
		return ketemu;
	}
	
	
	public static String [][] filterNama(String [][] data_nama, String cari) {
			int counter = 0;
			for(int i=0;i<data_nama.length;i++) {
				if(data_nama[i][1].contains(cari)) {
					counter++;
				}
			}
			String[][] arr = new String[counter][2];
			counter = 0;
			for(int j=0; j<data_nama.length; j++) {		
				if(data_nama[j][1].contains(cari)) {
					arr[counter][0]=data_nama[j][0];
					arr[counter][1]=data_nama[j][1];
					counter++;
				}
			}
		return arr;
	}
	
	
	public static String [][] filterAngkatan(String [][] data_nama, String cari) {
			int counter = 0;
			for(int i=0;i<data_nama.length;i++) {
				counter++;
			}
			String[][] arr = new String[counter][2];
			counter = 0;
			for(int i=0;i<data_nama.length;i++) {		
				if(data_nama[i][0].substring(0,2).equalsIgnoreCase(cari.substring(2,4))) { 
					arr[counter][0]=data_nama[i][0];
					arr[counter][1]=data_nama[i][1];
					counter++;
				}
			}
		return arr;
	}
	
	
	public static void update(String [][] mahasiswa, String nim, String nama) {	
		String index_update = cariByNim(mahasiswa,nim); // cari nilai index array sesuai nim yang di tentukan
		if(index_update!= "kosong"){
			int index = Integer.parseInt(index_update);
			mahasiswa[index][1] = nama;
			print(mahasiswa);
		}else{
			System.out.println("Tidak ada Data yang di update sesuai NIM :" + nim);
			
		}
	}
	
	
	public static void delete(String [][] mahasiswa, String nim) {
		String index_update = cariByNim(mahasiswa,nim); // cari nilai index array sesuai nim yang di tentukan
		int index_akhir     = mahasiswa.length - 1;
		int i				= 0;
		if(index_update!= "kosong"){
			String [][] temp = new String [index_akhir][index_akhir]; 
			int index = Integer.parseInt(index_update);
			for(int j=0; j<mahasiswa.length; j++) {
				if(j != index){
					i = j;
					if (j>index){
						i = j-1;
					}
					temp[i][0] = mahasiswa[j][0];
					temp[i][1] = mahasiswa[j][1];
				}
			}
			mahasiswa = temp;
			print(mahasiswa);
		}else{
			System.out.println("Tidak ada Data yang di delete sesuai NIM :" + nim);
			
		}
	}
	
	
	public static String [][] add(String [][] mahasiswa, String nim, String nama) {
		int index_akhir = mahasiswa.length - 1;
			mahasiswa[index_akhir][0] = nim;
			mahasiswa[index_akhir][1] = nama;
		return mahasiswa;
	}
	
	
	public static void print(String [][] mahasiswa) {	
		for(int j=0;j<mahasiswa.length;j++) {
			System.out.println("----------------------------------");
			System.out.println("NIM : " + mahasiswa[j][0]);
			System.out.println("NAMA : " + mahasiswa[j][1]);
		}
	}
	
	
	public static void main(String args[]) { 
		Scanner input = new Scanner(System.in);
		int pilihan = 0;
		do {
			 System.out.println();
			 System.out.println("==========================");
			 System.out.println("  PROGRAM DATA MAHASISWA  ");
			 System.out.println("==========================");
			 System.out.println("1. Search data mahasiswa by nim");
			 System.out.println("2. Filter data mahasiswa by nama");
			 System.out.println("3. Filter data mahasiswa perangkatan");
			 System.out.println("4. Delete data mahasiswa by nim");
			 System.out.println("5. Update data mahasiswa by nim");
			 System.out.println("6. Add data mahasiswa");
			 System.out.println("7. Selesai");
			 System.out.println("==========================");
			 System.out.print("Masukkan pilihan [1-7] : ");
			 pilihan = input.nextInt();
			 input.nextLine();
			 System.out.println();
			switch (pilihan) {
				case 1 : 		
						System.out.println("================== Search Data Mahasiswa ===================");
						System.out.print("Inputkan Nim : "); String nim_cari = input.nextLine();
						System.out.println("-------------------------------------------------");
						if(cariByNim(daftarMhs,nim_cari)!="kosong"){
							System.out.println("NIM " +nim_cari+ " KETEMU");
						}else{
							System.out.println("NIM " +nim_cari+ " TIDAK KETEMU");
						} 
						break;
				case 2 : 
						System.out.println("============= Filter Data Mahasiswa by Nama ================");
						System.out.print("Inputkan Nama : "); String nama_filter = input.nextLine();
						System.out.println("-------------------------------------------------");
						String [][] hasilFilterNama = filterNama(daftarMhs,nama_filter);
						for(int i=0;i<hasilFilterNama.length;i++) {	
							if(hasilFilterNama[i]!=null){
								System.out.println(hasilFilterNama[i][0]+ " | " +hasilFilterNama[i][1]);
							}
						}
						break;
				case 3 : 
						System.out.println("========== Filter Data Mahasiswa by per Angkatan ===========");
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
						break;
				case 4 : 
						System.out.println("================== Delete Data Mahasiswa ===================");
						System.out.print("Inputkan Nim : "); String nim_delete = input.nextLine();
						delete(daftarMhs,nim_delete);
						break;
				case 5 : 
						System.out.println("================== Update Data Mahasiswa ===================");
						System.out.print("Inputkan Nim : "); String nim_update = input.nextLine();
						System.out.print("Inputkan Nama : "); String nama_update = input.nextLine();
						update(daftarMhs,nim_update,nama_update);
						break;
				case 6 : 
						System.out.println("=================== Add Data Mahasiswa =====================");
						System.out.print("Inputkan Nim : "); String nim = input.nextLine();
						System.out.print("Inputkan Nama : "); String nama = input.nextLine();
						print(add(daftarMhs,nim,nama));
						break;
				case 7: 
						System.exit(0);
						break;
			}	
		}
		while (pilihan<7);
	}
	
	
	
	
}