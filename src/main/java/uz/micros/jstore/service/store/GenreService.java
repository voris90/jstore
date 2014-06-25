package uz.micros.jstore.service.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.micros.jstore.entity.store.Genre;
import uz.micros.jstore.repository.GenreRepository;

import java.util.List;

/**
 * Created by java on 25.06.2014.
 */

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAll(){

        return genreRepository.findAll();

    }

}
