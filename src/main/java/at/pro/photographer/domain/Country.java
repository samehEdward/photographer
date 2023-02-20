package at.pro.photographer.domain;


import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class Country {
    private String name;
    private String iso2Code;
}
