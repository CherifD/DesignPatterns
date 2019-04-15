package adapterPatternDVDMovie;

public class DVDMovie implements DVDMovieInterface {
    @Override
    public void playDVDMovie() {
        System.out.println("Just played DVD movie.");
    }
}
