import java.util.Scanner;

public class Zadanie4_6 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);

        double a = zwrocliczbe(liczba);
        double b = zwrocliczbe(liczba);
        double temp;
        double d1;
        double d2;
        double d3;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Wybrany przedzial : ["+a+", "+b+"]");
        System.out.println("Wartosci generowane losowo :");
        d1 = generateNumber(1,b);
        d2 = generateNumber(1,b);
        d3 = generateNumber(1,b);
        zwrocZmienna(d1);
        zwrocZmienna(d2);
        zwrocZmienna(d3);
        zwrocWynik(d1,d2,d3);
        //zwrocWynik(1.0,3.0,2.0);
        liczba.close();
    }
    public static double zwrocliczbe(Scanner liczba)
    {
        System.out.println("Podaj liczbe");
        double x = liczba.nextDouble();
        return x;
    }

    public static void zwrocZmienna(double x)
    {
        System.out.println(x);
    }

    public static double generateNumber(double a, double b)
    {
        double result = (a + Math.random() * (b-a));
        return Math.round(result *100.0)/100.0; //dwa miejsca
    }

    public static void zwrocWynik(double x, double y, double z)
    {
        double temp1;

        if (x > y) {
            temp1 = x;
            x = y;
            y = temp1;
        }
        if (y > z){
            temp1= y;
            y=z;
            z=temp1;
        }
        if (x > y) {
            temp1= x;
            x=y;
            y=temp1;
        }

        System.out.println("Gdzie : " + x +" < "+y+" < "+z);
    }



}
