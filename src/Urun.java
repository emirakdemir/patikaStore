class Urun {
    private int id;
    private double birimFiyat;
    private String urunAdi;
    private Marka marka;

    public Urun(int id, String urunAdi, double birimFiyat, Marka marka) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.birimFiyat = birimFiyat;
        this.marka = marka;
    }

    public int getId() {
        return id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public Marka getMarka() {
        return marka;
    }
}
