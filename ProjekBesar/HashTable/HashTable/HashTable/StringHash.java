import java.util.LinkedList;

public class StringHash {
    
    private LinkedList<String>[] table;

    // Konstruktor untuk inisialisasi tabel hash
    public StringHash(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Fungsi hash untuk menghitung indeks tabel
    public int hashFunction(String key) {
        return key.charAt(0) % table.length;
    }

    // Metode untuk menyisipkan nilai ke dalam tabel hash
    public void insert(String value) {
        int index = hashFunction(value); 
        table[index].add(value); 
        System.out.println("Data " + value + " ditambahkan di index: " + index);
    }

    // Metode untuk mencari nilai dalam tabel hash
    public int search(String value) {
        int index = hashFunction(value); 
        return index; 
    }

    public static void main(String[] args) {
        // Membuat objek StringHash dengan ukuran tabel 26
        StringHash stringHash = new StringHash(26); 

        // Menyisipkan beberapa nilai ke dalam tabel hash
        stringHash.insert("Kucing"); 
        stringHash.insert("Ayam"); 
        stringHash.insert("Kelinci");

        // Mencari indeks dari nilai "Kelinci" dalam tabel hash
        System.out.println("String Kelinci ditemukan di index: " + stringHash.search("Kelinci")); 
    }
}
