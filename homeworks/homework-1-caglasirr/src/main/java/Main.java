import Model.Customer;
import Services.CustomerService;
import Services.OrderService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = CustomerService.getCustomerService();
        OrderService orderService = OrderService.getOrderService();
        List<Customer> customerList = new ArrayList<>();


        Customer customer1 = new Customer("Cağla", "Sır", orderService.createOrders(7));
        Customer customer2 = new Customer("Canan", "Sır", orderService.createOrders(6));
        Customer customer3 = new Customer("Yılmaz", "Sır", orderService.createOrders(5));
        Customer customer4 = new Customer("Gülay", "Sır", orderService.createOrders(4));
        Customer customer5 = new Customer("Ecrin", "Sır", orderService.createOrders(3));
        Customer customer6 = new Customer("Selen", "Sır", orderService.createOrders(2));
        Customer customer7 = new Customer("Ali", "Sır", orderService.createOrders(1));
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        customerList.add(customer6);
        customerList.add(customer7);

        System.out.print("İçinde c harfi bulunan müşteriler: ");
        System.out.println(customerService.findCustomersContainC(customerList)+"\n");
        System.out.println("Tüm müşteriler:");
        customerService.getAllCustomers(customerList);
        System.out.print("\nSistemdeki tüm faturalar: ");
        System.out.println(orderService.listAllOrders(customerList)+"\n");
        System.out.print("Sistemdeki 1500 tl üstündeki faturalar: ");
        System.out.println(orderService.listAllOrders2(customerList)+"\n");
        System.out.print("Sistemdeki 1500 tl üstündeki faturaların ortalaması: ");
        System.out.println(orderService.averageOfOrders(customerList)+"\n");
        System.out.print("Sistemdeki 500 tl altında faturalara sahip müşterilerin isimleri: ");
        System.out.println(orderService.listCustomers2(customerList)+"\n");
    }

}