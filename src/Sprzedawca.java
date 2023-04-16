public class Sprzedawca {
    private String Id;
    private String Imie;
    private String Nazwisko;
    private String Miejscowosc;

    public Sprzedawca() {
    }

    ;

    public Sprzedawca(String Id, String Imie, String Nazwisko, String Miejscowosc) {
        this.Id = Id;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Miejscowosc = Miejscowosc;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return "Sprzedawca{" +
                "Id='" + Id + '\'' +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                '}';
    }
}
