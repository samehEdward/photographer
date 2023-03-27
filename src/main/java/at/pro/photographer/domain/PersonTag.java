package at.pro.photographer.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PersonTag extends AbstractPersistable<Long> {

    private Photo photo;
    private Person person;
    private Integer rating;
}
