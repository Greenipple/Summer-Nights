package lasanha.summertime.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {

    private  Integer id;

    //@NotNull(message = "Please fill in this field")
    //@NotBlank(message="Please fill in this field")
    //@Size(min = 2, max=64)
    private String userName;


    //@NotNull(message = "Please fill in this field")
    //@NotBlank(message="Please fill in this field")
    //@Size(min = 2, max=64)
    private String password;


    //@Email
    //@NotBlank(message ="please input a valid email")
    private String email;

    //@NotNull(message = "Please insert you age")
    public Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
