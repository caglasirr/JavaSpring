package Services;

import Model.Customer;
import Model.Order;
import Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
    //Singleton Design Pattern'i implemente etmek için constructor private yapılmıştır.
    private OrderService() {}

    private static OrderService orderService = new OrderService();

    public static OrderService getOrderService(){
        return orderService;
    }

    public Order createOrders(int orderNumber){

        List<Product> products = ProductService.getProductService().createProducts();

        Order order = new Order(products.stream().limit(orderNumber).collect(Collectors.toList()));;

        return order;
    }

    public Integer orderPrice(Order order){
        return order.getProductList().stream().map(it -> it.getPrice()).
                collect(Collectors.summingInt(Integer::intValue));
    }

    public List<Integer> listAllOrders(List<Customer> customerList){
         List<Integer> orders = new ArrayList();
         customerList.forEach(it -> orders.add(this.orderPrice(it.getOrder())));
         return orders;
    }

    public List<Integer> listAllOrders2(List<Customer> customerList){
       return this.listAllOrders(customerList).stream().filter(it -> it.intValue()>1500).collect(Collectors.toList());
    }

    public Double averageOfOrders(List<Customer> customerList){
        return this.listAllOrders(customerList).stream().filter(it -> it.intValue()>1500).collect(Collectors.averagingInt(Integer::intValue));
    }

    public List listCustomers2(List<Customer> customerList){
        return customerList.stream().filter(it -> this.orderPrice(it.getOrder()).intValue()<500).
                map(it -> it.getFirstName()).collect(Collectors.toList());
    }

}
