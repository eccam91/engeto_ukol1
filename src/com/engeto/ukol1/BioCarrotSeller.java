import java.net.InetAddress;
import java.time.LocalDate;

public class BioCarrotSeller {
    String name, surname, cityOfResidence;
    LocalDate dateOfBirth;
    int numberOfContracts;
    double grossSalesInTones;
    String licencePlate;
    double fuelConsumption; // liters per 100 kilometers
    String ipAdress;

    public static double averageSales(double grossSales, int contracts) {
        return (grossSales/contracts);
    }
}
