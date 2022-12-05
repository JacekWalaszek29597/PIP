import java.util.Scanner;

public class Zadanie5_2 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        int x=zwrocliczbe(liczba);

        wyswietlCiagF(x);

        liczba.close();
}
    public static int zwrocliczbe(Scanner liczba) {
        System.out.println("Podaj liczbe");
        int x = liczba.nextInt();
        return x;
    }
    public static void wyswietlCiagF(int a){
        int F0=0;
        int F1=1;
        int FN;
        int i=2;

        System.out.println("F0 = " +F0);
        System.out.println("F1 = " +F1);
        do{
            FN = F0+F1;
            System.out.println("F"+i+" = " + FN);
            F0=F1;
            F1=FN;
            i++;
        }while(i<=a);
        }

}

