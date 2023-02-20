package at.pro.photographer.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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

        // when / act

        //then / assert
    }

}