import java.lang.System.*;
import java.util.*;
import java.lang.Math;
import java.text.SimpleDateFormat;

/*
NOVITA PERDANI  - 14410100181
*/


public class projek_uas {
	
	
	
	public static String [][] data_transaksi = new String[10][10];	
	
	public static String [][] data_user = {
											{"novita","123456"},
											{"perdani","123456"}
										  };
										  
	public static String [][] master_barang = {
												{"BRG-001","Kampas kopling","80000","90000"},
												{"BRG-002","Relay starter","70000","80000"},
												{"BRG-003","Ring piston","70000","80000"},
												{"BRG-004","Rumah roller","50000","80000"},
												{"BRG-005","Saringan udara","30000","45000"}
                                              };
										
	
	
	public static void print_barang(String [][] data_barang) {	
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("KODE BARANG\t|"+"NAMA BARANG\t\t|"+"HARGA BELI\t|"+"HARGA JUAL\t|");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
		for(int j=0; j<data_barang.length; j++) {
			System.out.println(data_barang[j][0]+"\t\t|"+data_barang[j][1]+"\t\t|"+data_barang[j][2]+"\t\t|"+data_barang[j][3]+"\t\t|");
		}
        System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	
	
	public static String [][] cari_barang_by_nama(String [][] data_barang, String keyword) {
			int counter2 = 0;
			for(int i=0; i<data_barang.length; i++) {
				if(data_barang[i][1].contains(keyword)) {
					counter2++;
				}
			}
			String[][] arr2 = new String[counter2][4];
			counter2 = 0;
			for(int j=0;j<data_barang.length;j++) {		
				if(data_barang[j][1].contains(keyword)) {
					arr2[counter2][0]=data_barang[j][0];
					arr2[counter2][1]=data_barang[j][1];
					arr2[counter2][2]=data_barang[j][2];
                    arr2[counter2][3]=data_barang[j][3];
					counter2++;
				}
			}
		return arr2;
	}
	
    
	
    public static String [][] ambil_barang(String [][] data_barang, String keyword) {
            String[][] arr2 = new String[1][4];
			for(int i=0;i<data_barang.length;i++) {
				if(data_barang[i][0].equals(keyword)) {
                    arr2[0][0]=data_barang[i][0];
                    arr2[0][1]=data_barang[i][1];
                    arr2[0][2]=data_barang[i][2];
                    arr2[0][3]=data_barang[i][3];
				}
			}
		return arr2;
	}
	
	
	
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
     
	 
	
	public static String waktu(String format) {	
	    Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(cal.getTime());
	}
       
	   
	
    public static boolean kode_exist(String [][] arr, String targetValue) {
            if(arr[0][0] == null){
              return true;
            } else {      
                for(int i=0; i<arr.length; i++){ 
					if(arr[i][0] != null){
						if(arr[i][0].equals(targetValue)){
							return false;
						}
					}
                }
            return true;
            }      
    }
        
		
	
    public static String kode(String [][] transaksi) {	
            String kode;
            boolean cek;
            do {
					kode = waktu("ddMM")+"-"+randInt(1000,9999)+"-"+waktu("HHmmss");
					cek = kode_exist(transaksi,kode);
                }
            while (cek==false);
            return kode;
	}
     
	 
	
	public static void tambah_transaksi(String [][] transaksi, String id, String jam, String id_barang, String nama, String harga_beli, String harga_jual, int jumlah) {
        String [][] temp = new String [transaksi.length + 1][7];
        for (int i=0; i<transaksi.length; i++) {
            temp[i][0] = transaksi[i][0];
			temp[i][1] = transaksi[i][1];
			temp[i][2] = transaksi[i][2];
            temp[i][3] = transaksi[i][3];
            temp[i][4] = transaksi[i][4];
            temp[i][5] = transaksi[i][5];
            temp[i][6] = transaksi[i][6];
	    }
        temp[transaksi.length][0] = id;
        temp[transaksi.length][1] = jam;
        temp[transaksi.length][2] = id_barang;
        temp[transaksi.length][3] = nama;
        temp[transaksi.length][4] = harga_beli;
        temp[transaksi.length][5] = harga_jual;
        temp[transaksi.length][6] = jumlah+"";
        data_transaksi = temp;     
	}
	
	

    public static void transaksi(String [][] data_barang) {
            String no_transaksi = kode(data_transaksi);
            String jam          = waktu("dd-MM-yyyy HH:mm:ss");
            Scanner input = new Scanner(System.in);
            String pilih = "Y";
            String kode;
            int jumlah = 0;
            print_barang(data_barang);
	    while(pilih.equals("Y") || pilih.equals("y")){
                System.out.print("Masukan Kode Barang : ");
                kode                 = input.nextLine();                
                System.out.print("Masukan Jumlah Barang : ");
                jumlah               = input.nextInt();
                input.nextLine();
                String [][] barang   = ambil_barang(master_barang,kode);
				tambah_transaksi(data_transaksi,no_transaksi,jam,barang[0][0],barang[0][1],barang[0][2],barang[0][3],jumlah);
                System.out.print("Ingin Memilih Lagi [Y/T] : ");
				pilih=input.nextLine();
            }
           
	}
	
	

	public static String [] group_array_id_transaksi(String [][] data_transaksi){
		String[] arr2 	= new String[10];
		int counter		= 0;
		for(int z=0;z<data_transaksi.length;z++) {
			if(z==0){
				arr2[counter] = data_transaksi[z][0];
				counter++;
			}else{
				if(data_transaksi[z][0]!=data_transaksi[z-1][0]){
					arr2[counter] = data_transaksi[z][0];
					counter++;
				}
			}
            
		}
		return arr2;
		
	}
	
	
	
	public static void print_transaksi(String [][] transaksi){
		String [] group = group_array_id_transaksi(data_transaksi);
		int total		= 0;
		for(int i=0;i<group.length;i++){
			if(group[i]!=null){
				total = 0;
				System.out.println("ID Transaksi\t: "+group[i]);
				System.out.println("--------------------------------------------------------------------------------------------------------------");
				System.out.println("KODE BARANG\t|"+"NAMA BARANG\t\t|"+"HARGA\t|"+"JUMLAH\t|");
				System.out.println("--------------------------------------------------------------------------------------------------------------");
				for(int z=0;z<transaksi.length;z++) {
					if(transaksi[z][0]!=null){
						if(data_transaksi[z][0].equals(group[i])){
							System.out.println(transaksi[z][2]+"\t\t|"+transaksi[z][3]+"\t\t|"+transaksi[z][5]+"\t|"+transaksi[z][6]+"\t|");
							total = total + (Integer.parseInt(transaksi[z][5])*Integer.parseInt(transaksi[z][6]));
						}
					}
				}
				System.out.println("--------------------------------------------------------------------------------------------------------------");
				System.out.println("Total Penjualan\t: "+total);
				System.out.println();
			}
		}
		
	}
	
	
	
	public static void print_omset(String [][] transaksi){
		int total		= 0;
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("KODE BARANG\t|"+"NAMA BARANG\t\t|"+"HARGA\t|"+"JUMLAH\t|");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for(int z=0;z<transaksi.length;z++) {
			if(transaksi[z][0]!=null){
				System.out.println(transaksi[z][2]+"\t\t|"+transaksi[z][3]+"\t\t|"+transaksi[z][5]+"\t|"+transaksi[z][6]+"\t|");
				total = total + ((Integer.parseInt(transaksi[z][5])*Integer.parseInt(transaksi[z][6])) - (Integer.parseInt(transaksi[z][4])*Integer.parseInt(transaksi[z][6])));
						
			}
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Total Omset\t: "+total);
				
	}
	
	
     
	public static boolean login(String [][] data_user, String user, String password){
		int i = 0; 
		for (i=0; i<data_user.length; i++) {
			if (data_user[i][0].equalsIgnoreCase(user)) {
				if(data_user[i][1].equalsIgnoreCase(password)){	
					return true;
				}
			}
		}
		return false;
	}
 	
	
	
	public static String identikasi_barang(String [][] data_barang, String id_barang){
		int i = 0; 
		int j = 0;
		String ketemu = "kosong";
		for (i=0; i<data_barang.length; i++) {
			if (data_barang[i][0].equalsIgnoreCase(id_barang)) {
				ketemu = i+""; 
			}
		}
		return ketemu;
	}
	
	
	
	public static void tambah_barang(String [][] data_barang, String id_barang, String nama, String harga_beli, String harga_jual) {
        String [][] temp = new String [data_barang.length + 1][4];
        for (int i=0; i<data_barang.length; i++) {
            temp[i][0] = data_barang[i][0];
			temp[i][1] = data_barang[i][1];
			temp[i][2] = data_barang[i][2];
			temp[i][3] = data_barang[i][3];
	    }
	    temp[data_barang.length][0] = id_barang;
	    temp[data_barang.length][1] = nama;
	    temp[data_barang.length][2] = harga_beli;
        temp[data_barang.length][3] = harga_jual;
        master_barang = temp;
	    print_barang(master_barang);
	}
	
	

	public static void update_barang(String [][] data_barang, String id_barang, String nama, String harga_beli, String harga_jual) {	
		String index_update = identikasi_barang(data_barang,id_barang); 
		if(index_update!= "kosong"){
			int index = Integer.parseInt(index_update);
			master_barang[index][1] = nama;
			master_barang[index][2] = harga_beli;
            master_barang[index][3] = harga_jual;
			print_barang(master_barang);
		}else{
			System.out.println("Tidak ada Data yang di update sesuai ID Barang :" + id_barang);		
		}
	}
	
	
	
	public static void delete_barang(String [][] data_barang, String id_barang) {
		String index_update = identikasi_barang(data_barang,id_barang); // cari nilai index array sesuai id_barang yang di tentukan
		int index_akhir     = data_barang.length - 1;
		int i				= 0;
		if(index_update!= "kosong"){
			String [][] temp = new String [index_akhir][4]; 
			int index = Integer.parseInt(index_update);
			for(int j=0; j<data_barang.length; j++) {
				if(j != index){
					i = j;
					if (j>index){
						i = j-1;
					}
					temp[i][0] = data_barang[j][0];
					temp[i][1] = data_barang[j][1];
                                        temp[i][2] = data_barang[j][2];
					temp[i][3] = data_barang[j][3];
				}
			}
			master_barang = temp;
			print_barang(master_barang);
		}else{
			System.out.println("Tidak ada Data yang di delete sesuai id_barang :" + id_barang);
			
		}
	}
	
	
	
	
	
	
	
	public static void main(String args[]) { 
		Scanner input = new Scanner(System.in);
		String user;
		String password;
		boolean status_login;
		
		do {
			 
			 System.out.println();
			 System.out.println("=========================");
			 System.out.println("------------------ LOGIN ------------------");
			 System.out.println("=========================");
			 System.out.print("Username : "); user = input.nextLine();
			 System.out.print("Password : "); password = input.nextLine();
			 System.out.println("=========================");
			 System.out.println();
			 status_login = login(data_user,user,password);			
		}
		while (status_login==false);
		if(status_login==true){	
			System.out.println();
			System.out.println("+++++++ LOGIN BERHASIL +++++++");
			int pilihan = 0;
			do {
				 System.out.println();
				 System.out.println();
				 System.out.println("=========================");
				 System.out.println("------------------ MENU ------------------");
				 System.out.println("=========================");
				 System.out.println("1. Daftar Barang");
				 System.out.println("2. Pencarian Barang");
				 System.out.println("3. Tambah Data Barang");
				 System.out.println("4. Update Data Barang");
				 System.out.println("5. Hapus Data Barang");
				 System.out.println("6. Input Transaksi");
				 System.out.println("7. Cetak Nota Transaksi");
				 System.out.println("8. Cetak Omset");
				 System.out.println("9. Keluar");
				 System.out.println("=========================");
				 System.out.print("Masukkan pilihan [1-8] : ");
				 pilihan = input.nextInt();
				 input.nextLine(); //menghindari bug
				 System.out.println();
				 System.out.println();
				 switch (pilihan) {
					case 1 : 
							System.out.println("========================== Daftar Barang ==========================");
							print_barang(master_barang);
							break;
					case 2 : 
							System.out.println("========================= Pencarian Barang =========================");
							System.out.print("Inputkan nama barang : "); String keyword = input.nextLine();
							String [][] results = cari_barang_by_nama(master_barang,keyword);
							print_barang(results);
							break;
					case 3 : 
							System.out.println("======================== Tambah Data Barang ========================");
							System.out.print("Inputkan ID Barang : "); String id_barang = input.nextLine();
							System.out.print("Inputkan Nama Barang : "); String nama = input.nextLine();
							System.out.print("Inputkan Harga Beli : "); String harga_beli = input.nextLine();
							System.out.print("Inputkan Harga Jual : "); String harga_jual = input.nextLine();
							tambah_barang(master_barang,id_barang, nama, harga_beli, harga_jual);
							break;
					case 4 : 
							System.out.println("======================== Update Data Barang ========================");
							System.out.print("Inputkan ID Barang : "); String id_barang_update = input.nextLine();
							System.out.print("Inputkan Nama Barang Update : "); String nama_update = input.nextLine();
							System.out.print("Inputkan Harga Beli Update : "); String harga_beli_update = input.nextLine();
							System.out.print("Inputkan Harga Jual Update : "); String harga_jual_update = input.nextLine();
							update_barang(master_barang,id_barang_update, nama_update, harga_beli_update, harga_jual_update);
							break;
					case 5: 
							System.out.println("====================== Delete Data data_barang ======================");
							System.out.print("Inputkan ID Barang : "); String id_barang_delete = input.nextLine();
							delete_barang(master_barang,id_barang_delete);
							break;
					case 6: 
							System.out.println("======================== Transaksi Penjualan ========================");
							transaksi(master_barang);
							break;
					case 7: 
							System.out.println("=========================== Nota Penjualan ==========================");
							System.out.println();
							print_transaksi(data_transaksi);
							break;
					case 8: 
							System.out.println("========================== Omset Penjualan ==========================");
							print_omset(data_transaksi);
							break;
					case 9: 
							System.exit(0);
							break;
				}	
			}
			while (pilihan<9);
			
		}
	}
	
	
	
	
}