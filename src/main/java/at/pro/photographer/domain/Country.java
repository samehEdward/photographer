package at.pro.photographer.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder

@Entity
@Table(name="countries")
public class Country extends AbstractPersistable<Long> {
    private String name;
    private String iso2Code;
}
