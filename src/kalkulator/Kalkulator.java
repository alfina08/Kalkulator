package kalkulator;

import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       double a, b, c = 0.0;
       
       System.out.print("Masukan angka Pertama ");
       a = in.nextDouble();
       System.out.print("Masukan angka kedua ");
       b = in.nextDouble();
       System.out.print("Pilih Salah Satu Operasi  " +
               "\n1.Penambahan" +
                         "\n2.Pengurangan" +
                         "\n3.Perkalian" +
                         "\n4.Pembagian" +
                         "\n5.Power" +
                         "\n#Please enter the number of opeation \n");
       double somethin = in.nextDouble();
       double Penambahan = 1;
       double Pengurangan = 2;
       double Perkalian = 3;
       double Pembagian = 4 ;
       double power = 5;
       if (somethin == Penambahan) {
               c = a + b;
               System.out.println(a + " + " + b + " = " + c);  }
       else if (somethin == Pengurangan)  {
               c = a - b;
               System.out.println(a + " - " + b + " = " + c);  }
       else if (somethin == Perkalian) {
               c = a * b;
       }
       
    }
    
}   
