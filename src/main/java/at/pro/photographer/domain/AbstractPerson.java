package at.pro.photographer.domain;


import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public abstract class AbstractPerson extends AbstractPersistable<Long> {
    private String userName;
    private String firstName;
    private String lastName;
}
