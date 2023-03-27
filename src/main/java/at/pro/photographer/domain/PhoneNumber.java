package at.pro.photographer.domain;


import jakarta.persistence.Embeddable;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder


@Embeddable
public class PhoneNumber {
    private Integer countryCode;
    private Integer areaCode;
    private String serialNumber;
}
