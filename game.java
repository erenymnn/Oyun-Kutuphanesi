package Projelerim;


public class game {
    private String Oyunadi;
    private String Tur;
    private int yayinyili;

    public game(String oyunadi, String tur, int yayinyili) {
        Oyunadi = oyunadi;
        Tur = tur;

        this.yayinyili = yayinyili;
    }



    public String getOyunadi() {
        return Oyunadi;
    }

    public void setOyunadi(String oyunadi) {
        Oyunadi = oyunadi;
    }

    public String getTur() {
        return Tur;
    }

    public void setTur(String tur) {
        Tur = tur;
    }


    public int getYayinyili() {
        return yayinyili;
    }

    public void setYayinyili(int yayinyili) {
        this.yayinyili = yayinyili;
    }

    @Override
    public String toString() {
        return "game{" +
                "Oyunadi='" + Oyunadi + '\'' +
                ", Tur='" + Tur +
                ", yayinyili=" + yayinyili +
                '}';
    }
}
