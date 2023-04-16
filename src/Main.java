public class Main {
    public static void main(String[] args) {
   /* 2.Stwórz klasę Klient z polami: id, imie, nazwisko, miejscowość. Dla klas zdefiniuj także toString() –
    dzięki, której wyświetlisz informację o obiektach w konsoli.
    3.Stwórz klasę Car z polami: id, marka, model,  rok_produkcji, pojemność_silnika, przebieg, paliwo,
    kraj_pochodzenia, kolor, cena. Dla klas zdefiniuj także toString() –
    dzięki, której wyświetlisz informację o obiektach w konsoli.
    4.Stwórz klasę z polami: Sprzedawca z polami: id, imie, nazwisko, miejscowosc.
    Dla klas zdefiniuj także toString() – dzięki, której wyświetlisz informację o obiektach w konsoli.
    5.Stwórz klasę Sklep z polami: id, nazwa, miejscowość. Dla klas zdefiniuj także toString() –
    dzięki, której wyświetlisz informację o obiektach w konsoli.
    */

        Klient klient = new Klient("001", "Kamil", "Licau", "Gdańsk");
        Car car = new Car("514", "Audi", "A3 8Y", "2021", "2.0l",
                "38 000km", "Diesel", "Niemcy", "Granatowy", "75 000zł");
        Sprzedawca sprzedawca = new Sprzedawca("014", "Bartłomiej", "Konke", "Gdynia");
        Sklep sklep = new Sklep("003", "Salon samochodów używanych", "Gdynia");

        System.out.println(klient.toString() + "\n" + car.toString() + "\n" + sprzedawca.toString() + "\n"
                + sklep.toString());

    }
}