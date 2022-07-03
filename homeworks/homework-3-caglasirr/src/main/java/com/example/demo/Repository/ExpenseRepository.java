package com.example.demo.Repository;

import com.example.demo.Dto.ExpenseDto;
import com.example.demo.Model.Expense;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Integer> {

    @Query(value = "SELECT new com.example.demo.Dto.ExpenseDto(e.id, e.billNumber, e.currency, e.customerName, e.firmType, e.paymentStatus)"+ "FROM Expense e where e.user=?1")
    List<ExpenseDto> findAllByUserId(User user);

}
