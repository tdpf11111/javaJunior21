package Hilodilnuk;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProdukt("Яблоко",5);
        holodilnik.addProdukt("Груша",3);
        holodilnik.addProdukt("Слива",2);
        holodilnik.addProdukt("Яблоко",7);


        holodilnik.printAllProdukts();



    }
}
