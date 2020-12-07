package com.RestFulApi.PhoneBookApiTaleas.Repository;

import com.RestFulApi.PhoneBookApiTaleas.ControllerInp.ContactResponse;
import com.RestFulApi.PhoneBookApiTaleas.Entity.PhoneNumber;
import com.RestFulApi.PhoneBookApiTaleas.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Integer> {
    @Query("Select new com.RestFulApi.PhoneBookApiTaleas.ControllerInp.ContactResponse(u.username,ph.name,ph.surname,ph.number,ph.type) FROM Users u JOIN u.phoneNumbers ph")
    public List<ContactResponse> getAllContact();


    public Users findByUsernameAndPassword(String username, String password);

}
