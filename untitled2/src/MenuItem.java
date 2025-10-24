// MenuItem sinfi - menyu elementlari uchun
class MenuItem {
    private String nomi;
    private double narxi;
    private String kategoriya;

    public MenuItem(String nomi, double narxi, String kategoriya) {
        this.nomi = nomi;
        this.narxi = narxi;
        this.kategoriya = kategoriya;
    }

    public String getNomi() {
        return nomi;
    }

    public double getNarxi() {
        return narxi;
    }

    public String getKategoriya() {
        return kategoriya;
    }

    @Override
    public String toString() {
        return nomi + " - " + narxi + " so'm (" + kategoriya + ")";
    }
}
