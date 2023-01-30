package PROJECT.konversiUang.baru;

import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        float a;
        char b;
        var dollar = 0.000064;
        var yen = 0.0089;
        var euro = 0.000062;
        var hasil = 0;
        Boolean lanjutkan = true;
        String jawab;
        double value;

        while (lanjutkan){
            System.out.println("selamat datang di konversi uang");
            System.out.println("code a = dollar");
            System.out.println("code b = yen ");
            System.out.println("code c = euro");
            System.out.println("masukkan jumlah uang Rp yang ingin di konversi :");
            a = inputUser.nextFloat();
            System.out.println("masukkan code yang ingin di konversi : ");
            b = inputUser.next().charAt(0);
            switch (b) {
                case 'a':
                    value = a * dollar;
                    System.out.println("Hasil converter Rp " + a + " ke dollar : " + value);
                    break;
                case 'b' :
                    value = a * yen;
                    System.out.println("Hasil converter Rp " + a + " ke yen : " + value);
                    break;
                case 'c':
                    value = a * euro;
                    System.out.println("Hasil converter Rp " + a + " ke euro : " + value);
                    break;
                default :
                    System.err.println("code tidak ditemukan ");

            }
            System.out.println("\n apakah anda ingin melanjutkan program? y/n");
            jawab = inputUser.next();
            lanjutkan = jawab.equalsIgnoreCase("y");
        }
        hasil++;
        System.out.println("anda sudah menggunakan conversi uang sebanyak : " + hasil);
        System.out.println("Terima Kasih");

    }
}
