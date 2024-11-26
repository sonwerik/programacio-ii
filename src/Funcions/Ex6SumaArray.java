package Funcions;

public class Ex6SumaArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumaArray(arr));
    }
    public static int sumaArray(int[] array){
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        return suma;
    }
}