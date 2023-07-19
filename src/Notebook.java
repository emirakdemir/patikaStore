class Notebook extends Urun {
    private int depolama;
    private String ram;

    public Notebook(int id, String urunAdi, double birimFiyat, Marka marka, int depolama, String ram) {
        super(id, urunAdi, birimFiyat, marka);
        this.depolama = depolama;
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public String getRam() {
        return ram;
    }
}
