package com.stackroute.userloginservice.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    @Id
    private String emailId;
    private String password;
    private String role;
}