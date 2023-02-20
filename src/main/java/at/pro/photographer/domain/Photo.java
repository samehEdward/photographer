package at.pro.photographer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    private LocalDateTime creationTS;
    private Integer width;
    private Integer height;
    private Orientation orientation;

}
