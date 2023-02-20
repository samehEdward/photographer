package at.pro.photographer.persistence;

import at.pro.photographer.domain.Orientation;
import at.pro.photographer.domain.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assumptions.assumeThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PhotoRepoTest {

    @Autowired
    private PhotoRepo photoRepo;

    @BeforeEach
    void setup()
    {
        assumeThat(photoRepo).isNotNull();
    }

    @Test
    void ensureSaveAndRereadOfPhotoWorksCorrectly(){
        // given / arrange
        Photo photo = Photo.builder()
                .fileName("sam.jpg")
                .name("Sameh")
                .width(640)
                .height(480)
                .creationTS(LocalDateTime.now())
                .orientation(Orientation.LANDSCAPE)
                .build();
        // when / act
        var saved = photoRepo.saveAndFlush(photo);

        //then / assert
        assumeThat(saved).isSameAs(photo);
        assumeThat(saved.getId()).isNotNull();
    }

}