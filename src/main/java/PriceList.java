import java.util.HashMap;

public class PriceList {

    private static HashMap<String, Integer> mapa = null;
    private static PriceList priceList = null;

    public static PriceList getInstance(){

        if(priceList == null){
            priceList = new PriceList();
            mapa =new HashMap<String, Integer>();
        }
        return priceList;
    }

    public
}
