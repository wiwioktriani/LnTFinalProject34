import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		    private String kodeMenu;
		    private String namaMenu;
		    private double hargaMenu;
		    private int stokMenu;

		    public Menu(String kodeMenu, String namaMenu, double hargaMenu, int stokMenu) {
		        this.kodeMenu = kodeMenu;
		        this.namaMenu = namaMenu;
		        this.hargaMenu = hargaMenu;
		        this.stokMenu = stokMenu;
		    }

		    public String getKodeMenu() {
		        return kodeMenu;
		    }

		    public String getNamaMenu() {
		        return namaMenu;
		    }

		    public double getHargaMenu() {
		        return hargaMenu;
		    }

		    public int getStokMenu() {
		        return stokMenu;
		    }

		    public void setHargaMenu(double hargaMenu) {
		        this.hargaMenu = hargaMenu;
		    }

		    public void setStokMenu(int stokMenu) {
		        this.stokMenu = stokMenu;
		    }
		}
