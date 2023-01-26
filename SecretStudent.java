import java.util.Scanner;

public class SecretStudent {
    private String name = "default name";
    private String surname = "default surname";
    private int index = 0;




    public  String getName(){
        return name;
    }

    public void setName(String newName){
        if(newName.length()==0 || newName==null){
            return ;
        }
        this.name=newName;
    }
    public  String getSurname(){
        return surname;
    }
    public void setSurname(String newSurname ){
        if(newSurname.length()==0 || newSurname==null){
            return ;
        }
        this.surname=newSurname;
    }
    public  int getIndex(){
        return index;
    }
    public void setIndex(int newIndex){
        if(newIndex<=0){
            return ;
        }
        this.index=newIndex;
    }

    public void printStudent(){
        System.out.println(getName() + " " + getSurname() + " "+ getIndex());
        System.out.println();
    }
    public  void readFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imie");
        setName(scanner.nextLine());
        System.out.println("Podaj Nazwisko");
        setSurname(scanner.nextLine());
        System.out.println("Podaj Index");
        setIndex(scanner.nextInt());
    }
    public void printStudents(SecretStudent[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getSurname() + " "+ arr[i].getIndex() );
        }
   }
}
