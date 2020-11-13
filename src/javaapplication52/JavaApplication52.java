/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  String kodeBarang = "";
  int jumlahBarang = 0;
  int hargaBarang = 0;
  String namaBarang = "";
  
  Scanner input = new Scanner(System.in);

   System.out.print("Masukan Kode Barang : ");
   kodeBarang = input.nextLine();
   System.out.print("Masukan Jumlah Barang : ");
   jumlahBarang = input.nextInt();
   if (kodeBarang.equals("AS")) {
    hargaBarang = 200000;
    namaBarang = "ASUS";
   } else if (kodeBarang.equals("AC")) {
    hargaBarang = 100000;
    namaBarang = "AC";
   } else if (kodeBarang.equals("TSB")) {
    hargaBarang = 150000;
    namaBarang = "TOSHIBA";
   } else if (kodeBarang.equals("HP")) {
    hargaBarang = 250000;
    namaBarang = "HP";
   } else {
    System.out.println("Kode Barang tidak ada yang cocok!");
   }
   System.out.println("===============================");
   System.out.println("Kode Barang : " + kodeBarang);
   System.out.println("Nama Barang : " + namaBarang);
   System.out.println("Harga Satuan : " + hargaBarang);
   System.out.println("Jumlah Beli : " + jumlahBarang);
   System.out.println("Total : " + (hargaBarang * jumlahBarang));
  } 
  }
 

    

