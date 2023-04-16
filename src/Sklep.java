public class Sklep {
    private String Id;
    private String Nazwa;
    private String Miejscowosc;

    public Sklep (){};
    public Sklep(String Id, String Nazwa, String Miejscowosc){
        this.Id = Id;
        this.Nazwa = Nazwa;
        this.Miejscowosc = Miejscowosc;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "Id='" + Id + '\'' +
                ", Nazwa='" + Nazwa + '\'' +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                '}';
    }
}
