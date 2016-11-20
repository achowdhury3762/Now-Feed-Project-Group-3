package nyc.c4q.ashiquechowdhury.nowfeed.moviedb.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ashiquechowdhury on 11/13/16.
 */
public interface MoviedbAPI {
    @GET("3/discover/movie")
    Call<MovieList> listPopularMovies(@Query("primary_release_year") String year,
                                      @Query("sort_by") String sort,
                                      @Query("api_key") String apiKey);
}