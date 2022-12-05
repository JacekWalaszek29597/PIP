import java.util.Scanner;

public class Zadanie5_3 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        int x=zwrocLiczbe(liczba);

        System.out.println("Zadanie Podstawowe");
        wyswietlWzorPodstawa(x);
        System.out.println("Zadanie dodatkowe");
        wyswietlWzorDodatkowe(x);

        liczba.close();
    }
    public static int zwrocLiczbe(Scanner liczba) {
        System.out.println("Podaj liczbe");
        int x = liczba.nextInt();
        if(x % 2 == 0)
            return x -= 1;
        return x;
    }
    public static void wyswietlWzorPodstawa(int a){
        for (int i = 0; i <=a ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void wyswietlWzorDodatkowe(int n) {

        for (int i = 0, gwiazdka = 1, spacja = n/2; i < n-i ; i++ ,spacja--, gwiazdka += 2) {
                for (int j = 0; j<spacja; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j<gwiazdka; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
