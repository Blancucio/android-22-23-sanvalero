package com.example.skill5_4.network;

import android.telecom.Call;

import com.example.skill5_4.model.Movie;
import com.example.skill5_4.movie_list.MovieListResponse;

public interface ApiInterface {
    @GET("movie/popular")
    default Call<MovieListResponse> getPopularMovies(@Query("api_key") String apiKey, @Query("page") int PageNo) {
        return null;
    }

    @GET("movie/{movie_id}")
    Call<Movie> getMovieDetails(@Path("movie_id") int movieId, @Query("api_key") String apiKey, @Query("append_to_response") String credits);

}

}
