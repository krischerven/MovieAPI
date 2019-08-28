package co.gc.movieapi.controller;
import co.gc.movieapi.entity.Movie;
import co.gc.movieapi.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import java.util.List;

@RestController
public class MovieController {
	@Autowired
	MovieRepository repo;
	// API functions
	@GetMapping("/list-movies")
	public List<Movie> listMovies() {
		return repo.findAll();
	}
	@GetMapping("/list-movies-in-category/{category}")
	public List<Movie> findBook(@PathVariable("category") String category) {
		return repo.findByCategory(category);
	}
	@GetMapping("/list-random-movie")
	public Optional<Movie> getRandomMovie() {
		return Optional.of(repo.getRandomMovie().get(0));
	}
	@GetMapping("/list-random-movie/{category}")
	public Optional<Movie> getRandomMovie(@PathVariable("category") String category) {
		return Optional.of(repo.getRandomMovie(category).get(0));
	}
	@GetMapping("/list-random-movies")
	public List<Movie> getRandomMovies() {
		return repo.getRandomMovies();
	}
	@GetMapping("/list-movie-categories")
	public List<String> listMovieCategories() {
		return repo.getMovieCategories();
	}
	@GetMapping("/list-movie-title/{title}")
	public List<Movie> listMovieFromTitle(@PathVariable("title") String title) {
		return repo.getMovieFromTitle(title);
	}
	@GetMapping("/list-movie-like-title/{title}")
	public List<Movie> listMovieLikeTitle(@PathVariable("title") String title) {
		return repo.getMovieLikeTitle(title);
	}
}