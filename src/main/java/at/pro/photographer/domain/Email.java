package at.pro.photographer.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder

@Embeddable
public class Email {
    private String address;
    private EmailType Type;
}
