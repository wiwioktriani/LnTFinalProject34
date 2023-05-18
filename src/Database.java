import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Database {

	public static void main(String[] args) {
		private List<Menu> menuList;

	    public Database() {
	        menuList = new ArrayList<>();
	    }

	    public void insertMenu(String namaMenu, double hargaMenu, int stokMenu) {
	        Random random = new Random();
	        String kodeMenu = "PD-" + random.nextInt(1000);
	        Menu menu = new Menu(kodeMenu, namaMenu, hargaMenu, stokMenu);
	        menuList.add(menu);
	        System.out.println("Menu berhasil ditambahkan!");
	    }

	    public void viewMenu() {
	        if (menuList.isEmpty()) {
	            System.out.println("Tidak ada menu yang tersedia.");
	        } else {
	            System.out.println("Daftar Menu:");
	            for (Menu menu : menuList) {
	                System.out.println("Kode Menu: " + menu.getKodeMenu());
	                System.out.println("Nama Menu: " + menu.getNamaMenu());
	                System.out.println("Harga Menu: " + menu.getHargaMenu());
	                System.out.println("Stok Menu: " + menu.getStokMenu());
	                System.out.println("-----------------------------");
	            }
	        }
	    }

	    public void updateMenu(String kodeMenu, double hargaBaru, int stokBaru) {
	        for (Menu menu : menuList) {
	            if (menu.getKodeMenu().equals(kodeMenu)) {
	                menu.setHargaMenu(hargaBaru);
	                menu.setStokMenu(stokBaru);
	                System.out.println("Menu berhasil diperbarui!");
	                return;
	            }
	        }
	        System.out.println("Menu dengan kode " + kodeMenu + " tidak ditemukan.");
	    }

	    public void deleteMenu(String kodeMenu) {
	        for (Menu menu : menuList) {
	            if (menu.getKodeMenu().equals(kodeMenu)) {
	                menuList.remove(menu);
	                System.out.println("Menu berhasil dihapus!");
	                return;
	            }
	        }
	        System.out.println("Menu dengan kode " + kodeMenu + " tidak ditemukan.");
	    }
	}