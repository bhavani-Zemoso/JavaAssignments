package lambdas_and_streams.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

    //From collections
    private void testCollectionStreams()
    {
        List<Movie> movies = MovieUtil.createMovies();

        movies.stream().forEach(System.out::println);
    }

    //Empty stream
    private void testEmptyStreams()
    {
        Stream<Movie> movies = Stream.empty();
        movies.forEach(System.out::println);
    }

    //From values/arrays
    private void testStreamsFromValues()
    {
        Stream<String> movies = Stream.of("Gods Must Be Crazy", "Fiddler On The Roof");
        System.out.println(movies.count());

        String[] movieList = {"Gods Must Be Crazy", "Fiddler On The Roof"};
        Stream<String> movieNames = Stream.of(movieList);
    }

    //From a file
    private void testFileStream()
    {
        try
        {
            Stream<String> greetings = Files.lines(Paths.get("stream.txt"));
            greetings.forEach(System.out::println);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    //Generating infinite Streams
    private void testGenerateIterateStreams()
    {
        Stream<Double> randomNumbers = Stream.generate(Math::random);
        randomNumbers.forEach(System.out::println);

        //iterate
        Stream<Integer> wholeNumbers = Stream.iterate(1, i -> i+2);
        wholeNumbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new CreatingStreams().testCollectionStreams();
        new CreatingStreams().testEmptyStreams();
        new CreatingStreams().testStreamsFromValues();
        new CreatingStreams().testFileStream();
        //new CreatingStreams().testGenerateIterateStreams();
    }
}
