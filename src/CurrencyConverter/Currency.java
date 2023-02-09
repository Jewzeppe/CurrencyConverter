package CurrencyConverter;

import java.util.ArrayList;
import java.util.HashMap;


public class Currency {
    public static void main(String[] args) {
        // метод инициализации
    }

    private String name, shortName;
    private final HashMap<String, Double> exchangeValues = new HashMap<>();


    public Currency(String nameValue, String shortNameValue) {

        this.name = nameValue;

        this.shortName = shortNameValue;
}

    public String getName() {

        return this.name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public String getShortName() {

        return this.shortName;

    }


    public void setShortName(String shortName) {

        this.shortName = shortName;

    }


    public HashMap<String, Double> getExchangeValues() {

        return this.exchangeValues;

    }


    public void setExchangeValues(String key, Double value) {

        this.exchangeValues.put(key, value);

    }


    public void defaultValues() {

        String currency = this.name;

        switch (currency) {

            case ("Доллар США"):

            this.exchangeValues.put("USD", 1.00);

            this.exchangeValues.put("EUR", 0.93);

            this.exchangeValues.put("GBP", 0.66);

            this.exchangeValues.put("CHF", 1.01);

            this.exchangeValues.put("CNY", 6.36);

            this.exchangeValues.put("JPY", 123.54);

            break;

            case "Евро":

            this.exchangeValues.put("USD", 1.073);

            this.exchangeValues.put("EUR", 1.00);

            this.exchangeValues.put("GBP", 0.71);

            this.exchangeValues.put("CHF", 1.08);

            this.exchangeValues.put("CNY", 6.83);

            this.exchangeValues.put("JPY", 132.57);

            break;

            case "Британский фунт":

            this.exchangeValues.put("USD", 1.51);

            this.exchangeValues.put("EUR", 1.41);

            this.exchangeValues.put("GBP", 1.00);

            this.exchangeValues.put("CHF", 1.52);

            this.exchangeValues.put("CNY", 9.0);

            this.exchangeValues.put("JPY", 186.41);

            break;

            case "Швейцарский франк":

            this.exchangeValues.put("USD", 0.9);

            this.exchangeValues.put("EUR", 0.93);

            this.exchangeValues.put("GBP", 0.66);

            this.exchangeValues.put("CHF", 1.00);

            this.exchangeValues.put("CNY", 6.33);

            this.exchangeValues.put("JPY", 122.84);

            break;

            case "Китайский юань Юаньминби":

            this.exchangeValues.put("USD", 0.16);

            this.exchangeValues.put("EUR", 0.15);

            this.exchangeValues.put("GBP", 0.11);

            this.exchangeValues.put("CHF", 0.16);

            this.exchangeValues.put("CNY", 1.00);

            this.exchangeValues.put("JPY", 19.41);

            break;

            case "Японская иена":

            this.exchangeValues.put("USD", 0.008);

            this.exchangeValues.put("EUR", 0.007);

            this.exchangeValues.put("GBP", 0.005);

            this.exchangeValues.put("CHF", 0.008);

            this.exchangeValues.put("CNY", 0.051);

            this.exchangeValues.put("JPY", 1.000);

            break;

        }
    }


    public static ArrayList<Currency> init() {

        ArrayList<Currency> currs = new ArrayList<>();

        currs.add(new Currency ("Доллар США", "USD"));

        currs.add(new Currency ("Евро", "евро"));

        currs.add(new Currency ("Британский фунт", "GBP"));

        currs.add(new Currency ("Швейцарский франк", "CHF"));

        currs.add(new Currency ("Китайский юань юаньминби", "CNY"));

        currs.add(new Currency ("Японская иена", "JPY"));

        for (Currency curr : currs) {

            curr.defaultValues();

        }

        return currs;

    }


    public static double toDouble (Double sum, Double exchangeValue) {

        double price;

        price = sum * exchangeValue;

        price = Math.round(price * 100d) / 100d;

        return price;

    }

}
