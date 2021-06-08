package com.springrestful.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"password", "ssn"})
//@JsonFilter("UserInfo")
public class User {

    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상 입력해주세요.")
    private String name;

    @Past
    private LocalDateTime joinDate;

    private String password;
    private String ssn;

}
