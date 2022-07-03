package Services;

import Model.Customer;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

    //Singleton Design Pattern'i implemente etmek için constructor private yapılmıştır.
    private CustomerService() {}

    private static CustomerService customerService = new CustomerService();

    public static CustomerService getCustomerService(){
        return customerService;
    }

    public List findCustomersContainC(List<Customer> customerList){
        return customerList.stream().filter(it -> it.getFirstName().contains("c") || it.getFirstName().contains("C")).map(it -> it.getFirstName()).
                collect(Collectors.toList());
    }

    public void getAllCustomers(List<Customer> customerList){
        customerList.stream().forEach(System.out::println);
    }
}
