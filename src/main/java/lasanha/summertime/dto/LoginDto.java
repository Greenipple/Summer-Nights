package lasanha.summertime.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginDto {

    @NotNull(message = "Please fill in this field")
    @NotBlank(message="Please fill in this field")
    @Size(min = 2, max=64)
    private String userName;


    @NotNull(message = "Please fill in this field")
    @NotBlank(message="Please fill in this field")
    @Size(min = 2, max=64)
    private String password;

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
}
