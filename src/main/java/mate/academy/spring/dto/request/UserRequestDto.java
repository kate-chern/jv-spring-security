package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 4)
    private String password;

    private String repeatPassword;

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
