//Afrian Josse Siadari_12S25003
//Dian Petrus Panjaitan_12S25057
//Boas Hutahaean_12S25005
//Felix Siadari_12S25043


import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka, hasil;

        angka = Integer.parseInt(input.nextLine());
        hasil = hitungRekursif(angka);
    }
    
    public static int hitungRekursif(int angka) {
        int hasil;

        if (angka == 1) {
            hasil = 1;
        } else {
            hasil = angka + hitungRekursif(angka - 1);
        }
        
        return hasil;
    }
}
