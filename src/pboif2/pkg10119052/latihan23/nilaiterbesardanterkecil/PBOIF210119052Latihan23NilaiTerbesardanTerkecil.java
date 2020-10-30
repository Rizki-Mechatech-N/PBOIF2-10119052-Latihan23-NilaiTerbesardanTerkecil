package pboif2.pkg10119052.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * nilai terbesar dan terkecil
 * 
 */
public class PBOIF210119052Latihan23NilaiTerbesardanTerkecil {

    public static void main(String[] args) {
        int banyak, kurang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        System.out.print("Masukkan Nama Petugas : ");
        String nama = scanner.next();
        Scanner masuk = new Scanner(System.in);
        System.out.print ("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyak = masuk.nextInt();
        double[] angka = new double[10];  
        for (int i = 0; i < banyak; i=i+1) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
            angka[i] = new Scanner(System.in).nextDouble();}
        System.out.println();
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (int i = 0; i < banyak; i++) {
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" : "+angka[i]);
        }
        for (int i = 0; i < banyak; i++) {
            for (kurang = 0;  kurang < banyak - i; kurang++) {
                if (angka[kurang] > angka[kurang + 1]) {
                    double n = angka[kurang];
                    angka[kurang] = angka[kurang + 1];
                    angka[kurang + 1] = n;}}}
        double nilaiBesar = angka[banyak];
        double nilaiKecil = angka[1];
        System.out.println();
        System.out.println("Nilai terbesar : " + nilaiBesar);
        System.out.println("Nilai terkecil : " + nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : "+nama);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha");
    }
    
}
