package at.pro.photographer.domain;


import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class Album {
    private String name;
    private LocalDateTime creationTS;
    private boolean restricted;

}
