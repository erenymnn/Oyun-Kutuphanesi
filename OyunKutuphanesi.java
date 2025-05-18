package Projelerim;

import java.util.ArrayList;
import java.util.Scanner;

public class OyunKutuphanesi {
    private ArrayList<game> oyunlistesi;
   Scanner tara = new Scanner(System.in);
    public OyunKutuphanesi (){
        oyunlistesi = new ArrayList<>();
    }
    public  void addOyun(game Yenioyun) {
        for (game oyun : oyunlistesi) {
            if (oyun.getOyunadi().equalsIgnoreCase(Yenioyun.getOyunadi())) {
                System.out.println("Oyun zaten bulunuyor.");
                 // return ile metotdan cıkar.
                return ;
            }


        }
            oyunlistesi.add(Yenioyun);
            System.out.println(Yenioyun.getOyunadi() + " Oyun başarıyla eklendi.");

    }

    public void listGames() {
        if(oyunlistesi.isEmpty()) { // bu isEmpty() ise eğer oyun listesi boşsa kullanıcıya bilgi verir.
             System.out.println("Kütüphanede hiç oyun yok.");
        }else {//eğer oyunlistesi boş değilse her bir oyun ekrana yazdırılır.
            for(game oyun : oyunlistesi) {
                System.out.println(oyun);
            }
        }
    }
    // Oyun arama metodu
    public void searchGame(String oyunAdi) {
        boolean found = false;
        for (game oyun : oyunlistesi)
            if (oyun.getOyunadi().equalsIgnoreCase(oyunAdi)) {
                System.out.println(oyun);
                found = true;
                break;
            }
        if (!found) {
            System.out.println(oyunAdi + " adlı oyun bulunamadı.");
        }
    }
    // Oyun silme metodu
    public void removeGame(String oyunAdi) {
        boolean found = false;
        for (game oyun : oyunlistesi) {
            if (oyun.getOyunadi().equalsIgnoreCase(oyunAdi)) {
                oyunlistesi.remove(oyun);
                System.out.println(oyunAdi + " adlı oyun kütüphaneden silindi.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(oyunAdi + " adlı oyun bulunamadı.");
        }
    }
    // Oyun güncelleme metodu
    public void updateGame(String eskiAd) {
        boolean bulundu = false;
        for (game oyun : oyunlistesi) {
            if (oyun.getOyunadi().equalsIgnoreCase(eskiAd)) {


                System.out.println("Yeni oyun adını girin: ");
                String yeniAd = tara.nextLine();
                oyun.setOyunadi(yeniAd);

                System.out.println("Yeni oyun türünü girin: ");
                String yeniTur = tara.nextLine();
                oyun.setTur(yeniTur);

                System.out.println("Yeni çıkış yılını girin: ");
                int yeniYil = tara.nextInt();
                tara.nextLine();
                oyun.setYayinyili(yeniYil);

                System.out.println(eskiAd + " adlı oyun başarıyla güncellendi.");
                bulundu = true;
                break;
            }
        }
        if (!bulundu) {
            System.out.println(eskiAd + " adlı oyun bulunamadı.");
        }
    }


}


