/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasjav3;

import java.util.Random;

/**
 *
 * @author user
 */
public class Tugasjav3 {
    public static void main(String[] args) {
        
        int penjualan[] = {100, 120, 112, 132, 105, 122, 108, 121, 122, 130, 115, 125};

        int N = penjualan.length;
        for (int i=0; i< N; i++){
            System.out.println("Penjualan ke-"+1+"="+penjualan[1]);
        }
    }
}

class Arry2d{
    public static void main(String[] args){
        double nilai[][]= {{ 50,60,70 }, { 70,75,87 }, { 89,90,90 }, {65,70,80}};
        int N = nilai.length;
        String huruf;
        
        for(int i = 0 ; i < N; i++){
            int M =nilai[i].length;
            double tolNilai = 0;
            for (int j = 0 ; j < M; j++){
                tolNilai += nilai[i][j];
            }
            double rataRata = tolNilai/M;
            if (rataRata > 80.0d ){
                huruf = "A";
            }
            else if (rataRata > 70.0d ){
                huruf = "B";
            }
            else if (rataRata > 60.0d ){
                huruf = "C";
            }
            else if (rataRata > 50.0d ){
                huruf = "D";
            }
            else{
                huruf = "E";
            }
            System.out.println("Nilai Mahasiswa ke -" + i + " = "+rataRata + " ("+huruf+ ")" );
        } 
    }
}

class LatihanLenght{
    public static void main(String[] args) {
        String A = "Pemrograman Berorientasi Objek";
        String B = "Jurusan Teknik Informatika";
        String C,D,E;
        C= "Fakultas Teknologi Industri";
        D= "Universitas Islam Indonesia";
        E= "Yogyakarta";
        int nA= A.length();
        int nB= B.length();
        int nC= C.length();
        System.out.println(A+"--> Panjang String "+ nA);
        System.out.println(B+"--> Panjang String "+ nB);
        System.out.println(C+"--> Panjang String "+ nC);
        System.out.println(D+"--> Panjang String "+ D.length());
        System.out.println(E+"--> Panjang String "+ E.length());
    }
}

class KesamaanString{
    public static void main(String[] args) {
        String A = "Laboratorium Komputasi dan Sistem Cerdas";
        String B = "LABORATORIUM KOMPUTASI DAN SISTEM CERDAS";
        String C,D,E;
        C= "Laboratorium Komputasi Sistem Cerdas";
        D= "LABORATORIUM KOMPUTASI SISTEM CERDAS";
        E= "Laboratorium Komputasi dan Sistem Cerdas";

        boolean tes1, tes2, tes3;
        tes1 = A.equals(B);
        tes2 = (A==C);
        tes3 = A.equals(E);

        System.out.println("["+A+"]==["+B+"]= --> "+tes1);
        System.out.println("["+A+"]==["+C+"]= --> "+tes2);
        System.out.println("["+A+"]==["+E+"]= --> "+tes3);
        System.out.println("["+B+"]==["+E+"]= --> "+B.equals(C));
        System.out.println("["+C+"]==["+E+"]= --> "+C.equals(E));
    }
}

class PerbandinganString{
    public static void main(String[] args) {
        String nama[] = {"Adam Ganteng Banget Dih", "Nathan Alvino Fam", "Plorentina F P", "Jokowi", "Nikola Tesla"};
        String temp;
        int N = nama.length;
        System.out.println("Daftar Nama Sebelum Di Urutkan");
        for(int i= 0; i< N; i++  ){
            System.out.println((i+1) + ". " + nama[i]);
        }
        for(int i= 0; i<=N-2; i++  ){
            for(int j=i+1; j<N-1 ; j++){
                if (nama[i].compareTo(nama[j]) > 0 ){
                    temp = nama[i];
                    nama[i] = nama[j];
                    nama[j]= temp;
                }
            }
        }
        System.out.println("Daftar Setelah Diurutkan");
        for (int i = 0; i < N; i++){
            System.out.println((i+1)+". "+ nama[i]);
        }
    }
}

class KarakterPadaPosisi{
    public static void main(String[] args) {
        String A = "Laboratorium Komputasi dan Sistem Cerdas";
        Random rand = new Random();
        for (int i = 0 ; i < A.length(); i++){
            int ke = rand.nextInt(A.length());
            System.out.println("Karakter ke-"+ke+" = "+A.charAt(ke));
        }
    }
}

class PosisiKarakter {
    public static void main(String[] args) {
        String A = "Laboratorium Komputasi dan Sistem Cerdas";
        System.out.println("Karakter K ada di posisi ke : "+ A.indexOf("K"));
    }
}

class GabungSting {
    public static void main(String[] args) {
        // use "+" for that
        String a, b, c;
        a = "Laboratorium";
        b = "Komputasi";
        c = "Sistem Cerdas";
        System.out.println(a+b + " dan " +c);
    }
}

class StringBaru{
    public static void main(String[] args) {
        String a = "Laboratorium Komputasi dan Sistem Cerdas";
        String penggal1,penggal2,penggal3,penggal4;
        penggal1 = a.substring(10);
        penggal2 = a.substring(20);
        penggal3 = a.substring(10, 30);
        penggal4 = a.substring(20,25);
        System.out.println("Kalimat Asli "+a);
        System.out.println(penggal1);
        System.out.println(penggal2);
        System.out.println(penggal3);
        System.out.println(penggal4);
    }
}

class ModifikasiString{
    public static void main(String[] args) {
        String a = "  Laboratorium Komputasi dan Sistem Cerdas  ";
        String b = a.replace("a", "A");
        String c = a.replace("i", "u");
        String d = a.trim(); // menghilangkan spasi pada awal dan akhir

        System.out.println("Kata Asli : "+a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

class  KonversiSringArray{
    public static void main(String[] args) {
        String a = "Lab. KSC";
        char[] karakter0= a.toCharArray();
        char[] karakter1= new char[7];
        a.getChars(2,6,karakter1,1);
        System.out.println("Kalimat Asli : " + a);

        // Penulisan per Karakter
        System.out.println("Per Kata: ");
        for (int i = 0; i < karakter1.length; i++) {
            System.out.println("Karakter ke -"+i+": "+ karakter0[i]);
        }

    }
}