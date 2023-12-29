package Sorting;

public class BubbleSort {

    // Metode untuk melakukan Bubble Sort pada array
    void bubbleSort(int arr[]) {
        int n = arr.length;  // Panjang array

        // Iterasi untuk setiap elemen dalam array
        for (int i = 0; i < n-1; i++) {
            
            // Iterasi untuk membandingkan dan menukar elemen
            for (int j = 0; j < n-i-1; j++) {
                
                // Jika elemen saat ini lebih besar dari elemen berikutnya, tukar
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();  // Membuat objek BubbleSort
        int arr[] = {64, 34, 25, 12, 22, 11, 90};  // Array yang akan diurutkan

        ob.bubbleSort(arr);  // Memanggil metode bubbleSort untuk mengurutkan array

        System.out.println("Sorted array"); 

        // Mencetak array yang telah diurutkan
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}