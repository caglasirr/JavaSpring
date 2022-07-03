package Services;

import Factory.ProductFactory;
import Factory.ProductFactoryImp;
import Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductService {

    private ProductService() {}

    private static ProductService productService = new ProductService();

    public static ProductService getProductService(){
        return productService;
    }

    ProductFactoryImp productFactoryImp = new ProductFactoryImp();

    public List<Product> createProducts(){
        List<Product> products = new ArrayList<>();

        products.add(productFactoryImp.create("FOOD"));
        products.add(productFactoryImp.create("FOOD"));
        products.add(productFactoryImp.create("FOOD"));
        products.add(productFactoryImp.create("ELECTRONICS"));
        products.add(productFactoryImp.create("ELECTRONICS"));
        products.add(productFactoryImp.create("ELECTRONICS"));
        //products.add(new Product("iPhone 12", 100));
        //products.add(new Product("MacBook Pro", 400));
        //products.add(new Product("MacBook air", 350));
        //products.add(new Product("Mac Mini", 300));
        //products.add(new Product("Xiaomi Redmi Note 6", 500));
        //products.add(new Product("Huawei P9 Lite", 600));
        return products;
    }
}
