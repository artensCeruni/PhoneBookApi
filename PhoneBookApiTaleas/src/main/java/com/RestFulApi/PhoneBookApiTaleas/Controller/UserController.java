package com.RestFulApi.PhoneBookApiTaleas.Controller;

import com.RestFulApi.PhoneBookApiTaleas.ControllerInp.ContactResponse;
import com.RestFulApi.PhoneBookApiTaleas.ControllerInp.InputRequest;
import com.RestFulApi.PhoneBookApiTaleas.Service.NumberService;
import com.RestFulApi.PhoneBookApiTaleas.Entity.PhoneNumber;
import com.RestFulApi.PhoneBookApiTaleas.Repository.NumberRepository;
import com.RestFulApi.PhoneBookApiTaleas.Repository.UserRepository;
import com.RestFulApi.PhoneBookApiTaleas.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserRepository usersRepository;
    @Autowired
    private NumberRepository numberRepository;


    @PostMapping("/addUsers")
    public Users addUsers(@RequestBody InputRequest request) {
        return usersRepository.save(request.getUsers());
    }

    @GetMapping("/findAllUsers")
    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }


    @GetMapping("/getContacts")
    public List<ContactResponse> getAllContacts() {
        return usersRepository.getAllContact();
    }


    /*@RequestMapping ("/login-user") Login
    public String loginUser(@ModelAttribute Users user, HttpServletRequest request) {
        if(usersRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
            return "homepage";
        }
        else {
            request.setAttribute("error", "Invalid Username or Password");
            request.setAttribute("mode", "MODE_LOGIN");
            return "welcomepage";

        }
    }

    @GetMapping("/register") Register
    public String showForm(Model model){
        Users user=new Users();
        model.addAttribute("user",user);
        return "register_form";
    }
    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") Users user){
        return "login_form";
    }*/
}
