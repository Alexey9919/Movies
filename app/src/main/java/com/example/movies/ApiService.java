package com.example.movies;



import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    //@GET("movie?token=APYT0QR-4D24WC1-HW0BT4X-7QY4S4J&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=5")
    @GET("movie?token=APYT0QR-4D24WC1-HW0BT4X-7QY4S4J&field=rating.kp&search=4-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=APYT0QR-4D24WC1-HW0BT4X-7QY4S4J&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);


    @GET("review?token=APYT0QR-4D24WC1-HW0BT4X-7QY4S4J&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}
