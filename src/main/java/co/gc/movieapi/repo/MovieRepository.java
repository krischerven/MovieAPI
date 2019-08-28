package co.gc.movieapi.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import co.gc.movieapi.entity.Movie;
import java.util.Optional;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	@Query("SELECT x FROM Movie x WHERE x.category=?1")
	public List<Movie> findByCategory(String category);
	@Query("SELECT x FROM Movie x ORDER BY RAND()")
	public List<Movie> getRandomMovie();
	@Query("FROM Movie WHERE category=?1 ORDER BY RAND()")
	public List<Movie> getRandomMovie(String category);
	@Query("FROM Movie ORDER BY RAND()")
	public List<Movie> getRandomMovies();
	@Query("SELECT DISTINCT category FROM Movie")
	public List<String> getMovieCategories();
	@Query("FROM Movie WHERE title=?1")
	public List<Movie> getMovieFromTitle(String title);
	@Query("FROM Movie WHERE title LIKE %?1%")
	public List<Movie> getMovieLikeTitle(String title);
}