package adapterPatternDVDMovie;

import java.util.ArrayList;

public class Client {

    public static void main(String args []) {
        DVDMovieInterface dvdMovie1 = new DVDMovie();
        DVDMovieInterface dvdMovie2 = new DVDMovie();

        VHSMovieInterface vhs_movie = new VHSMovie();
        DVDMovieInterface vhsToDvdAdapter = new VHStoDVDAdapter(vhs_movie);

        // Create movie list
        ArrayList<DVDMovieInterface> dvdList = new ArrayList<>();
        dvdList.add(dvdMovie1);
        dvdList.add(dvdMovie2);
        dvdList.add(vhsToDvdAdapter); // adds VHS movie, wrapped inside Adapter, to the DVD list;

        // Play DVD movies
        for (DVDMovieInterface dvd : dvdList) {
            dvd.playDVDMovie();
        }
    }
}

