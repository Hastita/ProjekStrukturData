package Sorting;

public class InsertionSort {

    // Metode untuk melakukan pengurutan menggunakan algoritma Insertion Sort
    public static int[] insertion(int[] array) {
        int ukuran = array.length;
        int max, j;
        int i = 1;

        while (i < ukuran) {
            max = array[i];
            j = i;
            while (j > 0 && array[j - 1] > max) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = max;
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        // Array yang akan diurutkan
        int[] array = { 9, 5, 1, 4, 3 };
        
        // Memanggil metode insertion untuk mengurutkan array
        int[] sortedArray = insertion(array);

        // Menampilkan array yang telah diurutkan
        System.out.println("Sorted array:");
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }
    }
}
