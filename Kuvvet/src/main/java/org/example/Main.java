package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int x, y, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kuvveti alınacak sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        y = input.nextInt();

        for(int i=1; i<=y; i++){
            sonuc *= x;
        }
        System.out.println("Sonuç: " + sonuc);
    }
}