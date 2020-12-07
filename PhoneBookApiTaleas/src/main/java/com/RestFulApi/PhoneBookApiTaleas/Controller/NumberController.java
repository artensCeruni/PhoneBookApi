package com.RestFulApi.PhoneBookApiTaleas.Controller;

import com.RestFulApi.PhoneBookApiTaleas.Service.NumberService;
import com.RestFulApi.PhoneBookApiTaleas.Entity.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin
@RestController
public class NumberController {
    @Autowired
    private NumberService numberService;

    @PostMapping("/saveContact/")
    public PhoneNumber saveNumber(@RequestBody PhoneNumber contact) {
        return numberService.savecontact(contact);
    }

    @PostMapping("/saveContacts")
    public List<PhoneNumber> saveNumbers(@RequestBody List<PhoneNumber> phoneNumbers) {
        return numberService.savePhoneNumber(phoneNumbers);
    }
    @GetMapping ("/getAllNumbers")
    public List<PhoneNumber> getAllNumbers(){
        return numberService.getNumbers();
    }

    @GetMapping("/getNumberById/{id}")
    public PhoneNumber getNumberById(@PathVariable int id) {
        return numberService.getNumberById(id);
    }




    @GetMapping("/getNumberByName/{name}")
    public PhoneNumber getNumberByName(@PathVariable String name){
        return numberService.getNumberByName(name);
    }

    @PutMapping("/updateNumber")
    public PhoneNumber updateNumber(@RequestBody PhoneNumber phoneNumber){
        return numberService.updateContact(phoneNumber);
    }
    @DeleteMapping("/deleteNumber/{id}")
    public String deleteNumber(@PathVariable int id){
        return numberService.deleteNumber(id);
    }
}
