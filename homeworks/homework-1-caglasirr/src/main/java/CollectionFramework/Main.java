package CollectionFramework;

import Model.Product;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Java'da Collection Framework'ün özünü Collection interface'i oluşturur. Collection'ın altında List, Set, Queue gibi interfaceler vardır ve bunların implementasyonu ile birlikte HashMap, ArrayList, LinkedList,
        //HashSet gibi sınıflar görürüz.
        //Hashmap, Map interfaceinin bir implementasyonudur. Key ve Value şeklinde değerlerden oluşur.
        //Tekrarlı değerlere izin vermez.

//        HashMap<String, Integer> hashMap = new HashMap();
//        hashMap.put("Iphone 12", 500);
//        hashMap.put("Xiaomi", 400);
//        hashMap.put("Samsung", 300);
//        hashMap.put("Samsung", 300);
//
//        for (String item: hashMap.keySet())
//        {System.out.println(item+": "+hashMap.get(item));
//        }

        //ArrayList, List interfaceinin bir implementasyonudur. Tekrarlı elemanlara izin verir.
        //Dinamik dizi yapısındadır. Data'ya erişmek ArrayList'e göre daha kolaydır.
        List<Product> list = new ArrayList<>();
        Product product1 = new Product("ss", 9);
        Product product2 = new Product("dd", 9);
        Optional<Product> product3 = new Product("ddsa", 7);
        list.add(pr);
        list.add("Iphone");
        list.add("Xiaomi");

        list.stream().forEach(System.out::println);
        Optional<String> = "Xiaomi";
        list.remove()

        //LinkedList, List interfaceinin bir implementasyonudur. Tekrarlı elemanlara izin verir.
        //Elemanları depolamak için çift yönlü bağlı liste kullanır. Data'yı manipüle etmekte ArrayList'e göre daha iyidir.
        LinkedList<String> al=new LinkedList<String>();
        al.add("Çağla");
        al.add("Zeynep");
        al.add("Hazal");
        al.add("Hazal");
        al.stream().forEach(System.out::println);

        al.remove();

        al.stream().forEach(System.out::println);

        //HashSet, Set interfaceinin bir implementasyonudur. Set interface'i tekrarlı elemanlara izin vermez.
        //Elemanları depolamak için çift yönlü bağlı liste kullanır. Data'yı manipüle etmekte ArrayList'e göre daha iyidir.
//        HashSet<String> set=new HashSet<String>();
//        set.add("Ravi");
//        set.add("Vijay");
//        set.add("Ravi");
//        set.add("Ajay");

    }

}
