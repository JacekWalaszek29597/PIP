public class Zadanie_4_1 {
    public static void main(String[] args) {


        boolean czyPada =true;
        boolean czySwieciSlonce= true;

        if (czyPada == true && czySwieciSlonce != true) {
            System.out.println("plucha");
        }
        else if(czyPada == true && czySwieciSlonce == true){
            System.out.println("tecza");
        }
        else if(czyPada != true && czySwieciSlonce == true){
            System.out.println("slonecznie");
        }
        else System.out.println("pochmurno");

    }



}
