package model;

import java.util.Date;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    private Integer id;

    @Column(name = "firstName")
    @NotEmpty
    @Length(max = 16)
    private String firstName;
    @Column(name = "lastName")
    @NotEmpty
    private String lastName;
    @Column(name = "email")
    @NotEmpty
    @Email
    private String email;
    @Column(name = "birthDate")
    private Date birthDate;
    @Column(name = "password")
    @NotEmpty
    @Length(min = 5)
    private String password;
    @Column(name = "otherInform")
    private String otherInform;

    private String confirmPassword;

    public User() {
    }

    public User(Integer id,String firstName, String lastName, String email, Date birthDate, String password, String otherInform) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
        this.otherInform = otherInform;
    }

    public User(Integer id,String firstName, String lastName, String email, String password, String otherInform) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.otherInform = otherInform;
    }

    public User(Integer id,String firstName, String lastName, String email, String password, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
    }

    public User(Integer id,String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOtherInform() {
        return otherInform;
    }

    public void setOtherInform(String otherInform) {
        this.otherInform = otherInform;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return this.firstName;
    }
}
