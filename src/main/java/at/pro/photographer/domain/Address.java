package at.pro.photographer.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder

@Embeddable
public class Address {

    private String streetNumber;
    private String zipCode;
    private String city;

    @ManyToOne
    private Country country;
}
