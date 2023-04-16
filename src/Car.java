public class Car {
    private String Id;
    private String Marka;
    private String Model;
    private String Rok_produkcji;
    private String Pojemnosc_silnika;
    private String Przebieg;
    private String Paliwo;
    private String Kraj_pochodzenia;
    private String Kolor;
    private String Cena;

    public Car (){};

    public Car (String Id, String Marka, String Model, String Rok_produkcji, String Pojemnosc_silnika,
                String Przebieg, String Paliwo, String Kraj_pochodzenia, String Kolor, String Cena){
        this.Id = Id;
        this.Marka = Marka;
        this.Model = Model;
        this.Rok_produkcji = Rok_produkcji;
        this.Pojemnosc_silnika = Pojemnosc_silnika;
        this.Przebieg = Przebieg;
        this.Paliwo = Paliwo;
        this.Kraj_pochodzenia = Kraj_pochodzenia;
        this.Kolor = Kolor;
        this.Cena = Cena;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getRok_produkcji() {
        return Rok_produkcji;
    }

    public void setRok_produkcji(String rok_produkcji) {
        Rok_produkcji = rok_produkcji;
    }

    public String getPojemnosc_silnika() {
        return Pojemnosc_silnika;
    }

    public void setPojemnosc_silnika(String pojemnosc_silnika) {
        Pojemnosc_silnika = pojemnosc_silnika;
    }

    public String getPrzebieg() {
        return Przebieg;
    }

    public void setPrzebieg(String przebieg) {
        Przebieg = przebieg;
    }

    public String getPaliwo() {
        return Paliwo;
    }

    public void setPaliwo(String paliwo) {
        Paliwo = paliwo;
    }

    public String getKraj_pochodzenia() {
        return Kraj_pochodzenia;
    }

    public void setKraj_pochodzenia(String kraj_pochodzenia) {
        Kraj_pochodzenia = kraj_pochodzenia;
    }

    public String getKolor() {
        return Kolor;
    }

    public void setKolor(String kolor) {
        Kolor = kolor;
    }

    public String getCena() {
        return Cena;
    }

    public void setCena(String cena) {
        Cena = cena;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id='" + Id + '\'' +
                ", Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", Rok_produkcji='" + Rok_produkcji + '\'' +
                ", Pojemnosc_silnika='" + Pojemnosc_silnika + '\'' +
                ", Przebieg='" + Przebieg + '\'' +
                ", Paliwo='" + Paliwo + '\'' +
                ", Kraj_pochodzenia='" + Kraj_pochodzenia + '\'' +
                ", Kolor='" + Kolor + '\'' +
                ", Cena='" + Cena + '\'' +
                '}';
    }
}
