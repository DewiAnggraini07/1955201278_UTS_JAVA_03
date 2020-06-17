/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_PERCABANGAN_PERULANGAN;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class IO_PERCABANGAN_PERULANGAN {
   public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nama: ");
        nama = scan.nextLine();
        System.out.println("Nilai: ");
        nilai = scan.nextInt();
 
        if( nilai >= 70 ) {
            for(int x=0; x < 10; x++){    
             System.out.println("tingkatkan belajar anda!" );}
            System.out.println("Selamat " + nama + ", anda lulus!");}
            else {
            System.out.println("Maaf " + nama + ", anda gagal");
                    }
    }
}
