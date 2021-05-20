package crud.repo;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDay;

    @NotNull(message = "Numele este obligatoriu")
    @Size(min = 3, max = 39, message = "numele trebuie să aibă mai mult de 2 și mai puțin de 40 de caractere")
    private String name;

    @NotNull(message = "Este necesar un număr de telefon")
    @Pattern(regexp = "[0-9,-]+", message = "Trebuie să fie un număr de telefon valid")
    private String phoneNumber;

    @NotNull(message = "E-mailul este obligatoriu")
    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Trebuie să fie un e-mail valid ")
    private String email;

    @Size(min = 3, max = 39, message = "Denumirea profesiei trebuie să aibă mai mult de 2 și mai puțin de 40 de caractere")
    private String jobTitle;

    public Employee() {
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
