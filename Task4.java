import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Initialize exchange rates (base currency is USD)
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85); // Example rate
        exchangeRates.put("GBP", 0.72); // Example rate
        // Add more currencies and their rates here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available currencies
        System.out.println("Available currencies:");
        for (String currency : exchangeRates.keySet()) {
            System.out.println(currency);
        }

        // Input base and target currencies
        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.next().toUpperCase();
        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.next().toUpperCase();

        // Input amount to convert
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        // Perform currency conversion
        double convertedAmount = convertCurrency(amount, baseCurrency, targetCurrency);

        // Display result
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }

    private static double convertCurrency(double amount, String baseCurrency, String targetCurrency) {
        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        return (amount / baseRate) * targetRate;
    }
}
