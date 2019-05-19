package com.example.coingekko_recyclerview.rest;

import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GekkoApi {

    @GET(Constants.PATH_TO_DATA + "markets")
    Call<List<Coin>> getCoin(
            @Query("vs_currency") String symbol,
            @Query("per_page") int per_page
    );
}
