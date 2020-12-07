package com.RestFulApi.PhoneBookApiTaleas.Service;

import com.RestFulApi.PhoneBookApiTaleas.Entity.PhoneNumber;
import com.RestFulApi.PhoneBookApiTaleas.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


}
