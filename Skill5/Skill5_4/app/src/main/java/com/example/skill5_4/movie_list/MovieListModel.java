package com.example.skill5_4.movie_list;

import android.net.DnsResolver;
import android.telecom.Call;
import android.util.Log;

import com.example.skill5_4.model.Movie;
import com.example.skill5_4.network.ApiClient;
import com.example.skill5_4.network.ApiInterface;

import java.util.List;

public class MovieListModel implements MovieListContract.Model {

    private final String TAG = "MovieListModel";


    /**
     * This function will fetch movies data
     * @param onFinishedListener
     * @param pageNo : Which page to load.
     */
    @Override
    public void getMovieList(final OnFinishedListener onFinishedListener, int pageNo) {

        ApiInterface apiService;
        apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<MovieListResponse> call = apiService.getPopularMovies(API_KEY, pageNo);
        call.enqueue(new DnsResolver.Callback<MovieListResponse>() {
            @Override
            public void onResponse(Call<MovieListResponse> call, Response<MovieListResponse> response) {
                List<Movie> movies = response.body().getResults();
                Log.d(TAG, "Number of movies received: " + movies.size());
                onFinishedListener.onFinished(movies);
            }

            @Override
            public void onFailure(Call<MovieListResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
                onFinishedListener.onFailure(t);
            }
        });
    }

}