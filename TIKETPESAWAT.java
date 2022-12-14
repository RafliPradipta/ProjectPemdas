

//NAMA    : MUHAMMAD RAFLI PRADIPTA
//NIM     : 225150601111005
//MATKUL  : PRAKTIKUM PEMROGRAMAN DASAR
//KELAS   : N1A (PTI-A)




import java.util.Scanner;

public class TIKETPESAWAT {
    public static void main(String[] args) {
        // deklarasi array 2 Dimensi
        String[][] tiketPesawat = {
                {"Kode Penerbangan", "Nama Maskapai", "Kota Asal", "Kota Tujuan", "Harga"},
                {"PW001", "Garuda", "Jakarta", "Surabaya", "Rp.1.000.000"},
                {"PW002", "Batik Air", "Surabaya", "Bandung", "Rp.750.000"},
                {"PW003", "Citilink", "Jakarta", "Medan", "Rp.1.100.000"},
                {"PW004", "Wings Air", "Denpasar", "Makassar", "Rp.1.200.000"},
                {"PW005", "Lion Air", "Bandung", "Yogyakarta", "Rp.600.000"}
        };

        // deklarasi variabel
        Scanner input = new Scanner(System.in);
        int pilihan;
        int totalHarga;
        int hargaBayar;
        int kembalian;
        int jumlahTiket;

        // menampilkan menu
            System.out.println(" ");
            System.out.println("\t\t\tSELAMAT DATANG DI PEMESANAN TIKET ONLINE");
            System.out.println("\t\t\t\t\t\tPT. TIKET PESAWAT");
            System.out.println("\n\t\t\t1. Lihat Daftar Tiket Pesawat");
            System.out.println("\t\t\t2. Beli Tiket Pesawat");
            System.out.print("\n\t\t\tMasukkan pilihan anda (1/2) : ");
            pilihan = input.nextInt();

        // jika pilihan 1
        if (pilihan == 1) {
            System.out.println("\n\t\t\t\tDAFTAR TIKET PESAWAT");
            System.out.println("=============================================================");
            for (String[] strings : tiketPesawat) {
                for (int j = 0; j < tiketPesawat[0].length; j++) {
                    System.out.print(strings[j] + "\t\t");
                }
                System.out.println();
            }
        }

        // jika pilihan 2
        if (pilihan == 2) {
            System.out.println("\n\t\t\t\tBELI TIKET PESAWAT");
            System.out.println("=============================================================");
            System.out.println("Kode Penerbangan\\t Nama Maskapai\\t Kota Asal\\t Kota Tujuan\t Harga");
            for (String[] value : tiketPesawat) {
                for (int j = 0; j < tiketPesawat[0].length; j++) {
                    System.out.print(value[j] + "\t\t");
                }
                System.out.println();
            }
            System.out.println("\nMasukkan kode penerbangan : ");
            String kodePenerbangan = input.next();

            // looping array 2 dimensi
            for (String[] strings : tiketPesawat) {
                for (int j = 0; j < tiketPesawat[0].length; j++) {
                    // jika kode penerbangan sesuai
                    if (strings[0].equalsIgnoreCase(kodePenerbangan)) {
                        System.out.println("\nAnda memilih tiket penerbangan " + strings[1]);
                        System.out.println("Dari kota " + strings[2] + " ke " + strings[3]);
                        System.out.println("Harga Tiket : " + strings[4]);

                        // menghapus karakter 'Rp.'
                        String hargaTiket = strings[4].replaceAll("[Rp. ]", "");
                        int harga = Integer.parseInt(hargaTiket);

                        // menghitung total harga tiket
                        System.out.print("Masukkan jumlah tiket yang dibeli : ");
                        jumlahTiket = input.nextInt();
                        totalHarga = harga * jumlahTiket;
                        System.out.println("Total Harga : Rp. " + totalHarga);

                        // menghitung kembalian
                        System.out.print("Uang yang dibayarkan : Rp. ");
                        hargaBayar = input.nextInt();
                        kembalian = hargaBayar - totalHarga;
                        System.out.println("Kembalian : Rp. " + kembalian);
                        System.out.println("\nTerima kasih telah membeli tiket di PT. Tiket Pesawat");
                        break;
                    }
                }
            }
        }
    }
}
