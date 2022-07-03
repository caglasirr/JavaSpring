package com.example.demo.Service;

import com.example.demo.Dto.EmailDto;
import com.example.demo.Dto.ExpenseDto;
import com.example.demo.Model.Expense;
import com.example.demo.Model.User;
import com.example.demo.Repository.ExpenseRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    private UserRepository userRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository, UserRepository userRepository) {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }

    //id'si verilen user'ın masraf (expense) girişi yapmasını sağlar.
    public Expense create(int userId, Expense expense){
        User user;
        //List<Expense> expenses;
        boolean isPresent = userRepository.findById(userId).isPresent();
        if (isPresent) {
            user = userRepository.findById(userId).get();
            expense.setUser(user);
            return expenseRepository.save(expense);
//            user = getUserById(userId);
//            expenses = user.getExpenses();
//            expenses.add(expense);
//            user.setExpenses(expenses);
//            return userRepository.save(user);
        }
        return null;
    }

    //id'si verilen User'ın bütün masraflarını getirir.
    public List<ExpenseDto> findAllExpencesofUser(int userId){
        User user = userRepository.findById(userId).get();
        return expenseRepository.findAllByUserId(user);
    }

    //Verilen userId'ye sahip kullanıcının, verilen expenseId'ye sahip masrafını getirir.
//    public Expense findExpenceofUserById(int userId, int expenseId){
//        User user = userRepository.findById(userId).get();
//        return expenseRepository.findByIdAndUser(expenseId, user);  //devam et
//    }

    //    //id'si verilen user'ın, id'si verilen masrafını silmesini sağlar.
    public void deleteExpence(int userId, int expenseId){
        User user;
        boolean isPresent = userRepository.findById(userId).isPresent();
        if (isPresent) {
            expenseRepository.deleteById(expenseId);
        }
    }

}
