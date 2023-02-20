package at.pro.photographer.domain;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class Email {
    private String address;
    private EmailType Type;
}
