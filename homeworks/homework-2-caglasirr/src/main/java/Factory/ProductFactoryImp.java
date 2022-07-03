package Factory;

import Model.ElectronicProduct;
import Model.FoodProduct;
import Model.Product;

import java.util.HashMap;
import java.util.Random;

//Factory Design Pattern kullanılarak Product nesnesi oluşturuldu.
public class ProductFactoryImp implements ProductFactory {
    private static Random random = new Random();
    public static HashMap<String, Integer> hashMap = new HashMap();

    private static String[] productNames = {"Iphone 7", "Iphone 8", "Xiaomi Redmi Note 6 Pro",
            "Samsung Galaxy Note 5", "MacBook Pro", "MacBook Mini", "Airpods"};

    public static String createName(){
        int randomInt = random.nextInt(7);
        return productNames[randomInt];
    }

    public static int createPrice(){
        int randomInt = random.nextInt(600);
        return randomInt;
    }

    @Override
    public Product create(String productType) {

            int price = createPrice();
            String name = createName();
            if(productType == null){
                return null;
            }
            if(productType.equalsIgnoreCase("FOOD")){
                return new FoodProduct(name, price);

            } else if(productType.equalsIgnoreCase("ELECTRONICS")){
                return new ElectronicProduct(name, price);

            }
            return null;

    }
}


