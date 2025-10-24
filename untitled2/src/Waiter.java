// Waiter.java
import java.util.ArrayList;

public class Waiter {
    private String ism;
    private int tajribaYil;
    private ArrayList<Order> buyurtmalar = new ArrayList<>();

    public Waiter(String ism, int tajribaYil) {
        this.ism = ism;
        this.tajribaYil = tajribaYil;
    }

    // Buyurtma qabul qilish
    public void buyurtmaQabul(MenuItem item, int soni) {
        buyurtmalar.add(new Order(item, soni));
        System.out.println("✅ " + item.getNomi() + " (" + soni + " dona) buyurtma qabul qilindi.");
    }

    // Hisob varoqa chop etish
    public void hisobVaroqiniChop() {
        System.out.println("\n=== HISOB VAROQA ===");
        double jami = 0;
        for (Order b : buyurtmalar) {
            double summa = b.jamiNarx();
            System.out.println(b.getTaom().getNomi() + " (" + b.getMiqdori() + "x) - " + summa + " so'm");
            jami += summa;
        }
        System.out.println("----------------------");
        System.out.println("Umumiy summa: " + jami + " so'm");
    }

    // Buyurtmalarni ko‘rsatish
    public void buyurtmalarniKorsat() {
        System.out.println("\n" + ism + " ofitsiantning buyurtmalari:");
        int i = 1;
        for (Order b : buyurtmalar) {
            System.out.println(i + ". " + b.getTaom().getNomi() + " (" + b.getMiqdori() + " dona)");
            i++;

        }
    }
}