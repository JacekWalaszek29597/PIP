import java.util.Objects;
import java.util.Scanner;
import javax.swing.*;

public class Zadanie4_8 {
    public static void main(String[] args) {
        podstawaZadania8();
       // podstawaZadania8GUI();

    }

    public static void podstawaZadania8(){
        Scanner liczba = new Scanner(System.in);
        Scanner kwota = new Scanner(System.in);

        System.out.println("Witamy w kantorze!!");
        System.out.println("Wybierz walute: ");
        System.out.println("    1 - PLN");
        System.out.println("    2 - JPY");

        int a = zwrocWartosc(liczba);

        System.out.println("Wprowadz kwote: ");
        double b =zwrocKwote(kwota);

        System.out.println(policzKwote(a,b));

        liczba.close();
    }

    public static void podstawaZadania8GUI(){
        JFrame f;
        f=new JFrame();
        String[] waluty= {"1 - PLN","2 - JPY"};
        int a=0;
        JOptionPane.showMessageDialog(f, "Witamy w kantorze!!","Kantor",JOptionPane.INFORMATION_MESSAGE);
        Object wybierz = JOptionPane.showInputDialog(f,"Wybierz walute :","Waluty",
                JOptionPane.DEFAULT_OPTION, null, waluty, "0");
        String wybranaWaluta = wybierz.toString();

        switch (wybranaWaluta) {
            case "1 - PLN":
                a=1;
                break ;
            case "2 - JPY":
                a=2;
                break ;
        }
        String kwota = JOptionPane.showInputDialog(f,"Wprowadz kwote:");
        double kwotaD = Double.parseDouble(kwota);

        JOptionPane.showMessageDialog(f, policzKwote(a,kwotaD),"Wynik konwersji",JOptionPane.INFORMATION_MESSAGE);

    }
    public static int zwrocWartosc(Scanner x){
        int y = x.nextInt();
        return y;
    }

    public static double zwrocKwote(Scanner y){
        double z = y.nextDouble();
        return z;
    }

    public static String policzKwote(int a, double b){
        String rezultat;
        if (a==1){
            rezultat =   b+ " zl => " + Math.round((b*30.27) *100.0)/100.0 + " ¥";
        }
        else if (a==2){
            rezultat= b+ " ¥ => " + Math.round((b/30.27)*100.0)/100.0 + " zl";
        }
        else rezultat= "Brak takiej operacji";

    return rezultat;
    }
}
