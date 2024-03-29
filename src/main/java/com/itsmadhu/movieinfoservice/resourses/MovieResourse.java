package com.itsmadhu.movieinfoservice.resourses;

import com.itsmadhu.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResourse {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfor(@PathVariable("movieId") String movieId){
        return new Movie(movieId,"Testing Movie Name");
    }
}
