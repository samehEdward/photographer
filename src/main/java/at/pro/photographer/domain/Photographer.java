package at.pro.photographer.domain;



import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

@Entity
@Table(name = "photographers")
public class Photographer extends AbstractPerson {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetNumber", column = @Column(name = "studio_street_number")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "studio_zip_code")),
            @AttributeOverride(name = "city", column = @Column(name = "studio_city"))

    })

    @AssociationOverrides({
            @AssociationOverride(name = "country",
            joinColumns = {@JoinColumn(name= "studio_country_id")},
            foreignKey = @ForeignKey(name = "FK_photographers_studio_contry"))
    })

    private Address studioAddress;


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetNumber", column = @Column(name = "biiling_street_number")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "biiling_zip_code")),
            @AttributeOverride(name = "city", column = @Column(name = "biiling_city"))

    })

    @AssociationOverrides({
            @AssociationOverride(name = "country",
                    joinColumns = {@JoinColumn(name= "biiling_country_id")},
                    foreignKey = @ForeignKey(name = "FK_photographers_studio_contry"))
    })

    private Address biilingAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "countryCode", column = @Column(name = "studio_country_code")),
            @AttributeOverride(name = "areaCode", column = @Column(name = "studio_area_code")),
            @AttributeOverride(name = "serialNumber", column = @Column(name = "studio_serial_number"))

    })

    private PhoneNumber mobilePhoneNumber;
    private PhoneNumber businessPhoneNumber;
    private Set<Email> emails;


}
