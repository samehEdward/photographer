package at.pro.photographer.persistence;

import at.pro.photographer.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PhotoRepo extends JpaRepository<Photo, Long> {


    List<Photo> findAll();
}
