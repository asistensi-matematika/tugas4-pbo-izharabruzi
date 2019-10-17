/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi4;

import java.util.Scanner;

/**
 *
 * @author ROG
 */
public class bangundatar {

    protected double keliling;
    protected double luas;

    public bangundatar() {

    }

    void view() {

    }
}

class lingkaran extends bangundatar {

    protected double jari2;
    double pi = 3.14;

    protected double KelilingLingkaran(double jari2) {
        keliling = 2 * pi * jari2;
        return keliling;
    }

    protected double LuasLingkaran(double jari2) {
        luas = pi * jari2 * jari2;
        return luas;
    }

    void view() {
        System.out.println("Nama bangun datar adalah lingkaran");
        System.out.println("luas lingkaran adalah " + LuasLingkaran(jari2));
        System.out.println("keliling lingkaran adalah " + KelilingLingkaran(jari2));
    }
}

class Persegi extends bangundatar {

    protected double panjangsisi;

    private double KelilingPersegi(double panjangsisi) {
        keliling = 4 * panjangsisi;
        return keliling;
    }

    private double LuasPersegi(double panjangsisi) {
        luas = panjangsisi * panjangsisi;
        return luas;
    }

    void view() {
        super.view();
        System.out.println("Nama bangun datar adalah persegi");
        System.out.println("Luasnya adalah " + LuasPersegi(panjangsisi) + "cm^2");
        System.out.println("Keliling adalah " + KelilingPersegi(panjangsisi) + "cm");
    }

}

class Segitiga extends bangundatar {

    protected double alas, tinggi;

    private double Luas(double alas, double tinggi) {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    void view() {

        System.out.println("nama bangun datar adalah segitiga");
        System.out.println("Luas segitiga adalah " + Luas(alas, tinggi));

    }
}

class JenisSegitiga extends Segitiga {

    protected double SisiMiring(double alas, double tinggi) {
        double SisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return SisiMiring;
    }

    private double keliling(double alas) {
        double Keliling = alas + alas + alas;
        return Keliling;
    }

    private double keliling(double alas, double tinggi) {
        double Keliling = alas + tinggi + SisiMiring(alas, tinggi);
        return Keliling;
    }

    void view(double alas) {
        super.view();
        System.out.println("Jenis Segitiga adalah segitiga sama sisi");
        System.out.println("Keliling segitiga adalah " + keliling(alas));
    }

    void view(double alas, double tinggi) {
        super.view();
        System.out.println("Jenis segitiga adalah segitiga siku siku");
        System.out.println("Keliling segitiga adalah " + keliling(alas, tinggi));
    }
}
