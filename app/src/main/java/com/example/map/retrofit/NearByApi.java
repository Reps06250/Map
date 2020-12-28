package com.example.map.retrofit;

import com.example.map.R;
import com.example.map.retrofit.models.NearByApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NearByApi {
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyDqhFfSN4_hc3aMphxtGbRsaoiHKaW12iQ")
    Call<NearByApiResponse> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}
