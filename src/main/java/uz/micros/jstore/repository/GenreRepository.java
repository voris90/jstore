package uz.micros.jstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.micros.jstore.entity.store.Genre;

/**
 * Created by java on 25.06.2014.
 */
@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer>{



}
