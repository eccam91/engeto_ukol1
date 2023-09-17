import java.math.BigDecimal;
import java.net.InetAddress;
import java.time.LocalDate;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.valueOf(0); // Nastavíme do proměnné hodnotu 0

        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
        }

        System.out.println(cena);
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        BioCarrotSeller biocarrotSeller = new BioCarrotSeller();
        biocarrotSeller.name = "Jan";
        biocarrotSeller.surname = "Suchořípa";
        biocarrotSeller.cityOfResidence = "Lovosice";
        biocarrotSeller.dateOfBirth = LocalDate.of(1965, 5, 30);
        biocarrotSeller.numberOfContracts = 4;
        biocarrotSeller.grossSalesInTones = 5.5;
        biocarrotSeller.licencePlate = "1U1 6875";
        biocarrotSeller.fuelConsumption = 7;
        biocarrotSeller.ipAdress = "185.112.167.36";

        double averageSales = biocarrotSeller.averageSales(biocarrotSeller.grossSalesInTones, biocarrotSeller.numberOfContracts);

        System.out.println("Prodejce " + biocarrotSeller.name + " " + biocarrotSeller.surname + " prodává průměrně " + averageSales + " tun mrkve na jednu smlouvu.");

    }
}
