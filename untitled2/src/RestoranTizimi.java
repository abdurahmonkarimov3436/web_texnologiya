// RestoranTizimi.java
import java.util.ArrayList;
import java.util.Scanner;

public class RestoranTizimi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== RESTORAN BUYURTMA TIZIMI ===\n");

        // Menyu yaratish
        ArrayList<MenuItem> menyu = new ArrayList<>();
        menyu.add(new MenuItem("O'sh", 25000, "Asosiy taom"));
        menyu.add(new MenuItem("Lagmon", 22000, "Asosiy taom"));
        menyu.add(new MenuItem("Somsa", 8000, "Gazaklar"));
        menyu.add(new MenuItem("Choy", 3000, "Ichimliklar"));
        menyu.add(new MenuItem("Coca-Cola", 7000, "Ichimliklar"));
        menyu.add(new MenuItem("Achiq-chuchuk", 15000, "Salatlar"));

        // Ofitsiant
        Waiter ofitsiant = new Waiter("Aziz", 5);

        boolean davomEt = true;

        while (davomEt) {
            System.out.println("\n--- MENYU ---");
            for (int i = 0; i < menyu.size(); i++) {
                System.out.println((i + 1) + ". " + menyu.get(i));
            }

            System.out.print("\nTaom raqamini tanlang (0 - chiqish): ");
            int tanlov = scanner.nextInt();

            if (tanlov == 0) {
                davomEt = false;
                break;
            }

            if (tanlov < 1 || tanlov > menyu.size()) {
                System.out.println("❌ Noto‘g‘ri tanlov. Qayta urinib ko‘ring.");
                continue;
            }

            MenuItem tanlangan = menyu.get(tanlov - 1);
            System.out.print(tanlangan.getNomi() + " dan nechta buyurtma qilasiz? ");
            int soni = scanner.nextInt();

            ofitsiant.buyurtmaQabul(tanlangan, soni);
        }

        // Hisobni chiqarish
        System.out.println("\nBuyurtma yakunlandi!");
        ofitsiant.hisobVaroqiniChop();
        ofitsiant.buyurtmalarniKorsat();
    }
}
