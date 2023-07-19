import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    private static List<Marka> markalar = new ArrayList<>();
    private static List<CepTelefonu> cepTelefonlari = new ArrayList<>();
    private static List<Notebook> notebooklar = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        markalariOlustur();
        menuGoster();
    }

    private static void markalariOlustur() {
        markalar.add(new Marka(1, "Samsung"));
        markalar.add(new Marka(2, "Lenovo"));
        markalar.add(new Marka(3, "Apple"));
        markalar.add(new Marka(4, "Huawei"));
        markalar.add(new Marka(5, "Casper"));
        markalar.add(new Marka(6, "Asus"));
        markalar.add(new Marka(7, "HP"));
        markalar.add(new Marka(8, "Xiaomi"));
        markalar.add(new Marka(9, "Monster"));

        notebooklar.add(new Notebook(1, "HUAWEI Matebook 14", 7000.0, markalar.get(3), 512, "16 GB"));
        notebooklar.add(new Notebook(2, "LENOVO V14 IGL", 3699.0, markalar.get(1), 1024, "8 GB"));
        notebooklar.add(new Notebook(3, "ASUS Tuf Gaming", 8199.0, markalar.get(6), 2048, "32 GB"));



        cepTelefonlari.add(new CepTelefonu(1, "SAMSUNG GALAXY A51", 3199.0, markalar.get(0), 128, 6.5, 32, 4000.0, 6, "Siyah"));
        cepTelefonlari.add(new CepTelefonu(2, "iPhone 11 64 GB", 7379.0, markalar.get(2), 64, 6.1, 5, 3046.0, 6, "Mavi"));
        cepTelefonlari.add(new CepTelefonu(3, "Redmi Note 10 Pro 8GB", 4012.0, markalar.get(7), 128, 6.5, 35, 4000.0, 12, "Beyaz"));
    }


    private static void menuGoster() {
        int secim;
        do {
            System.out.println("\nPatikaStore Ürün Yönetim Paneli!");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    notebookIslemleri();
                    break;
                case 2:
                    cepTelefonuIslemleri();
                    break;
                case 3:
                    markalariListele();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
            }
        } while (secim != 0);
    }

    private static void notebookIslemleri() {
        int secim;
        do {
            System.out.println("\nNotebook İşlemleri");
            System.out.println("1 - Notebook Listele");
            System.out.println("2 - Notebook Ekle");
            System.out.println("3 - Notebook Sil");
            System.out.println("0 - Geri Dön");
            System.out.print("Tercihiniz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    notebooklariListele();
                    break;
                case 2:
                    notebookEkle();
                    break;
                case 3:
                    notebookSil();
                    break;
                case 0:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
            }
        } while (secim != 0);
    }

    private static void cepTelefonuIslemleri() {
        int secim;
        do {
            System.out.println("\nCep Telefonu İşlemleri");
            System.out.println("1 - Cep Telefonu Listele");
            System.out.println("2 - Cep Telefonu Ekle");
            System.out.println("3 - Cep Telefonu Sil");
            System.out.println("0 - Geri Dön");
            System.out.print("Tercihiniz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    cepTelefonlariniListele();
                    break;
                case 2:
                    cepTelefonuEkle();
                    break;
                case 3:
                    cepTelefonuSil();
                    break;
                case 0:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
            }
        } while (secim != 0);
    }

    private static void markalariListele() {
        System.out.println("\nMarkalarımız");
        System.out.println("--------------");
        markalar.stream()
                .map(Marka::getName)
                .sorted()
                .forEach(System.out::println);
    }

    private static void notebooklariListele() {
        System.out.println("\nNotebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %-28s | %-9s | %-9s | %-9s | %-9s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooklar) {
            System.out.printf("| %2d | %-28s | %-9.2f | %-9s | %-9d | %-9s |\n",
                    notebook.getId(), notebook.getUrunAdi(), notebook.getBirimFiyat(), notebook.getMarka().getName(),
                    notebook.getDepolama(), notebook.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    private static void cepTelefonlariniListele() {
        System.out.println("\nCep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %-28s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (CepTelefonu cepTelefonu : cepTelefonlari) {
            System.out.printf("| %2d | %-28s | %-9.2f | %-9s | %-9d | %-9.1f | %-9d | %-9.1f | %-9d | %-9s |\n",
                    cepTelefonu.getId(), cepTelefonu.getUrunAdi(), cepTelefonu.getBirimFiyat(),
                    cepTelefonu.getMarka().getName(), cepTelefonu.getDepolama(), cepTelefonu.getEkran(),
                    cepTelefonu.getKamera(), cepTelefonu.getPilGucu(), cepTelefonu.getRam(), cepTelefonu.getRenk());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
    private static void notebookEkle() {
        System.out.println("\nNotebook Ekle");
        System.out.print("Ürün adı: ");
        String urunAdi = scanner.next();
        System.out.print("Birim fiyatı: ");
        double birimFiyat = scanner.nextDouble();
        System.out.print("Marka ID'si: ");
        int markaId = scanner.nextInt();
        Marka marka = markalar.stream()
                .filter(m -> m.getId() == markaId)
                .findFirst()
                .orElse(null);
        if (marka == null) {
            System.out.println("Geçersiz marka ID'si!");
            return;
        }
        System.out.print("Depolama (GB): ");
        int depolama = scanner.nextInt();
        System.out.print("RAM (GB): ");
        int ram = scanner.nextInt();
        System.out.println("Notebook başarıyla eklendi.");
        int id = notebooklar.size() + 1;
        notebooklar.add(new Notebook(id, urunAdi, birimFiyat, marka, depolama, String.valueOf(ram)));
    }

    private static void cepTelefonuEkle() {
        System.out.println("\nCep Telefonu Ekle");
        System.out.print("Ürün adı: ");
        String urunAdi = scanner.next();
        System.out.print("Birim fiyatı: ");
        double birimFiyat = scanner.nextDouble();
        System.out.print("Marka ID'si: ");
        int markaId = scanner.nextInt();
        Marka marka = markalar.stream()
                .filter(m -> m.getId() == markaId)
                .findFirst()
                .orElse(null);
        if (marka == null) {
            System.out.println("Geçersiz marka ID'si!");
            return;
        }
        System.out.print("Depolama (GB): ");
        int depolama = scanner.nextInt();
        System.out.print("Ekran boyutu (inç): ");
        double ekran = scanner.nextDouble();
        System.out.print("Kamera (MP): ");
        int kamera = scanner.nextInt();
        System.out.print("Pil gücü (mAh): ");
        double pilGucu = scanner.nextDouble();
        System.out.print("RAM (GB): ");
        int ram = scanner.nextInt();
        System.out.print("Renk: ");
        String renk = scanner.next();
        System.out.println("Cep telefonu başarıyla eklendi.");
        int id = cepTelefonlari.size() + 1;
        cepTelefonlari.add(new CepTelefonu(id, urunAdi, birimFiyat, marka, depolama, ekran, kamera, pilGucu, ram, renk));
    }

    private static void notebookSil() {
        System.out.println("\nNotebook Sil");
        System.out.print("Silinecek notebook ID'si: ");
        int id = scanner.nextInt();
        boolean removed = notebooklar.removeIf(notebook -> notebook.getId() == id);
        if (removed) {
            System.out.println("Notebook başarıyla silindi.");
        } else {
            System.out.println("Belirtilen ID'ye sahip bir notebook bulunamadı!");
        }
    }

    private static void cepTelefonuSil() {
        System.out.println("\nCep Telefonu Sil");
        System.out.print("Silinecek cep telefonu ID'si: ");
        int id = scanner.nextInt();
        boolean removed = cepTelefonlari.removeIf(cepTelefonu -> cepTelefonu.getId() == id);
        if (removed) {
            System.out.println("Cep telefonu başarıyla silindi.");
        } else {
            System.out.println("Belirtilen ID'ye sahip bir cep telefonu bulunamadı!");
        }
    }
}