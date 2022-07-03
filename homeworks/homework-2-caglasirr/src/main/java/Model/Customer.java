package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private Order order;

    public LocalDateTime getRegistirationDate() {
        return registirationDate;
    }

    public void setRegistirationDate(LocalDateTime registirationDate) {
        this.registirationDate = registirationDate;
    }

    private LocalDateTime registirationDate;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer(String firstName, String lastName, Order order) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.order = order;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return this.getFirstName()+" "+this.getLastName()+" "+this.getOrder();
    }

}
