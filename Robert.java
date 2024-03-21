import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Robert {
    public static void main(String[] args) {
        Queue<String> toDoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** To Do List ***");
            System.out.println("1. Tambah Pekerjaan");
            System.out.println("2. Tampilkan Pekerjaan yang Harus Diselesaikan");
            System.out.println("3. Selesaikan Pekerjaan");
            System.out.println("4. Tampilkan Semua Pekerjaan");
            System.out.println("5. Keluar");
            System.out.print("Pilih fitur: ");
            int fitur = scanner.nextInt();
            scanner.nextLine(); 

            switch (fitur) {
                case 1:
                    System.out.print("Masukkan nama pekerjaan: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Pekerjaan berhasil ditambahkan!");
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("To Do List kosong.");
                    } else {
                        System.out.println("Pekerjaan yang harus diselesaikan: " + toDoList.peek());
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("To Do List kosong.");
                    } else {
                        System.out.println("Pekerjaan " + toDoList.poll() + " telah diselesaikan.");
                    }
                    break;
                case 4:
                    if (toDoList.isEmpty()) {
                        System.out.println("To Do List kosong.");
                    } else {
                        System.out.println("Isi To Do List:");
                        for (String t : toDoList) {
                            System.out.println("- " + t);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Fitur tidak valid. Silakan pilih fitur yang tersedia.");
            }
        }
    }
}