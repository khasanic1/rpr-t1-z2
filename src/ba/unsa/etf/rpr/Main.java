package ba.unsa.etf.rpr;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int a = ulaz.nextInt();
        sumaCifara(a);

    }

    private static void sumaCifara(int a) {
        for(int i=1; i<a; i++){
            int broj = i;
            int suma = 0;
            while(broj != 0){
                suma += broj % 10;
                broj /= 10;
            }
            if(i % suma == 0){
                System.out.println(i);
            }
        }
    }
}
