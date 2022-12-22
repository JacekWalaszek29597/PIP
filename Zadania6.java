import java.util.Arrays;
import java.util.Scanner;

public class Zadania6 {
    public static void main(String[] args) {

        //----------- Zadanie 1 ---------------
        //int[] genArr= generateArray(zwrocRozmiar());
        int[] genArr = generateArray(100);
        printArray(genArr);

        //----------- Zadanie 2 ---------------
        int[] sortedArr = sort(genArr);
        printArray(sortedArr);

        //----------- Zadanie 3 ---------------
        int[] revArr = reverse(sortedArr);
        printArray(revArr);

        //----------- Zadanie 4 ---------------
        System.out.println(equalsReverse(sortedArr,revArr));
    }
    public static int zwrocRozmiar() {
        Scanner rozmiar = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow w tablicy");
        int n = rozmiar.nextInt();
        rozmiar.close();
        return n;
    }
    public static int[] generateArray(int n)
    {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (0 + Math.random() * (100));
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<10)
                System.out.print(" ");
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] sort(int[] arr){
        //sortowanie babelkowe
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] reverse(int[] arr){
        int[] tempTable = Arrays.copyOf(arr,arr.length);
        for (int i = 0, j= tempTable.length-1; i<j ; i++,j--) {
            int temp=tempTable[i];
            tempTable[i]=tempTable[j];
            tempTable[j]=temp;
        }
        return tempTable;
    }
    public static boolean equalsReverse(int[] arr, int[] rra){
        boolean wynik;
        for (int i = 0,j=arr.length-1; i<arr.length; i++,j--) {
                if(arr[i] !=rra[j]){
                    return wynik=false;
                }
            }
        return wynik=true;
        }
}
