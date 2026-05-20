import java.util.Arrays;

/**
 * Stack Implementation - LIFO (Last In First Out)
 * Tugas Struktur Data - Stack
 */
class Stack {
    private int[] stack;
    private int top;
    private int capacity;
    
    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    
    public void push(int data) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = data;
        System.out.println("Pushed: " + data);
    }
    
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int data = stack[top--];
        System.out.println("Popped: " + data);
        return data;
    }
    
    public void display() {
        if (top == -1) {
            System.out.println("Stack kosong!");
            return;
        }
        System.out.print("Isi Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        
        System.out.println("========================================");
        System.out.println("    STACK IMPLEMENTATION - LIFO");
        System.out.println("========================================");
        
        System.out.println("\n>>> Data Awal: KOSONG");
        stack.display();
        
        // Push 8 data integer
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("\n>>> Proses PUSH (Memasukkan 8 data):");
        System.out.println("--------------------------------------");
        for (int value : data) {
            stack.push(value);
        }
        System.out.println("\n>>> Stack SETELAH PUSH semua data:");
        stack.display();
        
        // Pop 2 data
        System.out.println("\n>>> Proses POP (Mengambil 2 data):");
        System.out.println("--------------------------------------");
        stack.pop(); // Mengambil data terakhir (80)
        System.out.println(">>> Stack SETELAH POP pertama:");
        stack.display();
        
        stack.pop(); // Mengambil data berikutnya (70)
        System.out.println(">>> Stack SETELAH POP kedua:");
        stack.display();
        
        // Penjelasan LIFO
        System.out.println("\n========================================");
        System.out.println("    PENJELASAN KONSEP LIFO");
        System.out.println("========================================");
        System.out.println("LIFO (Last In First Out) adalah prinsip");
        System.out.println("di mana elemen yang PALING AKHIR masuk ");
        System.out.println("akan menjadi elemen yang PALING AWAL");
        System.out.println("keluar dari struktur data.");
        System.out.println("");
        System.out.println("Contoh dalam kehidupan nyata:");
        System.out.println("- Tumpukan piring: ambil paling atas");
        System.out.println("- Undo di Microsoft Word");
        System.out.println("- Browser back button");
        System.out.println("- Stack pakaian");
        
        // Analisis Kompleksitas Waktu
        System.out.println("\n========================================");
        System.out.println("    ANALISIS KOMPLEKSITAS WAKTU");
        System.out.println("========================================");
        System.out.println("1. PUSH (Memasukkan data): O(1)");
        System.out.println("   - Hanya menambahkan di posisi top");
        System.out.println("   - Waktu konstan, tidak perlu loop");
        System.out.println("");
        System.out.println("2. POP (Mengambil data): O(1)");
        System.out.println("   - Hanya mengambil di posisi top");
        System.out.println("   - Waktu konstan, tidak perlu loop");
        System.out.println("");
        System.out.println("3. DISPLAY (Menampilkan): O(n)");
        System.out.println("   - Perlu遍历 seluruh elemen");
        System.out.println("   - Waktu proporsional dengan ukuran");
    }
}
