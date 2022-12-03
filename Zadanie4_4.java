import javax.print.DocFlavor;
import java.util.Scanner;


//ZADANIE 4 i 5
public class Zadanie4_4 {
    public static void main(String[] args) {

        Scanner wiersz = new Scanner(System.in);
        int x = zwrocliczbe(wiersz);
        int y = zwrocliczbe(wiersz);

        switch (zwrocOperacje(wiersz)){
            case "ADD" :
                System.out.println("Wynik :" + absoluteValue(zwrocADD(x,y)));
                break ;
            case "SUB":
                System.out.println("Wynik :" + absoluteValue(zwrocSUB(x,y)));
                break ;
            case "DIV":
                System.out.println("Wynik :" + absoluteValue(zwrocDIV(x,y)));
                break ;
            case "MUL":
                System.out.println("Wynik :" + absoluteValue(zwrocMUL(x,y)));
                break ;
            default:
                System.out.println("Brak takiej operacji");
                break;
        }

        wiersz.close();
    }


       public static String zwrocOperacje(Scanner operacja)
    {
        System.out.println("Podaj nazwe operacji(ADD,SUB,DIV,MUL)");
        String operacjaTyp = operacja.nextLine();

        return operacjaTyp;
    }

    public static int zwrocliczbe(Scanner wiersz)
    {
        System.out.println("Podaj liczbe");
        String str = wiersz.nextLine();
        int liczba= Integer.parseInt(str);

        return liczba;
    }

    public static int zwrocADD(int a, int b)
    {
        return a + b;
    }

    public static int zwrocSUB(int a, int b)
    {
        return a - b;
    }

    public static int zwrocDIV(int a, int b)
    {
        return a / b;
    }

    public static int zwrocMUL(int a, int b)
    {
        return a * b;
    }

    public  static int absoluteValue(int a) {
        if (a < 0)
            a = a * (-1);

        return a;
    }
}
