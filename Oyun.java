package Projelerim;
import java.util.Scanner;
public class Oyun {
    public static void main(String[] args) {




                OyunKutuphanesi gameLibrary = new OyunKutuphanesi();
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    // Menü kısmı
                    System.out.println("\nOyun Kütüphanesi Uygulaması");
                    System.out.println("1. Oyun Ekle");
                    System.out.println("2. Oyun Ara");
                    System.out.println("3. Oyun Listele");
                    System.out.println("4. Oyun Sil");
                    System.out.println("5. Oyun Güncelle");
                    System.out.println("6. Çıkış");
                    System.out.print("Seçiminizi yapın: ");
                    int secim = scanner.nextInt();
                    scanner.nextLine(); // nextInt() sonrası boşluğu temizlemek için

                    switch (secim) {
                        case 1:
                            // Oyun Ekleme
                            System.out.print("Oyun adı: ");
                            String oyunAdi = scanner.nextLine();
                            System.out.print("Oyun türü: ");
                            String oyunTuru = scanner.nextLine();
                            System.out.print("Oyun çıkış yılı: ");
                            int oyunYili = scanner.nextInt();
                            game yeniOyun = new game(oyunAdi, oyunTuru, oyunYili);
                            gameLibrary.addOyun(yeniOyun);
                            System.out.println("Oyun başarıyla eklendi.");
                            break;
                        case 2:
                            // Oyun Arama
                            System.out.print("Aramak istediğiniz oyun adını girin: ");
                            String arananOyun = scanner.nextLine();
                            gameLibrary.searchGame(arananOyun);
                            break;
                        case 3:
                            // Oyun Listeleme
                            gameLibrary.listGames();
                            break;
                        case 4:
                            // Oyun Silme
                            System.out.print("Silmek istediğiniz oyun adını girin: ");
                            String silinecekOyun = scanner.nextLine();
                            gameLibrary.removeGame(silinecekOyun);
                            break;
                        case 5:
                            // Oyun Güncelleme
                            System.out.print("Güncellemek istediğiniz oyun adını girin: ");
                            String eskiOyunAdi = scanner.nextLine();
                            gameLibrary.updateGame(eskiOyunAdi);
                            break;
                        case 6:
                            // Çıkış
                            System.out.println("Çıkılıyor...");
                            return;  // Program sonlanacak
                        default:
                            System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    }
                }
            }
        }

    class oyunlar {
        private String isim;
        private String tur;
        private String platform;
        private int cikisYili;

        public oyunlar(String isim, String tur, String platform, int cikisYili) {
            this.isim = isim;
            this.tur = tur;
            this.platform = platform;
            this.cikisYili = cikisYili;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public String getTur() {
            return tur;
        }

        public void setTur(String tur) {
            this.tur = tur;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public int getCikisYili() {
            return cikisYili;
        }

        public void setCikisYili(int cikisYili) {
            this.cikisYili = cikisYili;
        }

        @Override
        public String toString() {
            return "oyunlar{" +
                    "isim='" + isim + '\'' +
                    ", tur='" + tur + '\'' +
                    ", platform='" + platform + '\'' +
                    ", cikisYili=" + cikisYili +
                    '}';
        }
    }

