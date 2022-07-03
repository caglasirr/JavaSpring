package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.EmailDto;
import com.example.demo.Model.Customer;
import com.example.demo.Model.Expense;
import com.example.demo.Model.User;
import com.example.demo.Repository.ExpenseRepository;
import com.example.demo.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

//    @Autowired
//    private RabbitMQService rabbitMQService;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    public UserService(UserRepository userRepository, ExpenseRepository expenseRepository)
    {
        this.userRepository = userRepository;
        this.expenseRepository = expenseRepository;
    }

    private UserRepository userRepository;
    private ExpenseRepository expenseRepository;


    //Parametrede verilen user ile yeni bir user yaratır.
    public User createUser(User userRequest) {
        rabbitTemplate.convertAndSend("isbasi.email", new EmailDto(userRequest.getEmail(), "Java Dev",
                "Patika eğitimleri ile java developer yetiştirilmek istenmektedir."));
       return userRepository.save(userRequest);
    }

    //Bütün user'ları getirir.
    public List<User> getAllUsers() {return userRepository.findAll();}

    //Id'si verilen kullanıcıyı getirir.
    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow();
    }
//
//    //id'si verilen user'ın aktif müşterilerini getirir.
//    public List<Customer> activeCustomerOfUser(int id) {
//        User user;
//        boolean isPresent = userRepository.getUserById(id).isPresent();
//        if (isPresent) {
//            user = getUserById(id);
//            return userRepository.activeCustomerOfUser(user);
//        }
//        return null;
//
//    }
//
//    //id'si verilen user'ın pasif müşterilerini getirir.
//    public List<Customer> passiveCustomerOfUser(int id) {
//        User user;
//        boolean isPresent = userRepository.getUserById(id).isPresent();
//        if (isPresent) {
//            user = getUserById(id);
//            return userRepository.passiveCustomerOfUser(user);
//        }
//        return null;
//
//    }
//
//    //Id'si verilen user'ı siler.
//    public void deleteUserById(int id){
//        userRepository.deleteById(id);
//    }
//
//    //Verilen user'ı günceller.
//    public User updateUser(User user){
//        User foundUser;
//        boolean isPresent = userRepository.findById(user.getId()).isPresent();
//        if (isPresent) {
//            foundUser = userRepository.findById(user.getId()).get();
//            foundUser.setName(user.getName());
//            foundUser.setSurname(user.getSurname());
//            foundUser.setEmail(user.getEmail());
//            foundUser.setAddress(user.getAddress());
//            foundUser.setCustomerList(user.getCustomerList());
//            foundUser.setPassword(user.getPassword());
//            foundUser.setFirmType(user.getFirmType());
//            foundUser.setId(user.getId());
//            return  userRepository.save(foundUser);
//        }
//
//        return null;
//    }
//

//
//    //id'si verilen user'ın, id'si verilen masrafını silmesini sağlar.
//    public void deleteExpence(int userId, int expenseId){
//        User user;
//        Expense expense;
//        user = getUserById(userId);
//        userRepository.deleteExpence(user, expenseId);
//    }
//
//    //id'si verilen User'ın bütün masraflarını getirir.
//    public List<Expense> findAllExpencesofUser(int userId){
//        return userRepository.findAllExpencesofUser(getUserById(userId));
//    }
//
//    //Verilen userId'ye sahip kullanıcının, verilen expenseId'ye sahip masrafını getirir.
//    public Expense findExpenceofUserById(int userId, int expenseId){
//        return userRepository.findExpenceofUserById(getUserById(userId), expenseId);
//    }
//
//    //Verilen userId'ye sahip kullanıcının expense'ini günceller.
//    public Expense updateExpenseOfUser(int userId, Expense expense){
//        User user = getUserById(userId);
//        Expense expense_;
//
//        expense_ = findExpenceofUserById(user.getId(), expense.getId());
//        expense_.setFirmType(expense.getFirmType());
//        expense_.setBillNumber(expense.getBillNumber());
//        expense_.setCustomerName(expense.getCustomerName());
//        expense_.setPaymentStatus(expense.getPaymentStatus());
//        expense_.setCurrency(expense.getCurrency());
//
//        return userRepository.updateExpenseOfUser(user, expense_);
//    }
}