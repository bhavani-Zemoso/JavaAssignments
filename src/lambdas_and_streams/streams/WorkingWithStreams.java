package lambdas_and_streams.streams;

import java.util.List;

public class WorkingWithStreams {

    List<Movie> movieList = MovieUtil.createMovies();
    public static void main(String[] args) {
        new WorkingWithStreams().findMoviesByDirector("Steven Spielberg");
    }

    private void findMoviesByDirector(String director)
    {
        movieList.stream()
                .filter((movie -> movie.getDirector().equals("Steven Spielberg")? true : false))
                .map(Movie::getName)
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }
}
