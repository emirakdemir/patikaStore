class CepTelefonu extends Urun {
    private int depolama;
    private double ekran;
    private int kamera;
    private double pilGucu;
    private int ram;
    private String renk;

    public CepTelefonu(int id, String urunAdi, double birimFiyat, Marka marka, int depolama, double ekran,
                       int kamera, double pilGucu, int ram, String renk) {
        super(id, urunAdi, birimFiyat, marka);
        this.depolama = depolama;
        this.ekran = ekran;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public int getDepolama() {
        return depolama;
    }

    public double getEkran() {
        return ekran;
    }

    public int getKamera() {
        return kamera;
    }

    public double getPilGucu() {
        return pilGucu;
    }

    public int getRam() {
        return ram;
    }

    public String getRenk() {
        return renk;
    }
}