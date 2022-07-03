package com.example.demo.Model;

import com.example.demo.Dto.ExpenseDto;
import com.example.demo.Model.Enums.Currency;
import com.example.demo.Model.Enums.FirmType;
import com.example.demo.Model.Enums.PaymentStatus;

import javax.persistence.*;

//@NamedNativeQuery(name = "Expense.findAllByUserId",
//        query = "SELECT e.id as id, e.bill_number as billNumber, e.currency as currency, e.customer_name customerName, e.firm_type as firmType, e.payment_status as paymentStatus FROM expenses e where e.user_id=?1",
//        resultSetMapping = "Mapping.ExpenseDto")
//
//@SqlResultSetMapping(name = "Mapping.ExpenseDto",
//        classes = @ConstructorResult(targetClass = ExpenseDto.class,
//                columns = {@ColumnResult(name = "id"),
//                        @ColumnResult(name = "billNumber"),
//                        @ColumnResult(name = "currency"),
//                        @ColumnResult(name = "customerName"),
//                        @ColumnResult(name = "firmType"),
//                        @ColumnResult(name = "paymentStatus")
//        }))

@Entity
@Table(name = "expenses")
public class Expense
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private FirmType firmType;
    @Column(name = "bill_number", nullable = true)
    private String billNumber;
    @Column(name = "customer_name", nullable = true)
    private String customerName; //tedarikçi
    @Enumerated(EnumType.STRING)
    private Currency currency;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;


//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name="user_id", referencedColumnName = "id")
    @ManyToOne
    private User user; //tedarikçi

    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }

    public FirmType getFirmType() {
        return firmType;
    }

    public void setFirmType(FirmType firmType) {
        this.firmType = firmType;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Expense(FirmType firmType, String billNumber, String customerName, Currency currency, PaymentStatus paymentStatus, User user) {
        this.user=user;
        this.firmType = firmType;
        this.billNumber = billNumber;
        this.customerName = customerName;
        this.currency = currency;
        this.paymentStatus = paymentStatus;
    }

    public Expense(){};
}
