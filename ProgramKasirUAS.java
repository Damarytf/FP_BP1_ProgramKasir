
package programkasiruas;

import java.util.Scanner;
public class ProgramKasirUAS {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner barang = new Scanner(System.in);
        Scanner login = new Scanner(System.in);
        
        String data[]={"damar","294"};
        String username, password;
        System.out.println("|================================================|");
        System.out.println("|====================JANJI JIWA==================|");
        System.out.println("|======================KASIR=====================|");
        System.out.println("|================================================|");
        
        System.out.print("\nUsername \t: ");
        username = login.nextLine();
        System.out.print("Password \t: ");
        password = login.nextLine();
        
        if(username.equals(data[0])&&password.equals(data[1])){
            Scanner input = new Scanner(System.in);
            
            int pilihan;
            int ulang;
            do{
             System.out.println();
            System.out.println("===============Selamat Datang Di JANJI JIWA==============");
            System.out.println("=========Silahkan Pilih Menu Yang Ingin Dipesan===========");
            System.out.println();
            System.out.println("\n======================");
            System.out.println("| Menu :               |");
            System.out.println("| 1. Makanan           |");
            System.out.println("| 2. Minuman           |");
            System.out.println("| 3. Keluar            |");
            System.out.println("========================");
            
            int menu;
            System.out.print("\nSilahkan Masukkan Menu : ");
            menu = input.nextInt();
            
            switch(menu){
                case 1 :
                 //makanan
            System.out.println("\n=====================Makanan======================\n");
            System.out.println("| 1. Crispy Chicken Mentai: Rp33.000 (CCM)         |");
            System.out.println("| 2. Beef Truffle Mayo: Rp35.000 (BTM)             |");
            System.out.println("| 3. Double Cheese Hamburg: Rp35.000 (DCH)         |");
            System.out.println("| 4. Spicy Bulgogi: Rp33.000 (SB)                  |");
            System.out.println("| 5. Shrimp Tartar Mayo: Rp35.000 (STM)            |");
            System.out.println("| 6. Cheezy Crispy Chicken Mentai: Rp35.000 (CCCM) |");
            System.out.println("| 7. Hamburg Curry Mayo: Rp35.000 (HCM)            |");
            System.out.println("| 8. Shrimp Truffle Aioli: Rp35.000 (STA)          |");
            System.out.println("| 9. Egg Curry Mayo: Rp25.000 (ECM)                |");
            System.out.println("| 10. Chicken Katsu Curry Mayo: Rp35.000 (CKCM)    |");
            System.out.println("| 11. Smoked Beef and Cheese: Rp33.000 (SBC)       |");
            System.out.println("| 12. Egg Curry Mayo: Rp25.000 (ECM)               |");
            System.out.println("| 13. Crunchy Choco: Rp33.000 (CC)                 |");
            System.out.println("| 14. Tuna Mayo: Rp33.000 (TM)                     |");
            System.out.println("| 15. Dippin Fries: Rp23.000 (DF)                  |");
            System.out.println("| 16. Crunchy Choco Cheese: Rp35.000 (CCC)         |");
            System.out.println("|                                                  |");
            System.out.println("| Note: Diskon 10% untuk pembelian diatas 80000    |");
            System.out.println("====================================================");
            System.out.println();
            System.out.println("Masukkan Jumlah Makanan yang akan dibeli\t: ");
            int maksimal = angka.nextInt();
            System.out.println("==============================================");
            int uang;
            int kembalian;
            int hb[] = new int[maksimal];
            int jml[] = new int[maksimal];
            int total[] = new int[maksimal];
            String mkn[] = new String[maksimal];
            int totalsemua = 0;
            int i;
            for(i = 0;i<maksimal;i++){
                System.out.print("Masukkan Nama Makanan ke- "+(i+1)+" \t: ");
                mkn [i] = barang.nextLine();
                System.out.print("Masukkan Jumlah Pesanan ke- "+(i+1)+" \t ");
                jml [i] = angka.nextInt();
                System.out.print("Masukkan Harga Makanan ke- "+(i+1)+" \t: Rp.");
                hb [i] = angka.nextInt();
                total[i] = jml[i]*hb[i];
                System.out.println("Total Harga Makanan ke- "+(i+1)+" \t: Rp. "+total[i]);
                totalsemua = totalsemua+jml[i]*hb[i];
                double diskon = 0.1; // Diskon 10% untuk pembelian lebih dari 250000
                        double batasDiskon = 80000; // Batas pembelian untuk mendapatkan diskon

                        if (totalsemua > batasDiskon) {
                            double nilaiDiskon = totalsemua * diskon;
                            totalsemua -= nilaiDiskon;
                            System.out.println("Diskon (" + (diskon * 100) + "%) diterapkan: -Rp. " + nilaiDiskon);
                        }
                        System.out.println("Penginputan Pesanan ke"+(i+1)+" Telah Selesai");
                
            System.out.println("===========================================");}
            
            System.out.println("");
            System.out.println("===========================================================================================================");
            System.out.println("||\tNo\t||\tNama Barang\t||\tJumlah Barang\t||\tHarga Barang\t||\tTotal Harga\t||");
            for(i = 0;i<maksimal;i++){
            System.out.println("===========================================================================================================");
            System.out.println("||\t"+(i+1)+"\t||\t"+mkn[i]+"   \t||\t   "+jml[i]+"  \t\t||\t  Rp "+hb[i]+"  \t||\t  Rp "+total[i]+"\t||");
            }
            System.out.println("===========================================================================================================");
            System.out.println("||\tTotal Harga Keseluruhan \t\t\t\t\t\t\t||\t  Rp."+totalsemua+"\t||");
            System.out.println("===========================================================================================================");
            System.out.println();
            System.out.print("\tPembayaran \t: Rp. ");
            uang = angka.nextInt();
            if(uang<=totalsemua){
                System.out.println("\t\t Nominal uang yang anda masukkan tidak cukup");
                System.out.println("\t\t Silahkan Masukkan Nominal Uang Kembali");
                uang = angka.nextInt();
            }
            kembalian = uang-totalsemua;
            System.out.println("\tKembalian \t: Rp. "+kembalian);
            System.out.println();
            System.out.println("\t\t\t=====TERIMA KASIH ATAS KUNJUGAN ANDA!=====");
            
            break;
                case 2 :
                 //minuman
            System.out.println("\n=====================Minuman========================\n");
            System.out.println("| 1. Americano: Rp16.000 (AMC)                       |");
            System.out.println("| 2. kopi Susu Senja: Rp23.000 (KSS)                 |");
            System.out.println("| 3. Kopi Susu: Rp20.000 (KS)                        |");
            System.out.println("| 4. Latte: Rp21.000 (L)                             |");
            System.out.println("| 5. Caramel Latte: Rp26.000 (CL)                    |");
            System.out.println("| 6. Double Shaken Senja: Rp26.000 (DSS)             |");
            System.out.println("| 7. Vanilla Latte: Rp26.000 (VL)                    |");
            System.out.println("| 8. Hazelnut Latte: Rp26.000 (HL)                   |");
            System.out.println("| 9. Kopi Tarik: Rp24.000 (KT)                       |");
            System.out.println("| 10. Pandan Latte: Rp26.000 (PL)                    |");
            System.out.println("| 11. Kopi Pokat: Rp33.000 (KP)                      |");
            System.out.println("| 12. Caramel Macchiato: Rp26.000 (CM)               |");
            System.out.println("| 13. Kopi Soklat: Rp24.000 (KS)                     |");
            System.out.println("| 14. Kopi Milo: Rp25.000 (KM)                       |");
            System.out.println("| 15. Susu soklat: Rp20.000 (SS)                     |");
            System.out.println("| 16. Hazelnut Chocho: Rp22.000 (HC)                 |");
            System.out.println("|                                                    |");
            System.out.println("| Note: Diskon 20% untuk pembelian diatas 90000      |");
            System.out.println("======================================================");
            System.out.println();
            System.out.println("Masukkan Jumlah Makanan yang akan dibeli\t: ");
            int maksimal2 = angka.nextInt();
            System.out.println("==============================================");
            int uang2;
            int kembalian2;
            int hb2[] = new int[maksimal2];
            int jml2[] = new int[maksimal2];
            int total2[] = new int[maksimal2];
            String alt[] = new String[maksimal2];
            int totalsemua2 = 0;
            
            for(i = 0;i<maksimal2;i++){
            System.out.print("Masukkan Nama Barang ke "+(i+1)+" \t: ");
            alt [i] = barang.nextLine();
            System.out.print("Masukkan Jumlah Barang ke "+(i+1)+" \t: ");
            jml2 [i] = angka.nextInt();
            System.out.print("Masukkan Harga Barang ke "+(i+1)+" \t: Rp. ");
            hb2 [i] = angka.nextInt();
            total2[i] = jml2[i]*hb2[i];
            System.out.println("Total Harga Barang ke- "+(i+1)+" \t: Rp. "+total2[i]);
            totalsemua2 = totalsemua2+jml2[i]*hb2[i];
            double diskon = 0.2; // Diskon 20% untuk pembelian lebih dari 250000
                double batasDiskon2 = 90000; // Batas pembelian untuk mendapatkan diskon

                        if (totalsemua2 > batasDiskon2) {
                            double nilaiDiskon = totalsemua2 * diskon;
                            totalsemua2 -= nilaiDiskon;
                            System.out.println("Diskon (" + (diskon * 100) + "%) diterapkan: -Rp. " + nilaiDiskon);
                        }
                        System.out.println("Penginputan Pesanan ke"+(i+1)+" Telah Selesai");
                        
                        System.out.println("=============================================");}
            
            System.out.println("");
            System.out.println("==================================================================================================");
            System.out.println("||\tNo\t||\tNama Barang\t||\tJumlah Barang\t||\tHarga Barang\t||\tTotal Harga\t||");
            for(i = 0;i<maksimal2;i++){
            System.out.println("===========================================================================================================");
            System.out.println("||\t"+(i+1)+"\t||\t"+alt[i]+"   \t||\t   "+jml2[i]+"  \t\t||\t  Rp "+hb2[i]+"  \t||\t  Rp "+total2[i]+"\t||");
            }
            System.out.println("===========================================================================================================");
            System.out.println("||\tTotal Harga Keseluruhan \t\t\t\t\t\t\t||\t  Rp."+totalsemua2+"\t||");
            System.out.println("===========================================================================================================");
            System.out.println();
            System.out.print("\tPembayaran \t: Rp. ");
            uang2 = angka.nextInt();
            if(uang2<=totalsemua2){
                System.out.println("\t\t Nominal Uang yang Anda Masukkan Tidak Cukup");
                System.out.println("\t\t Silahkan Masukkan Nominal Uang Kembali");
                System.out.print("\tPembayaran \t: Rp. ");
                uang2 = angka.nextInt();
            }
            kembalian2 = uang2-totalsemua2;
            System.out.println("\tKembalian \t: Rp. "+kembalian2);
            System.out.println();
            System.out.println("\t\t\t=====TERIMA KASIH ATAS KUNJUNGAN ANDA!=====");
            break;
            case 3 :
                System.out.println("Proses Telah Selesai Sistem Keluar");
                System.exit(0);
            break;
            default:
                   //Apabila Masukan Salah
                    System.out.print("Maaf Tidak ada kode"+menu+"System Akan Keluar");
                    System.exit(0);
            }
                System.out.println("");
                System.out.print("Ingin Memesan menu lain? (y/n)= ");
                ulang = input.next().charAt(0);
            }
            while(ulang!= 'n');
            System.out.println("TerimaKasih....");
        }else{
            System.out.print("Maaf Username dan Password Tidak Tersedia");
            System.exit(0);
                    
    }
    
        }
    }   
    
