package com.example.demo.Dto;

import com.example.demo.Model.Enums.Currency;
import com.example.demo.Model.Enums.FirmType;
import com.example.demo.Model.Enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDto {

    private int id;
    private String billNumber;
    private Currency currency;
    private String customerName; //tedarikçi
    private FirmType firmType;
    private PaymentStatus paymentStatus;}
