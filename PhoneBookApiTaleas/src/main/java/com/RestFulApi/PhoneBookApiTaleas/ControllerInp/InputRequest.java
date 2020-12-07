package com.RestFulApi.PhoneBookApiTaleas.ControllerInp;

import com.RestFulApi.PhoneBookApiTaleas.Entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InputRequest {
    private Users users;
}
