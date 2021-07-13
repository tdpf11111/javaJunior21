package Hilodilnuk;

import java.util.HashMap;

public class Holodilnik {
    private HashMap<String, Integer> produkts = new HashMap<>();

    public void addProdukt(String produkt, int value) {
        produkts.put(produkt, value);

    }

    public void printAllProdukts() {
        for (String produkt : produkts.keySet()) {
            System.out.println(produkt + "-" + produkts.get(produkt));

        }

    }


}
