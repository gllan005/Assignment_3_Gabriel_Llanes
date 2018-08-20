
public class GoldDigger {
    private String coinName;
    private double goldPrice;
    private double coinPrice;
    private double shipAndHandle;
    private double tax;
    private double goldAmount;
    
    public GoldDigger(String coinName, double coinPrice, double goldPrice,
            double shipAndHandle, double tax, double goldAmount){
        this.coinName = coinName;
        this.coinPrice = coinPrice;
        this.goldPrice = goldPrice;
        this.shipAndHandle = shipAndHandle;
        this.tax = tax;
        this.goldAmount = goldAmount; //milligrams
    }
    
    public double numCoin(){
        double coinOunce;
        double conversion = 28350;
        
        coinOunce = conversion / this.goldAmount;
        
        return coinOunce;
    }
    
    public double premNumCoin(){
        double premPrice;

        //premium price is price of gold * number of coins to make an ounce * tax
        //plus shipping and handling
       premPrice = (this.goldPrice *numCoin() * tax) + shipAndHandle;
       
        return premPrice;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public double getGoldPrice() {
        return goldPrice;
    }

    public void setGoldPrice(double goldPrice) {
        this.goldPrice = goldPrice;
    }

    public double getCoinPrice() {
        return coinPrice;
    }

    public void setCoinPrice(double coinPrice) {
        this.coinPrice = coinPrice;
    }

    public double getShipAndHandle() {
        return shipAndHandle;
    }

    public void setShipAndHandle(double shipAndHandle) {
        this.shipAndHandle = shipAndHandle;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(double goldAmount) {
        this.goldAmount = goldAmount;
    }
       
}
