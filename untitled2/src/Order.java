// Order sinfi - buyurtma uchun
class Order {
    private MenuItem taom;
    private int miqdori;

    public Order(MenuItem taom, int miqdori) {
        this.taom = taom;
        this.miqdori = miqdori;
    }

    public MenuItem getTaom() {
        return taom;
    }

    public int getMiqdori() {
        return miqdori;
    }

    public double jamiNarx() {
        return taom.getNarxi() * miqdori;
    }



}
