package org.misha.dao;

import java.util.List;
import java.util.Optional;
import org.misha.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
