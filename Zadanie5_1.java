import java.util.Scanner;

public class Zadanie5_1 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        int x=zwrocliczbe(liczba);

        wyswietlLiczby(x);

        liczba.close();
    }

    public static int zwrocliczbe(Scanner liczba) {
        System.out.println("Podaj liczbe");
        int x = liczba.nextInt();
        return x;
    }

    public static void wyswietlLiczby(int a){
        int i=0;

        while(i<=a){
            System.out.print(i +" ");
            i++;
        }

        i=0;

        while(i>=a) {
            System.out.print(i + " ");
            i--;
        }
    }
}


