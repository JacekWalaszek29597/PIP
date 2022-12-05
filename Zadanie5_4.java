import java.util.Scanner;

public class Zadanie5_4 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        int x = zwrocLiczbe(liczba);
        int y = zwrocLiczbe(liczba);
        int z = zwrocLiczbe(liczba);

        wyswietlWzor(x,y,z,zwrocMax(x,y,z));

        liczba.close();
    }
    public static void wyswietlWzor(int slupek1,int slupek2,int slupek3, int max){

        for(int i = 0;i <=max; i++){
            if(slupek1<=max-i)
                System.out.print("  ");
            else System.out.print("* ");

            if(slupek2<=max-i)
                System.out.print("  ");
            else System.out.print("* ");

            if(slupek3<=max-i)
                System.out.print("  ");
            else System.out.print("* ");

            System.out.println();
        }
    }
    public static int zwrocLiczbe(Scanner x) {
        System.out.println("Podaj liczbe");
        int liczba = x.nextInt();

        return liczba;
    }
    public static int zwrocMax(int x,int y,int z){
        int max;
        int temp;

        if(x>=y)
            max=x;
        else max=y;

        if(max<=z)
            max=z;

        return max;
    }
}
