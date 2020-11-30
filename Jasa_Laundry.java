import java.util.Scanner;
import java.util.*;
public class Jasa_Laundry{
    public static void main(String[] args){
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                      PROGRAM JASA LAUNDRY");
        System.out.println("          ---HANYA TERSEDIA UNTUK DAERAH JADETABEK---");
		System.out.println("                     Dibuat oleh Kelompok 7");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Scanner input = new Scanner(System.in);

        System.out.println("MASUKKAN DATA DIRI ANDA");
        System.out.print("NAMA : ");
        String nama = input.nextLine();
        System.out.print("KOTA ASAL : ");
		String kota_Asal = input.nextLine();
		System.out.print("ALAMAT TEMPAT TINGGAL : ");
        String alamat = input.nextLine();
        String gratisOngkir ="";
        if(kota_Asal.equalsIgnoreCase("JAKARTA PUSAT") || kota_Asal.equalsIgnoreCase("JAKARTA BARAT")
             || kota_Asal.equalsIgnoreCase("JAKARTA TIMUR") || kota_Asal.equalsIgnoreCase("JAKARTA UTARA")
              || kota_Asal.equalsIgnoreCase("JAKARTA SELATAN") || kota_Asal.equalsIgnoreCase("DEPOK")
               || kota_Asal.equalsIgnoreCase("TANGGERANG SELATAN")  || kota_Asal.equalsIgnoreCase("TANGGERANG")
                || kota_Asal.equalsIgnoreCase("BEKASI BARAT")  || kota_Asal.equalsIgnoreCase("BEKASI UTARA")
                 || kota_Asal.equalsIgnoreCase("BEKASI SELATAN") || kota_Asal.equalsIgnoreCase("BEKASI TIMUR")
                  || kota_Asal.equalsIgnoreCase("BEKASI") || kota_Asal.equalsIgnoreCase("JAKARTA")){
            gratisOngkir = "-----SELAMAT ANDA MENDAPATKAN GRATIS ONGKIR-----";
            System.out.println("");
            System.out.println("JENIS PAKET ");
            System.out.println("1. Express ");
            System.out.println("2. Reguler ");
            System.out.print("PILIH JENIS PAKET : ");
            String jenis_Paket = input.nextLine();
            String pilihan_jenis_Paket="";
            int harga_paket=0;
            switch (jenis_Paket) {
                case "1":
                    pilihan_jenis_Paket="Express";
                    harga_paket = 15000;
                    break;
                case "2":
                    pilihan_jenis_Paket="Reguler";
                    harga_paket = 7000;
                break;
            }
            System.out.println("");
            String yes = "y";
            String pilih_kembali = "";
            String[] macam_pakaian = new String[20];
            int a = 1;
            int b = 0;
            int harga_perpakaian=0;
            int hagra_jumlah_pakaian = 0;
            do {
                System.out.println("JENIS PAKAIAN ");
                System.out.println("1. Blus (Blouse)");
                System.out.println("2. Jas (Jacket)");
                System.out.println("3. Kemeja (Shirt)");
                System.out.println("4. Rok (Skirt)");
                System.out.println("5. Mantel (Coat)");
                System.out.println("6. Gaun (Dress)");
                System.out.println("7. Rompi (Vest)");
                System.out.println("8. Celana (Pant)");
                System.out.println("9. Celana Terusan (Jump Suite)");
                System.out.print("PILIH JENIS PAKAIAN : ");
                String jenis_Pakaian = input.nextLine();
                String pilihan_jenis_Pakaian="";
                    switch (jenis_Pakaian) {
                        case "1":
                            pilihan_jenis_Pakaian="Blus (Blouse)";
                            harga_perpakaian = 18500;
                        break;
                        case "2":
                            pilihan_jenis_Pakaian="Jas (Jacket)";
                            harga_perpakaian = 72000;
                        break;
                        case "3":
                            pilihan_jenis_Pakaian="Kemeja (Shirt)";
                            harga_perpakaian = 14500;
                        break;
                        case "4":
                            pilihan_jenis_Pakaian="Rok (Skirt)";
                            harga_perpakaian = 21000;
                        break;
                        case "5":
                            pilihan_jenis_Pakaian="Mantel (Coat)";
                            harga_perpakaian = 27500;
                        break;
                        case "6":
                            pilihan_jenis_Pakaian="Gaun (Dress)";
                            harga_perpakaian = 124000;
                        break;
                        case "7":
                            pilihan_jenis_Pakaian="Rompi (Vest)";
                            harga_perpakaian = 72000;
                        break;
                        case "8":
                            pilihan_jenis_Pakaian="Celana (Pant)";
                            harga_perpakaian = 14500;
                        break;
                        case "9":
                            pilihan_jenis_Pakaian="Celana Terusan (Jump Suite)";
                            harga_perpakaian = 40000;
                        break;
                    }
                    for (int i = b; i < a ; i++) {
                      macam_pakaian[i] = pilihan_jenis_Pakaian;
                      hagra_jumlah_pakaian+=harga_perpakaian;
                    }
                    System.out.println("");
                    System.out.print("Pilih jenis pakaian kembali (y/n)?");
                    pilih_kembali = input.nextLine();
                    b++;
                    a++;
            }
            while (pilih_kembali.equalsIgnoreCase(yes)); 
            System.out.println("");
            
            System.out.print("MASUKKAN BERAT PAKAIAN DALAM SATUAN (KG) : ");
            String berat = input.nextLine();
            String dapat_diskon = "";
            int diskon = 0;
            int harga_kiloan = 0;
            for(int i = 0; i < Integer.parseInt(berat) ; i++){
                harga_kiloan+=harga_paket;
            }
            if(Integer.parseInt(berat) > 5){
                diskon = (hagra_jumlah_pakaian * 10)/100;
                diskon = hagra_jumlah_pakaian - diskon + harga_kiloan;
                dapat_diskon = "---------SELAMAT ANDA MENDAPATKAN DISKON--------";
            }else{
                diskon = hagra_jumlah_pakaian + harga_kiloan;
            }

            System.out.println("\n------------------------------------------------");
            System.out.println("-----------------DITAIL PESANAN-----------------");
            System.out.println("");
            System.out.println("NAMA : "+nama);
            System.out.println("KOTA ASAL : "+kota_Asal);
            System.out.println("ALAMAT TEMPAT TINGGAL : "+alamat);
            System.out.println("JENIS PAKET : "+pilihan_jenis_Paket);
            System.out.println("JENIS PAKAIAN : ");
            for (int i = 0; i < b ; i++) {
                System.out.println((i+1)+". "+macam_pakaian[i]);
            }
            System.out.println("BERAT PAKAIAN DALAM SATUAN (KG) : "+berat);
            System.out.println("");
            System.out.println(dapat_diskon);
            System.out.println(gratisOngkir);
            
            System.out.println("");
            System.out.println("TOTAL HARGA : " + diskon);
            System.out.println("\n------------------------------------------------");
            System.out.print("Lanjut ke pembayaran (y/n)?");
            String lanjut_Pembayaran = input.nextLine();

            if(lanjut_Pembayaran.equalsIgnoreCase("y")){
                System.out.println("Pilih Metode Pembayaran:");
                System.out.println("1. Tunai");
                System.out.println("2. Debit");
                System.out.print("PILIH METODE PEMBAYARAN : ");
                String jenis_Pembayaran = input.nextLine();
                switch (jenis_Pembayaran) {
                    case "1":
                        System.out.println("SILAHKAN MELAKUKAN PEMBAYARAN MELALUI KURIR");
                        System.out.println("--------------BARANG DIANTAR--------------");
                        break;
                
                    case "2":
                        System.out.println("PEMBAYARAN SEDANG DI PROSES---------------");
                        System.out.println("--------------BARANG DIANTAR--------------");
                        break;
                }
            }
        }else{
            System.out.println("\n--------------------------------------------------");
            System.out.println("-----MAAF JASA LAUNDRY TIDAK TERSEDIA DI KOTAMU-----");
            System.out.println("--------------------------------------------------\n");
        }


    }
}
