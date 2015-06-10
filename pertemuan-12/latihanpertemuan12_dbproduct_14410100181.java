import java.lang.System.*;
import java.util.Scanner;

/*
NOVITA PERDANI  - 14410100181
*/



public class latihanpertemuan12_dbproduct_14410100181 {
	
	
	public static String []FIELD = {"ID","Produsen","Nama Barang","Harga"};
	
	
	public static String [][]tblHerbal = {
											{"ADW01","Ad Dawa' Product","Kapsul Minyak Ikan Salmon isi 50 Softgel","40000"},
											{"ADW02","Ad Dawa' Product","Kapsul Serbuk Ashitaba Herbal (Seledri Jepang)","40000"},
											{"ADI01","Adas Indo Nusa","KAMIL 3in1 (Habbatussauda, Zaitun, Propolis) 70 kapsul","50000"},
											{"ADI02","Adas Indo Nusa","kamil 3in1 isi 200 kapsul","95000"},
											{"ADI03","Adas Indo Nusa","Kapsul Minyak Habbatussauda' Kamil isi 70","45000"},
											{"ADI04","Adas Indo Nusa","Kapsul Minyak Ikan KAMIL (Fish Oil + Omega 3)","90000"},
											{"ADI05","Adas Indo Nusa","Kapsul Minyak Zaitun KAMIL isi 70","40000"},
											{"ADI06","Adas Indo Nusa","Kapsul Serbuk Kamil Habbatussauda 70 Kapsul","25000"},
											{"ADI07","Adas Indo Nusa","Minyak Zaitun KAMIL 100 ml","25000"},
											{"ADR01","Addawa Research","Madu Kaliandra 300ml Addawa","43000"},
											{"ADR02","Addawa Research","Madu Kaliandra 700ml Addawa","77000"},
											{"ADR03","Addawa Research","Madu Randu 1Kg Addawa","100000"},
											{"AFI01","Afiah","Bedak Dingin Sari Bengkoang","12000"},
											{"AFI02","Afiah","Minyak Bulus Asli Kalimantan Kemasan Roll On","15000"},
											{"AGS01","Agaricus Sido Makmur Sentosa","Agadro NODIBET","120000"},
											{"AWL01","Al-Waliy","Madu Amandel For Kids Al-Waliy","30000"},
											{"ALW02","Al-Waliy","Madu Batuk Dewasa Al-Waliy","25000"},
											{"AWL02","Al-Waliy","Madu Batuk For Kids Al-Waliy","25000"},
											{"ALW03","Al-Waliy","STOP Ngompol For Kids Al-Waliy","25000"},
											{"AMR01","Al Amir (Spain)","Minyak Zaitun Al Amir 175ml (Import)","40000"},
											{"AMR02","Al Amir (Spain)","Minyak Zaitun Extra Virgin Al Amir 250ml","60000"},
											{"BAR01","Al Barokah","Jamu Madu Habbatussauda Al-Barokah (Quality has a name)","100000"},
											{"BIR01","Al Biruni Herbals","Albibet Al Biruni (Diabetes/Kencing Manis)","59000"},
											{"BIR02","Al Biruni Herbals","AlbiKoles Al Biruni (Kolesterol)","59000"},
											{"BIR03","Al Biruni Herbals","Albimor Al Biruni (Membunuh Kanker dan Tumor)","73000"},
											{"BIR04","Al Biruni Herbals","Albirmaag/Herba Maag 50K Al Biruni","59000"},
											{"BIR05","Al Biruni Herbals","Albistrok (Membantu Memulihkan Stroke)","73000"},
											{"BIR06","Al Biruni Herbals","Bloody Cleanser Al Biruni (Detoksifikasi Racun Tubuh)","80000"},
											{"BIR07","Al Biruni Herbals","Cing Cing Al Biruni (thypus, demam tinggi, stroke, jantung)","80000"},
											{"BIR08","Al Biruni Herbals","Herba Gurah Jumbo Al Biruni/Albiguraa Jumbo","59000"},
											{"BIR09","Al Biruni Herbals","Herba Gurah Pot Al Biruni (Albiguraa 18 Kapsul)","31000"},
											{"BIR10","Al Biruni Herbals","Herba Gurah Reguler Al Biruni (Albiguraa 25 kapsul)","36000"},
											{"BIR11","Al Biruni Herbals","Herba Gurah Yunior Al Biruni (Albirugaa Untuk Anak)","36000"},
											{"BIR12","Al Biruni Herbals","Herba Maag/AlbirMag Al Biruni","36000"},
											{"BIR13","Al Biruni Herbals","HerbaSam 50K Al Biruni","59000"},
											{"BIR14","Al Biruni Herbals","HerbaSlim Al Biruni","59000"},
											{"BIR15","Al Biruni Herbals","HerbaTensi Al Biruni (Hipertensi/Darah Tinggi)","59000"},
											{"DHB01","Al Dhahabiyah","Serbuk Kurma Al Dhahabiyah (kesuburan)","75000"},
											{"HJZ01","Al Hijaz","Kapsul Minyak Habbatussauda' Al Hijaz Isi 100","60000"},
											{"HJZ02","Al Hijaz","Kapsul Minyak Habbatussauda' Al Hijaz Isi 200","110000"},
											{"HJZ03","Al Hijaz","Kapsul Minyak Habbatussauda' Al Hijaz Isi 60","40000"},
											{"KIA01","Al Kautsar Inti 'Afiyah","Air Hajar Sa'adah/Jahannam Mesir 3ml Al Kautsar","65000"},
											{"KIA02","Al Kautsar Inti 'Afiyah","BILQIS CREAM (Pemutih Ketiak dan Selangkangan)","55000"},
											{"KIA03","Al Kautsar Inti 'Afiyah","Breast Up Cream (Pengencang Payudara)","85000"},
											{"KIA04","Al Kautsar Inti 'Afiyah","Ekstrak Tribulus Gold Terrestris","50000"},
											{"KIA05","Al Kautsar Inti 'Afiyah","Hajar Sa'adah Black Stone With Aroma Teraphy","90000"},
											{"KIA06","Al Kautsar Inti 'Afiyah","Herbal Axilla (Penghilang Bau Badan)","35000"},
											{"KIA07","Al Kautsar Inti 'Afiyah","Humairo Cream Nature","35000"},
											{"KIA08","Al Kautsar Inti 'Afiyah","Kopi Sulthon 7in1 (Kopinya Keluarga Harmonis)","100000"},
											{"KIA09","Al Kautsar Inti 'Afiyah","Ladies Whitening Cream (Pemutih Wajah dan Leher)","45000"},
											{"KIA10","Al Kautsar Inti 'Afiyah","Long Big Enlargement X Nature Oil 6 ml","200000"},
											{"KIA11","Al Kautsar Inti 'Afiyah","Minyak Bulus Al Kautsar","25000"},
											{"KIA12","Al Kautsar Inti 'Afiyah","Minyak Bulus Plus Al Kautsar","30000"},
											{"KIA13","Al Kautsar Inti 'Afiyah","Minyak Gosok Sumbawa Asli","50000"},
											{"KIA14","Al Kautsar Inti 'Afiyah","Permanent Penis Enlargement (Natural Oil)","120000"},
											{"KIA15","Al Kautsar Inti 'Afiyah","Pil Manjakani (Female Solution)","95000"},
											{"KIA16","Al Kautsar Inti 'Afiyah","Squalene Cream (Cerahkan Kulit Wajah)","35000"},
											{"KIA17","Al Kautsar Inti 'Afiyah","Tongkat Gurah Vagina Super (TGV Super)","75000"},
											{"KOD01","Al Khodry","Madu Hitam Sumbawa Al Khodry","75000"},
											{"KOD02","Al Khodry","Minyak Kemiri Premium Al Khodry","25000"},
											{"MNR01","Al Manar Herbafit","Afiafit","60000"},
											{"MNR02","Al Manar Herbafit","Madu Randu 0.5kg Al-Manar","40000"},
											{"MUS01","Al Muslim","Siwak Basah Import Al-Muslim","12000"},
											{"RHP01","Al Rehap Saudi","Minyak Wangi Al Rehab Roll On 3 ml (Import Saudi)","15000"},
											{"SFA01","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 1kg","180000"},
											{"SFA02","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 125gr","30000"},
											{"SFA03","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 250gr","60000"},
											{"SFA04","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 500gr","90000"},
											{"AWD01","Al Wadey","Kapsul Herbal Daun Bidara AL WADEY","30000"},
											{"AWD02","Al Wadey","Kapsul Minyak Habbatussauda isi 70 Al Wadey","50000"},
											{"AWD03","Al Wadey","Madu Anak dan Balita Al Wadey","58000"},
											{"AWD04","Al Wadey","Madu Anak dan Balita Al Wadey 1kg","110000"},
											{"AWD05","Al Wadey","Madu Bunga Durian Al Wadey 0.5kg","58000"},
											{"AWD06","Al Wadey","Madu Bunga Durian Al Wadey 1kg","110000"},
											{"AWD07","Al Wadey","Madu Bunga Karet Al Wadey 0.5kg","55000"},
											{"AWD08","Al Wadey","Madu Bunga Karet Al Wadey 1Kg","103000"},
											{"AWD09","Al Wadey","Madu Bunga Kelengkeng Al Wadey 0.5kg","69000"},
											{"AWD10","Al Wadey","Madu Bunga Kelengkeng Al Wadey 1kg","132000"},
											{"AWD11","Al Wadey","Madu Bunga Mangga Plus Al Wadey 0.5kg","60000"},
											{"AWD12","Al Wadey","Madu Bunga Mete Al Wadey 0.5kg","60000"},
											{"AWD13","Al Wadey","Madu Bunga Rambutan Al Wadey 0,5kg","62000"},
											{"AWD14","Al Wadey","Madu Bunga Rambutan Al Wadey 1kg","118000"},
											{"AWD15","Al Wadey","Madu Bunga Randu Plus Al Wadey 0.5kg","66000"},
											{"AWD16","Al Wadey","Madu Bunga Randu Plus Al Wadey 1kg","125000"},
											{"AWD17","Al Wadey","Madu Hutan Liar Al Wadey 0,5kg","45000"},
											{"AWD18","Al Wadey","Madu Hutan Liar Al Wadey 1kg","85000"},
											{"AWD19","Al Wadey","Madu Hutan Super Al Wadey 0.5kg","53000"},
											{"AWD20","Al Wadey","Madu Hutan Super Al Wadey 1kg","100000"},
											{"AWD21","Al Wadey","Madu Ibu Hamil dan Menyusui 0.5kg","58000"},
											{"AWD22","Al Wadey","Madu Ibu Hamil dan Menyusui 1kg","110000"},
											{"AWD23","Al Wadey","Madu Kaliandra Plus Al Wadey 0.5kg","62000"},
											{"AWD24","Al Wadey","Madu Kaliandra Plus Al Wadey 1kg","118000"},
											{"AWD25","Al Wadey","Madu Kesuburan Al Wadey","38000"},
											{"AWD26","Al Wadey","Madu Kuat Lelaki Al Wadey","38000"},
											{"AWD27","Al Wadey","Madu Obat Batuk Al Wadey","26000"},
											{"AWD28","Al Wadey","Madu Penurun Panas Al Wadey","26000"},
											{"AWD29","Al Wadey","Ramuan Madu Asam Urat AL WADEY","26000"},
											{"AWD30","Al Wadey","Ramuan Madu Lambung  AL WADEY","26000"},
											{"ASA01","Al-Afiat Sehat Alami","Madu Bugar Kunyit Asam Al-Afiat","30000"},
											{"ASA02","Al-Afiat Sehat Alami","Madu Bugar Rosella Manggis Al-Afiat","40000"},
											{"ASA03","Al-Afiat Sehat Alami","Sirup Gurah Anak dan Dewasa Rasa MINT 75ml","30000"},
											{"ASA04","Al-Afiat Sehat Alami","Sirup Gurah untuk Anak dan Dewasa 125ml","50000"},
											{"ASA05","Al-Afiat Sehat Alami","Sirup Gurah untuk Anak dan Dewasa 75ml","30000"},
											{"ASA06","Al-Afiat Sehat Alami","Sirup Gurah Untuk Anak dan Dewasa Rasa MINT 125ml","50000"},
											{"ASA07","Alam Subur Manjur","PIL PASDA (Panas Dalam)","15000"},
											{"ASA08","Alam Subur Manjur","Salep Kulit Multiguna Cap Guci Pusaka","16000"},
											{"AGH01","Al-Ghuroba'","Al Mu'arris 250 gr (Madu+Zaitun+Habbatussauda+Herba Vitalitas)","45000"},
											{"AGH02","Al-Ghuroba'","Cream Zaitun Al-Ghuroba'","16000"},
											{"AGH03","Al-Ghuroba'","Kapsul Bee Pollen Al Ghuroba","35000"},
											{"AGH04","Al-Ghuroba'","Madu Alami Ad-Dawa' Bunga Kelengkeng 0.5kg Al Ghuroba","48000"},
											{"AGH05","Al-Ghuroba'","Madu Alami Ad-Dawa' Bunga Kelengkeng 1kg Al Ghuroba","80000"},
											{"AGH06","Al-Ghuroba'","Madu Alami Ad-Dawa' Bunga Mangga 0,5kg Al Ghuroba","45000"},
											{"AGH07","Al-Ghuroba'","Madu Alami Ad-Dawa' Bunga Mangga 1kg Al Ghuroba","75000"},
											{"AGH08","Al-Ghuroba'","Madu Alami Al-Lu'Lu' Bunga Kopi 0,5kg Al Ghuroba","48000"},
											{"AGH09","Al-Ghuroba'","Madu Alami Al-Lu'Lu' Bunga Kopi 1kg Al Ghuroba","80000"},
											{"AGH10","Al-Ghuroba'","Madu Alami Salsabila Bunga Randu 0,5kg Al Ghuroba","45000"},
											{"AGH11","Al-Ghuroba'","Madu Alami Salsabila Bunga Randu 1kg Al Ghuroba","75000"},
											{"AGH12","Al-Ghuroba'","Madu Clever Child","32000"},
											{"AGH13","Al-Ghuroba'","Madu Hutan Belantara Riau al-Ghuroba' 0,5kg","48000"},
											{"AGH14","Al-Ghuroba'","Madu Hutan Belantara Riau Al-Ghuroba' 1kg","78000"},
											{"AGH15","Al-Ghuroba'","Madu Hutan Kalimantan al-Ghuroba' 0,5kg","43000"},
											{"AGH16","Al-Ghuroba'","Madu Hutan Kalimantan Al-Ghuroba' 1kg","63000"},
											{"AGH17","Al-Ghuroba'","Minyak Angin 25ml","10000"},
											{"AGH18","Al-Ghuroba'","Minyak Cengkih 25ml","20000"},
											{"AGH19","Al-Ghuroba'","Minyak Gondopuro 25ml","12000"},
											{"AGH20","Al-Ghuroba'","Minyak Habbatusauda' 30ml (Black Seed Oil)","25000"},
											{"AGH21","Al-Ghuroba'","Minyak Habbatussauda' 60ml (Black Seed Oil)","40000"},
											{"AGH22","Al-Ghuroba'","Minyak Kayu Putih Al Ghuroba' 150ml","50000"},
											{"AGH23","Al-Ghuroba'","Minyak Sereh 25ml","20000"},
											{"AGH24","Al-Ghuroba'","Minyak Zaitun Extra Virgin al-Ghuroba' 60ml","20000"},
											{"AGH25","Al-Ghuroba'","Sabun Herbal Bunga Melati Al Ghuroba'","7500"},
											{"AGH26","Al-Ghuroba'","Sabun Herbal Sirih Al Ghuroba'","7500"},
											{"AGH27","Al-Ghuroba'","Sari Kurma Mumtaz","35000"},
											{"AGH28","Al-Ghuroba'","Syifa' Fit 250gr (Madu+Zaitun+Habbatussauda+Black Seed Oi","42000"},
											{"AGH29","Al-Ghuroba'","Syifa' Fit Kapsul Al-Ghuroba' (Madu+Habbatussuda+zaitun)","40000"},
											{"BRU01","Al-Mabruroh By.Serba Alam","Eury-X (Madu Ginseng Pasak Bumi) Al Mabruroh","65000"},
											{"BRU02","Al-Mabruroh By.Serba Alam","Madu For Mama (Untuk Ibu Menyusui) Al Mabruroh","60000"},
											{"BRU03","Al-Mabruroh By.Serba Alam","Madu Ibu Hamil Al Mabruroh","55000"},
											{"BRU04","Al-Mabruroh By.Serba Alam","Madu Lebah Emas Bioflavonoid Al Mabruroh","60000"},
											{"BRU05","Al-Mabruroh By.Serba Alam","Madu Maag Al Mabruroh","55000"},
											{"BRU06","Al-Mabruroh By.Serba Alam","Madu Manggisa (Madu plus Ekstrak Manggis) Al Mabruroh","80000"},
											{"BRU07","Al-Mabruroh By.Serba Alam","Madu Penyubur Kandungan Al Mabruroh","75000"},
											{"BRU08","Al-Mabruroh By.Serba Alam","Madu SALAMI (Asam urat + Reumatik) Al Mabruroh","70000"},
											{"BRU09","Al-Mabruroh By.Serba Alam","COCOMAXI Santan Bubuk","6000"},
											{"QOW01","Al-Qowam","100 Dosa Yang Diremehkan Wanita","37000"},
											{"QOW02","Al-Qowam","Bekam Sunnah Nabi dan Mukjizat Medis","27000"},
											{"QOW03","Al-Qowam","Berbahagialah Sholat Anda Tak Sia-sia","14900"},
											{"QOW04","Al-Qowam","Bersedekahlah Maka Engkau Akan Kaya","23900"},
											{"QOW05","Al-Qowam","Fiqih Pengobatan Islami","35000"},
											{"QOW06","Al-Qowam","Haji Nabi (Sejak Berangkat dari Madinah Hingga Kembali, Seakan-a","18900"},
											{"QOW07","Al-Qowam","Ibadah Kurban","10900"},
											{"QOW08","Al-Qowam","Keajaiban Thibbun Nabawi","43000"},
											{"QOW09","Al-Qowam","Khasiat Kurma 'Ajwah (Makanan Sehat dan Obat Nabawi)","17000"},
											{"QOW10","Al-Qowam","Misteri Tamu Terakhir","17400"},
											{"QOW11","Al-Qowam","Muhasabah (Kiat-kiat Introspeksi Diri Seorang Muslim)","12400"},
											{"QOW12","Al-Qowam","Mukjizat Kesembuhan dalam Jintan Hitam, Madu, Bawang Putih dan B","14000"},
											{"QUB01","Al-Qubro Indonesia","Brazil Honey 500gr Al-Qubro","150000"},
											{"QUB02","Al-Qubro Indonesia","Madu Akasia 0.5kg A-Qubro","45000"},
											{"QUB03","Al-Qubro Indonesia","Madu Akasia 1kg A-Qubro","65000"},
											{"QUB04","Al-Qubro Indonesia","Madu Ambon 0,5kg Al Qubro","45000"},
											{"QUB05","Al-Qubro Indonesia","Madu Ambon 1kg Al Qubro","65000"},
											{"QUB06","Al-Qubro Indonesia","Madu Apel 0,5kg Al Qubro","45000"},
											{"QUB07","Al-Qubro Indonesia","Madu Apel 1kg Al Qubro","65000"},
											{"QUB08","Al-Qubro Indonesia","Madu Badui 0.5kg Al-Qubro","45000"},
											{"QUB09","Al-Qubro Indonesia","Madu Badui 1kg Al-Qubro","65000"},
											{"QUB10","Al-Qubro Indonesia","Madu Belimbing 0.5kg Al-Qubro","45000"},
											{"QUB11","Al-Qubro Indonesia","Madu Belimbing 1kg Al-Qubro","65000"},
											{"QUB12","Al-Qubro Indonesia","Madu Durian 0,5kg al qubro","45000"},
											{"QUB13","Al-Qubro Indonesia","Madu Durian 1kg Al Qubro","65000"},
											{"QUB14","Al-Qubro Indonesia","Madu Flores 0,5Kg Al-Qubro","45000"},
											{"QUB15","Al-Qubro Indonesia","Madu Flores 1kg Al-Qubro","65000"},
											{"QUB16","Al-Qubro Indonesia","Madu Gunung Mutis 0,5kg Al Qubro","45000"},
											{"QUB17","Al-Qubro Indonesia","Madu Gunung Mutis 1kg Al qubro","65000"},
											{"QUB18","Al-Qubro Indonesia","Madu Gurah Anak (MGA) Al-Qubro","35000"},
											{"QUB19","Al-Qubro Indonesia","Madu Gurah Dewasa Al-Qubro","45000"},
											{"QUB20","Al-Qubro Indonesia","Madu Hitam 0.5kg Al-Qubro","45000"},
											{"QUB21","Al-Qubro Indonesia","Madu Hitam 1kg Al-Qubro","65000"},
											{"QUB22","Al-Qubro Indonesia","Madu Hutan Riau 0.5kg Al-Qubro","45000"},
											{"QUB23","Al-Qubro Indonesia","Madu Hutan Riau 1kg Al-Qubro","65000"},
											{"QUB24","Al-Qubro Indonesia","Madu Jambi 0.5kg Al-Qubro","45000"},
											{"QUB25","Al-Qubro Indonesia","Madu Jambi 1kg Al-Qubro","65000"},
											{"QUB26","Al-Qubro Indonesia","Madu Jeruk 0.5kg Al-Qubro","45000"},
											{"QUB27","Al-Qubro Indonesia","Madu Jeruk 1kg Al-Qubro","65000"},
											{"QUB28","Al-Qubro Indonesia","Madu Kaliandra 0.5kg Al-Qubro","45000"},
											{"QUB29","Al-Qubro Indonesia","Madu Kaliandra Al-Qubro 1kg","65000"},
											{"QUB30","Al-Qubro Indonesia","Madu Kalimantan 0.5kg Al-Qubro","45000"},
											{"QUB31","Al-Qubro Indonesia","Madu Kalimantan 1kg Al-Qubro","65000"},
											{"QUB32","Al-Qubro Indonesia","Madu Kangkung 0.5kg Al-Qubro","45000"},
											{"QUB33","Al-Qubro Indonesia","Madu Kangkung 1kg Al-Qubro","65000"},
											{"QUB34","Al-Qubro Indonesia","Madu Karet 0.5kg Al-Qubro","45000"},
											{"QUB35","Al-Qubro Indonesia","Madu Karet 1kg Al-Qubro","65000"},
											{"QUB36","Al-Qubro Indonesia","Madu Kayu Putih 0.5kg Al-Qubro","45000"},
											{"QUB37","Al-Qubro Indonesia","Madu Kayu Putih 1kg Al-Qubro","65000"},
											{"QUB38","Al-Qubro Indonesia","Madu Kelengkeng 0.5kg Al-Qubro","45000"},
											{"QUB39","Al-Qubro Indonesia","Madu Kelengkeng 1kg Al-Qubro","65000"},
											{"QUB40","Al-Qubro Indonesia","Madu Kopi 0.5Kg Al-Qubro","45000"},
											{"QUB41","Al-Qubro Indonesia","Madu Kopi 1kg Al-Qubro","65000"},
											{"QUB42","Al-Qubro Indonesia","Madu Laban 0.5 Kg Al-Qubro","45000"},
											{"QUB43","Al-Qubro Indonesia","Madu Laban 1 Kg Al-Qubro","65000"},
											{"QUB44","Al-Qubro Indonesia","Madu Lanceng 0.5 Kg Al-Qubro","45000"},
											{"QUB45","Al-Qubro Indonesia","Madu Lanceng 1 Kg Qubro","65000"},
											{"QUB46","Al-Qubro Indonesia","Madu Leci 0.5 kg Al-Qubro","45000"},
											{"QUB47","Al-Qubro Indonesia","Madu Leci 1 kg Al-Qubro","65000"},
											{"QUB48","Al-Qubro Indonesia","Madu Mahoni 0,5 kg Al Qubro","45000"},
											{"QUB49","Al-Qubro Indonesia","Madu Mahoni 1 kg Al Qubro","65000"},
											{"QUB50","Al-Qubro Indonesia","Madu Mangga 0.5 Kg Al-Qubro","45000"},
											{"QUB51","Al-Qubro Indonesia","Madu Mangga 1 Kg Al-Qubro","65000"},
											{"QUB52","Al-Qubro Indonesia","Madu Mawar 0.5 Kg Al-Qubro","45000"},
											{"QUB53","Al-Qubro Indonesia","Madu Mawar 1 Kg Al-Qubro","65000"},
											{"QUB54","Al-Qubro Indonesia","Madu Mete 0,5 kg Al Qubro","45000"},
											{"QUB55","Al-Qubro Indonesia","Madu Mete 1 kg Al Qubro","65000"},
											{"QUB56","Al-Qubro Indonesia","Madu Multiflora 0,5 kg Al qubro","45000"},
											{"QUB57","Al-Qubro Indonesia","Madu Multiflora 1 kg Al qubro","65000"},
											{"QUB58","Al-Qubro Indonesia","Madu Pahit 0.5 kg Al-Qubro","45000"},
											{"QUB59","Al-Qubro Indonesia","Madu Pahit 1 kg Al-Qubro","65000"},
											{"QUB60","Al-Qubro Indonesia","Madu Palembang 0.5 kg Al-Qubro","45000"},
											{"QUB61","Al-Qubro Indonesia","Madu Palembang 1 kg Al-Qubro","65000"},
											{"QUB62","Al-Qubro Indonesia","Madu Pollen 0,5 Kg Al-Qubro","45000"},
											{"QUB63","Al-Qubro Indonesia","Madu Pollen 1 Kg Al-Qubro","65000"},
											{"QUB64","Al-Qubro Indonesia","Madu Putih 0.5 Kg Al-Qubro","45000"},
											{"QUB65","Al-Qubro Indonesia","Madu Putih 1 kg Al-Qubro","65000"},
											{"QUB66","Al-Qubro Indonesia","Madu Rambutan 0,5 kg l Qubro","45000"},
											{"QUB67","Al-Qubro Indonesia","Madu Rambutan 1 kg Al Qubro","65000"},
											{"QUB68","Al-Qubro Indonesia","Madu Rami 0.5 Kg Al-Qubro","45000"},
											{"QUB69","Al-Qubro Indonesia","Madu Rami 1 Kg Al-Qubro","65000"},
											{"QUB70","Al-Qubro Indonesia","Madu Randu 0.5 kg Al-Qubro","45000"},
											{"QUB71","Al-Qubro Indonesia","Madu Randu 1 kg Al-Qubro","65000"},
											{"QUB72","Al-Qubro Indonesia","Madu Rosella 0.5 Kg Al-Qubro","45000"},
											{"QUB73","Al-Qubro Indonesia","Madu Rosella 1 Kg Al-Qubro","65000"},
											{"QUB74","Al-Qubro Indonesia","Madu Royal Honey 350 gram Al-Qubro","60000"},
											{"QUB75","Al-Qubro Indonesia","Madu Sarang 0,5 kg Al-Qubro","85000"},
											{"QUB76","Al-Qubro Indonesia","Madu Sarang 1 kg Al-Qubro","120000"},
											{"QUB77","Al-Qubro Indonesia","Madu Sengon 0,5 Kg Al-Qubro","45000"},
											{"QUB78","Al-Qubro Indonesia","Madu Sengon 1 Kg Al-Qubro","65000"},
											{"QUB79","Al-Qubro Indonesia","Madu Songkeling 0.5 Kg Al-Qubro","45000"},
											{"QUB80","Al-Qubro Indonesia","Madu Songkeling 1 Kg Al-Qubro","65000"},
											{"QUB81","Al-Qubro Indonesia","Madu Stroberi 0.5 kg Al-Qubro","45000"},
											{"QUB82","Al-Qubro Indonesia","Madu Stroberi 1 kg Al-Qubro","65000"},
											{"QUB83","Al-Qubro Indonesia","Madu Sumbawa 0,5 Kg Al-Qubro","45000"},
											{"QUB84","Al-Qubro Indonesia","Madu Sumbawa 1 Kg Al-Qubro","65000"},
											{"QUB85","Al-Qubro Indonesia","Madu Tawon Gong 0,5 kg Al Qubro","45000"},
											{"QUB86","Al-Qubro Indonesia","Madu Tawon Gong 1 kg al qubro","65000"},
											{"SUL01","Alsultan Internasional","Bubuk Kaldu Ayam Non MSG Alsultan","15000"},
											{"SUL02","Alsultan Internasional","Bubuk Kaldu Sapi Non MSG Alsultan","15000"},
											{"SUL03","Alsultan Internasional","Bubuk Pengempuk Daging Alami Non MSG Alsultan","24000"},
											{"AMS01","Amal Mulia Sejahtera","Sari Kurma Al-Jazira","23500"},
											{"NHM01","An-Nawa Herba Mandiri","Gamat Gold 60 Kapsul An-Nawa Herba","70000"},
											{"NHM02","An-Nawa Herba Mandiri","Minyak Daun Sirsak Cytotoxic 100 Kapsul","55000"},
											{"NHM03","An-Nawa Herba Mandiri","Minyak Daun Sirsak Cytotoxic 200 Kapsul","100000"},
											{"NHM04","An-Nawa Herba Mandiri","Minyak Daun Sirsak Cytotoxic 60 Kapsul","40000"},
											{"NHM05","An-Nawa Herba Mandiri","Super Garlic Allium Sativum 60 Kapsul","40000"},
											{"BIY01","Arobiyan Herbal","Habbatussauda' Arobiyan 120 Kapsul","25000"},
											{"BIY02","Arobiyan Herbal","Habbatussauda' Arobiyan 210 Kapsul","40000"},
											{"BIY03","Arobiyan Herbal","Habbatussauda' Arobiyan 60 Kapsul","15000"},
											{"BIY04","Arobiyan Herbal","Kapsul Minyak Habbatussauda' Arobiyan isi 110","55000"},
											{"BIY05","Arobiyan Herbal","Kapsul Minyak Habbatussauda' Arobiyan isi 205","95000"},
											{"BIY06","Arobiyan Herbal","Kapsul Minyak Habbatussauda' Arobiyan isi 60","35000"},
											{"BIY07","Arobiyan Herbal","Kapsul Zaitun isi 110 Arobiyan Herbal","40000"},
											{"BIY08","Arobiyan Herbal","Kapsul Zaitun isi 60 Arobiyan Herbal","25000"},
											{"MAH01","As Salaamah","Sabun Cair Habbatussauda' As Salaamah 110 ml","20000"},
											{"MAH02","As Salaamah","Sabun Cair Madu plus Susu As Salaamah","22000"},
											{"MAH03","As Salaamah","Sabun Cair Rahasia As Salaamah 110 ml","24000"},
											{"MAH04","As Salaamah","Sabun Cair Zaitun As Salaamah","20000"},
											{"MAH05","As Salaamah","Sabun Habbatussauda' As Salaamah","8000"},
											{"MAH06","As Salaamah","Sabun Keset As-Salaamah","7000"},
											{"MAH07","As Salaamah","Sabun Madu Plus Susu As Salaamah","8000"},
											{"MAH08","As Salaamah","Sabun Mandi Cair Habbatussauda' As Salaamah 210 ml","35000"},
											{"MAH09","As Salaamah","Sabun Mandi Cair Madu Plus Susu As Salaamah 210 ml","38000"},
											{"MAH10","As Salaamah","Sabun Mandi Cair Rahasia As Salaamah 210 ml","40000"},
											{"MAH11","As Salaamah","Sabun Mandi Cair Zaitun As Salaamah 210 ml","35000"},
											{"MAH12","As Salaamah","Sabun Rahasia As-Salaamah","10000"},
											{"MAH13","As Salaamah","Sabun Zaitun As Salaamah","8000"},
											{"MAH14","As Salaamah","Shampo Zaitun As Salaamah","20000"}
										};

	
	public static boolean cariByKode(String [][] data_produk, String cari){
		int i = 0; 
		int j = 0;
		boolean ketemu = false;
		for (i=0; i<data_produk.length; i++) {
			for (j=0; j<data_produk[i].length; j++) {
				if (data_produk[i][0].equalsIgnoreCase(cari)) {
					ketemu = true;
				}
			}
		}
		return ketemu;
	}
	
	
	public static String [][] filterKode(String [][] produk_kode, String cari2) {
			int counter2 = 0;
			for(int i=0;i<produk_kode.length;i++) {
				if(produk_kode[i][0].contains(cari2)) {
					counter2++;
				}
			}
			String[][] arr2 = new String[counter2][3];
			counter2 = 0;
			for(int j=0;j<produk_kode.length;j++) {		
				if(produk_kode[j][0].contains(cari2)) {
					arr2[counter2][0]=produk_kode[j][1];
					arr2[counter2][1]=produk_kode[j][2];
					arr2[counter2][2]=produk_kode[j][3];
					counter2++;
				}
			}
		return arr2;
	}
	
	
	public static String [][] filterProdusen(String [][] produk_produsen, String cari2) {
			int counter2 = 0;
			for(int i=0;i<produk_produsen.length;i++) {
				if(produk_produsen[i][1].contains(cari2)) {
					counter2++;
				}
			}
			String[][] arr2 = new String[counter2][3];
			counter2 = 0;
			for(int j=0;j<produk_produsen.length;j++) {		
				if(produk_produsen[j][1].contains(cari2)) {
					arr2[counter2][0]=produk_produsen[j][1];
					arr2[counter2][1]=produk_produsen[j][2];
					arr2[counter2][2]=produk_produsen[j][3];
					counter2++;
				}
			}
		return arr2;
	}
	
	
	public static String [][] filterNama(String [][] produk_nama, String cari2) {
			int counter2 = 0;
			for(int i=0;i<produk_nama.length;i++) {
				if(produk_nama[i][2].contains(cari2)) {
					counter2++;
				}
			}
			String[][] arr2 = new String[counter2][3];
			counter2 = 0;
			for(int j=0;j<produk_nama.length;j++) {		
				if(produk_nama[j][2].contains(cari2)) {
					arr2[counter2][0]=produk_nama[j][1];
					arr2[counter2][1]=produk_nama[j][2];
					arr2[counter2][2]=produk_nama[j][3];
					counter2++;
				}
			}
		return arr2;
	}
	
	
	public static String [][] filterHarga(String [][] produk_harga, String cari2) {
			int counter2 = 0;
			for(int i=0;i<produk_harga.length;i++) {
				if(produk_harga[i][3].equals(cari2)) {
					counter2++;
				}
			}
			String[][] arr2 = new String[counter2][3];
			counter2 = 0;
			for(int j=0;j<produk_harga.length;j++) {		
				if(produk_harga[j][3].equals(cari2)) {
					arr2[counter2][0]=produk_harga[j][1];
					arr2[counter2][1]=produk_harga[j][2];
					arr2[counter2][2]=produk_harga[j][3];
					counter2++;
				}
			}
		return arr2;
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int pilihan = 0 ;
		do {
			 System.out.println();
			 System.out.println("===========================");
			 System.out.println("  PROGRAM DATABASE PRODUK  ");
			 System.out.println("===========================");
			 System.out.println("1. Search data produk per kode");
			 System.out.println("2. Filter data produk per kode");
			 System.out.println("3. Filter data produk per produsen");
			 System.out.println("4. Filter data produk per nama produk");
			 System.out.println("5. Filter data produk per harga");
			 System.out.println("6. Selesai");
			 System.out.println("==========================");
			 System.out.print("Masukkan pilihan [1-5] : ");
			 pilihan = input.nextInt();
			 input.nextLine();
			 System.out.println();
			switch (pilihan) {
				case 1 : 		
						System.out.println("=============== Search Produk per Kode ===============");
						System.out.print("Inputkan kode produk : "); String kode_cari = input.nextLine();
						System.out.println("------------------------------------------------------");
						if(cariByKode(tblHerbal,kode_cari)==true){
							System.out.println("KODE " +kode_cari+ " KETEMU");
						}else{
							System.out.println("KODE " +kode_cari+ " TIDAK KETEMU");
						}
						break;
				case 2 : 
						System.out.println("============== Filter Produk per Kode ================");
						System.out.print("Inputkan kode produk : "); String filter_kode = input.nextLine();
						System.out.println("------------------------------------------------------");
						String [][] hasilFilterKode = filterKode(tblHerbal,filter_kode);
						for(int i=0;i<hasilFilterKode.length;i++) {	
							if(hasilFilterKode[i]!=null){
								System.out.println(hasilFilterKode[i][0]+ " | " +hasilFilterKode[i][1]+ " | " +hasilFilterKode[i][2]);
							}
						}
						break;
				case 3 : 
						System.out.println("============ Filter Produk per Produsen ==============");
						System.out.print("Inputkan nama produsen : "); String filter_produsen = input.nextLine();
						System.out.println("------------------------------------------------------");
						String [][] hasilFilterProdusen = filterProdusen(tblHerbal,filter_produsen);
						for(int i=0;i<hasilFilterProdusen.length;i++) {	
							if(hasilFilterProdusen[i]!=null){
								System.out.println(hasilFilterProdusen[i][0]+ " | " +hasilFilterProdusen[i][1]+ " | " +hasilFilterProdusen[i][2]);
							}
						}
						break;
				case 4 : 
						System.out.println("============== Filter Produk per Nama ================");
						System.out.print("Inputkan nama produk : "); String filter_nama = input.nextLine();
						System.out.println("------------------------------------------------------");
						String [][] hasilFilterNama = filterNama(tblHerbal,filter_nama);
						for(int i=0;i<hasilFilterNama.length;i++) {	
							if(hasilFilterNama[i]!=null){
								System.out.println(hasilFilterNama[i][0]+ " | " +hasilFilterNama[i][1]+ " | " +hasilFilterNama[i][2]);
							}
						}
						break;
				case 5 : 
						System.out.println("============== Filter Produk per Harga ================");
						System.out.print("Inputkan harga produk : "); String filter_harga = input.nextLine();
						System.out.println("-------------------------------------------------------");
						String [][] hasilFilterHarga = filterHarga(tblHerbal,filter_harga);
						for(int i=0;i<hasilFilterHarga.length;i++) {	
							if(hasilFilterHarga[i]!=null){
								System.out.println(hasilFilterHarga[i][0]+ " | " +hasilFilterHarga[i][1]+ " | " +hasilFilterHarga[i][2]);
							}
						}
						break;
				case 6: 
						System.exit(0);
						break;
			}	
		}
		while (pilihan<6);
	 }
	 
	 
	 
	 
	 
}