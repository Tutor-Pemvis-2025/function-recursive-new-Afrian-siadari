//Afrian Josse Siadari_12S25003
//Dian Petrus Panjaitan_12S25057
//Boas Hutahaean_12S25005
//Felix Siadari_12S25043


import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil, ni;

        n = Integer.parseInt(input.nextLine());
        hasil = f(n);
        System.out.println("Bilangan yang dimasukkan: " + n);
        System.out.println("Hasil perhitungan rekursif:" + hasil);
    }
    
    public static int f(int n) {
        int total, i;

        i = 0;
        if (n == 1) {
            total = 1;
        } else {
            total = n + f(n - 1);
        }
        
        return total;
    }
}

