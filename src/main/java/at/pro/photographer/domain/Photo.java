package at.pro.photographer.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder



@Entity
@Table(name="photos")
public class Photo extends AbstractPersistable<Long>
{

    private String fileName;
    private String name;
    @Column(name = "creating_ts")
    private LocalDateTime creationTS;
    private Integer width;
    private Integer height;
    @Enumerated(EnumType.STRING)
    private Orientation orientation;

}
