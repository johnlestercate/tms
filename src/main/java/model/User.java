package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id @GeneratedValue
    private Long id;

    private String userName;

    private String password;

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String contactNo;
}
