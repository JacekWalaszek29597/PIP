public class Main {
    public static void main(String[] args) {
//-------------------------Zadanie 1----------------------------------
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Jacek Walaszek";
        student1.index=29597;
        student2.name = "Czesio";
        student2.index =99999;
        System.out.println("Zadanie 1");
        System.out.println(student1.name +" "+ student1.index + " i " + student2.name +" "+ student2.index);
        System.out.println();
//--------------------------------------------------------------------

//-------------------------Zadanie 2----------------------------------
         SecretStudent student3 = new SecretStudent();
         System.out.println("Zadanie 2");
         student3.printStudent();

//--------------------------------------------------------------------

//-------------------------Zadanie 3----------------------------------
        SecretStudent student4 = new SecretStudent();
        student4.setName("Jacek");
        student4.setSurname("Walaszek");
        student4.setIndex(29597);
        System.out.println("Zadanie 3");
        student4.printStudent();

//--------------------------------------------------------------------

// -------------------------Zadanie 4----------------------------------
        System.out.println("Zadanie 4");
        SecretStudent[] Students = new SecretStudent[2];
        for (int i = 0; i < Students.length; i++) {
            Students[i] = new SecretStudent();
            Students[i].readFromScanner();
        }
        Students[1].printStudents(Students);
    }
}