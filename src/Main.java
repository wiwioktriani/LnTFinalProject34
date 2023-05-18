import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert Menu Baru");
            System.out.println("2. View Menu");
            System.out.println("3. Update Menu");
            System.out.println("4. Delete Menu");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (0-4): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Terima kasih!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama menu: ");
                    String namaMenu = scanner.next();
                    System.out.print("Masukkan harga menu: ");
                    double hargaMenu = scanner.nextDouble();
                    System.out.print("Masukkan stok menu: ");
                    int stokMenu = scanner.nextInt();
                    database.insertMenu(namaMenu, hargaMenu, stokMenu);
                    break;
                case 2:
                    database.viewMenu();
                    break;
                case 3:
                    System.out.print("Masukkan kode menu yang ingin diupdate: ");
                    String kodeMenuUpdate = scanner.next();
                    System.out.print("Masukkan harga baru: ");
                    double hargaBaru = scanner.nextDouble();
                    System.out.print("Masukkan stok baru: ");
                    int stokBaru = scanner.nextInt();
                    database.updateMenu(kodeMenuUpdate, hargaBaru, stokBaru);
                    break;
                case 4:
                    System.out.print("Masukkan kode menu yang ingin dihapus: ");
                    String kodeMenuDelete = scanner.next();
                    database.deleteMenu(kodeMenuDelete);
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }

            System.out.println();
        }

        scanner.close();
    }
}