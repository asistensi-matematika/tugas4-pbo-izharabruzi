package asistensi4;

import java.util.Scanner;

public class Asistensi4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("pilih bangun datar yang diinginkan");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.print("Masukan pilihan anda :");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                Persegi p = new Persegi();
                System.out.print("Masukan panjang sisi :");
                p.panjangsisi = input.nextInt();
                p.view();
                break;
            case 2:
                lingkaran l = new lingkaran();
                System.out.print("Masukan panjang jari-jari :");
                l.jari2 = input.nextInt();
                l.view();
                break;
            case 3:
                System.out.println("Pilih Segitiga yang diingnkan\n1. Segitiga siku-siku\n2. Segitiga sama sisi");
                System.out.print("masukan pilihan anda:");
                int pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        JenisSegitiga j = new JenisSegitiga();
                        System.out.print("Masukan panjang alas :");
                        j.alas = input.nextDouble();
                        System.out.print("Masukan panjang tinggi :");
                        j.tinggi = input.nextDouble();
                        j.view(j.alas, j.tinggi);
                        break;
                    case 2:
                        JenisSegitiga J = new JenisSegitiga();
                        System.out.print("Masukan panjang alas :");
                        J.alas = input.nextDouble();
                        System.out.print("Masukan panjang tinggi :");
                        J.tinggi = input.nextDouble();
                        J.view(J.alas);
                        break;
                }
            break;
            default :
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
    }
}
