package com.RestFulApi.PhoneBookApiTaleas.Repository;


import com.RestFulApi.PhoneBookApiTaleas.Entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NumberRepository extends JpaRepository<PhoneNumber, Integer> {
    List<PhoneNumber> findAllByName(String username);

    PhoneNumber findByName(String name);
}
