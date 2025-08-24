package model;

public class Kitap {
    private int id;
    private String baslik;
    private String yazar;
    private boolean oduncAlindi;

    public Kitap(int id, String baslik, String yazar, boolean oduncAlindi) {
        this.id = id;
        this.baslik = baslik;
        this.yazar = yazar;
        this.oduncAlindi = oduncAlindi;
    }

    public int getId() { return id; }
    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public boolean isOduncAlindi() { return oduncAlindi; }

    public void setId(int id) { this.id = id; }
    public void setBaslik(String baslik) { this.baslik = baslik; }
    public void setYazar(String yazar) { this.yazar = yazar; }
    public void setOduncAlindi(boolean oduncAlindi) { this.oduncAlindi = oduncAlindi; }

    @Override
    public String toString() {
        return id + " - " + baslik + " | " + yazar + " | " + (oduncAlindi ? "Ödünçte" : "Mevcut");
    }
}
