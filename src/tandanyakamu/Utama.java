/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan keterangan
 * berdasarkan tahun lahir yang di inputkan
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age age = new Age(2019);
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" Tahun");
        age.tandanyaKamu(age.hitungUmur());
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
        
    }
    
}
