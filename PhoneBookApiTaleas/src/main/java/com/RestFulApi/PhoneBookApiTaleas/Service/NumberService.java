package com.RestFulApi.PhoneBookApiTaleas.Service;


import com.RestFulApi.PhoneBookApiTaleas.Entity.PhoneNumber;
import com.RestFulApi.PhoneBookApiTaleas.Repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class NumberService {
    @Autowired
    private NumberRepository numberRepository;

    public PhoneNumber savecontact(PhoneNumber phoneNumber) {
        return numberRepository.save(phoneNumber);
    }

    public List<PhoneNumber> savePhoneNumber(List<PhoneNumber> phoneNumbers) {
        return numberRepository.saveAll(phoneNumbers);
    }

    public List<PhoneNumber> getContactsByUser(String username) {
        //id
        return numberRepository.findAllByName(username);
    }

    public PhoneNumber getNumberById(int id) {
        return numberRepository.findById(id).orElse(null);
    }

    public PhoneNumber getNumberByName(String name) {
        return numberRepository.findByName(name);
    }

    public List<PhoneNumber> getNumbers() {
        return numberRepository.findAll();
    }

    public String deleteNumber(int id) {
        numberRepository.deleteById(id);
        return "product removed ! " + id;
    }
    public PhoneNumber updateContact(PhoneNumber phoneNumber) {
        PhoneNumber existingContact = numberRepository.findById(phoneNumber.getNmbId()).orElse(null);
        existingContact.setName(phoneNumber.getName());
        existingContact.setSurname(phoneNumber.getSurname());
        existingContact.setNumber(phoneNumber.getNumber());
        existingContact.setType(phoneNumber.getType());
        return numberRepository.save(existingContact);
    }
}
