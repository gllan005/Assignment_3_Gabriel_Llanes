
public class GoldTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GoldDigger ob = new GoldDigger("$50 GOld Buffalo", 1242.30, 9.95,
                4.95, .075, 14.0);
        
        System.out.println("Coin Name: " + ob.getCoinName());
        System.out.println("Gold Price: " + ob.getGoldPrice());
        System.out.println("Coin Price: " + ob.getCoinPrice());
        System.out.println("Shipping and Handling: " + ob.getShipAndHandle());
        System.out.println("Tax Rate: " + ob.getTax());
        System.out.println("Milligrams of Gold in Coin: " + ob.getGoldAmount());
           
        System.out.println("Number of coins for an ounce: " + ob.numCoin());
        System.out.println("Premium Amount: " + ob.premNumCoin());
        
        ob.setGoldPrice(1655.5);
        
        System.out.println("Modified Gold Price: " + ob.getGoldPrice());
        System.out.println("Modified Premium Amount: " + ob.premNumCoin());


    }
    }
    

