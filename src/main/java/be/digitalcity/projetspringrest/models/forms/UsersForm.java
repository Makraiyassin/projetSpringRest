package be.digitalcity.projetspringrest.models.forms;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsersForm {
    @NotBlank
    @Size(min = 2,max = 255)
    private String firstName;
    @NotBlank
    @Size(min = 2,max = 255)
    private String lastName;
    @NotBlank
    private LocalDate birthdate;
    private AddressForm address;
    @NotBlank
    @Pattern(regexp = "^(((\\+|00)32[ ]?(?:\\(0\\)[ ]?)?)|0){1}(4(60|[789]\\d)\\/?(\\s?\\d{2}\\.?){2}(\\s?\\d{2})|(\\d\\/?\\s?\\d{3}|\\d{2}\\/?\\s?\\d{2})(\\.?\\s?\\d{2}){2})$")
    private String phone;
    @NotBlank
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
    private String email;
    @NotBlank
    @Size(min = 2,max = 255)
    private String password;
}

