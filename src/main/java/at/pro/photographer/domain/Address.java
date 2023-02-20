package at.pro.photographer.domain;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class Address {

    private String streetNumber;
    private String zipCode;
    private String city;
    private Country country;
}
