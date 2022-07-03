package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import com.example.demo.Dto.ExpenseDto;
import com.example.demo.Model.Customer;
import com.example.demo.Model.Expense;
import com.example.demo.Model.User;
import com.example.demo.Service.ExpenseService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public User createUser(@RequestBody User userRequest) {
        return userService.createUser(userRequest);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

//    @PutMapping
//    public User updateUser(@RequestBody User user) {
//        return userService.updateUser(user);
//    }
//
//    //@ResponseStatus(code = HttpStatus.OK)
//    @DeleteMapping(value = "/{id}")
//    public void deleteUser(@PathVariable int id) {
//        userService.deleteUserById(id);
//    }
//
//
    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
//
//    @GetMapping(value = "/{id}/activeCustomers")
//    public List<Customer> getActiveCustomersOfUser(@PathVariable int id) {
//        return userService.activeCustomerOfUser(id);
//    }
//
//    @GetMapping(value = "/{id}/passiveCustomers")
//    public List<Customer> getPassiveCustomersOfUser(@PathVariable int id) {
//        return userService.passiveCustomerOfUser(id);
//    }
//
//    //User'ın masraf ekleme, silme, görüntüleme işlemlerini yapabildiği endpointler:
    @PostMapping(value = "/{userId}/expenses")
    public Expense addExpense(@PathVariable int userId, @RequestBody Expense expense) {
        return expenseService.create(userId, expense);
    }

    @DeleteMapping(value = "/{userId}/expenses/{expenseId}")
    public void deleteUser(@PathVariable int userId, @PathVariable int expenseId) {
        expenseService.deleteExpence(userId, expenseId);
    }
//
    @GetMapping(value = "/{userId}/expenses")
    public List<ExpenseDto> findAllExpencesofUser(@PathVariable int userId) {
        return expenseService.findAllExpencesofUser(userId);
    }
//
//    @GetMapping(value = "/{userId}/expenses/{expenseId}")
//    public Expense findAllExpencesofUser(@PathVariable int userId, @PathVariable int expenseId) {
//        return expenseService.findExpenceofUserById(userId, expenseId);
//    }
//
//    @PutMapping(value = "/{userId}/expenses")
//    public Expense updateUser(@PathVariable int userId, @RequestBody Expense expense) {
//        return userService.updateExpenseOfUser(userId,expense);
//    }

}

