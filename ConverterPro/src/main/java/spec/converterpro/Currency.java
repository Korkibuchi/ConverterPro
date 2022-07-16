
package spec.converterpro;



public enum Currency {
    USD("USD", 431), EUR("EUR",451),RUB("RUB",456), GBP("GBP", 826), BTC("BTC", 1010), KZT("KZT", 398);

    private final int id;
    private final String name;

    private Currency(String name, int id) {
        this.id = id;
        this.name = name;
    }
    
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
    
}