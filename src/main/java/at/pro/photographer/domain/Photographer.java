package at.pro.photographer.domain;



import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class Photographer extends AbstractPerson {

    private Address studioAddress;
    private Address biilingAddress;
    private PhoneNumber mobilePhoneNumber;
    private PhoneNumber businessPhoneNumber;
    private Set<Email> emails;


}
