package com.RestFulApi.PhoneBookApiTaleas.ControllerInp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ContactResponse {
    private String username;
    private String name;
    private String surname;
    private String number;
    public ContactResponse(String username,String number) {
        this.username = username;
        this.number = number;
    }


    private String type;
}
