package com.RestFulApi.PhoneBookApiTaleas.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class PhoneNumber {
    @Id
    private int nmbId;
    private String number;
    private String name;
    private String surname;
    private String type;


}
