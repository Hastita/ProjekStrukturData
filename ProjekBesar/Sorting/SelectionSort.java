package Sorting;

public class SelectionSort {

    // Fungsi untuk melakukan pengurutan seleksi pada array
    public static int[] selectionSort(int[] array) {
        int ukuran = array.length; // Mendapatkan panjang array
        while (ukuran > 0) {
            int max = 0; // Menyimpan indeks elemen maksimum
            for (int i = 1; i < ukuran; i++) {
                // Mencari elemen terbesar dalam array
                if (array[max] < array[i]) {
                    max = i; // Memperbarui indeks elemen maksimum
                }
            }

            // Menukar elemen terbesar dengan elemen terakhir dalam array
            int temp = array[max];
            array[max] = array[ukuran - 1];
            array[ukuran - 1] = temp;
            ukuran--; // Mengurangi ukuran array karena elemen terbesar sudah benar
        }
        return array; // Mengembalikan array
    }

    
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Array awal yang akan diurutkan
        int[] sortedArray = selectionSort(array); // Memanggil fungsi pengurutan seleksi

        // Menampilkan hasil array yang sudah diurutkan secara menurun
        System.out.println("Sorted array in descending order:");
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }
    }
}
