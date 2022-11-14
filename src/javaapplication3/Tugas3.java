package javaapplication3;

import java.util.Scanner;
public class Tugas3 {
public static void main (String [] args){
Scanner in = new Scanner (System.in);
int sisi;
System.out.println("menghitung luas & keliling persegi");
System.out.print("sisi : ");
sisi = in.nextInt();
int luas = sisi*sisi;
int keliling = 4*sisi;
System.out.println("luas = "+luas);
System.out.println("keliling = "+keliling);
}
}