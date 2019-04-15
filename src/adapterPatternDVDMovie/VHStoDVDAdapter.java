package adapterPatternDVDMovie;

public class VHStoDVDAdapter implements DVDMovieInterface {

    private VHSMovieInterface vhsMovie;

    public VHStoDVDAdapter(VHSMovieInterface vhsMovie) {
        this.vhsMovie = vhsMovie;
    }

    @Override
    public void playDVDMovie() {
        this.vhsMovie.playVHSMovie();
    }
}
