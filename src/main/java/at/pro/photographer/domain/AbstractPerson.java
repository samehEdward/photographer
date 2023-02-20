package at.pro.photographer.domain;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPerson {
    private String userName;
    private String firstName;
    private String lastName;
}
