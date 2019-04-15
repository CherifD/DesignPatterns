package adapterPatternDVDMovie;

public class VHSMovie implements VHSMovieInterface {
    @Override
    public void playVHSMovie() {
        System.out.println("That old VHS movie was groovy!");
    }
}
