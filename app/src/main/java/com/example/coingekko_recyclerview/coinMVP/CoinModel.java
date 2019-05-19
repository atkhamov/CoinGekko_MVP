package com.example.coingekko_recyclerview.coinMVP;

import android.util.Log;

import com.example.coingekko_recyclerview.rest.NetworkService;
import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CoinModel implements CoinContract.Model {

    private CoinContract.Presenter presenter;

    public CoinModel(CoinContract.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void getCoinList(String currency, int per_page) {
        Call<List<Coin>> call = NetworkService.getInstance().getGekkoApi().getCoin("usd", per_page);
        call.enqueue(new Callback<List<Coin>>() {
            @Override
            public void onResponse(Call<List<Coin>> call, Response<List<Coin>> response) {
                Log.e("myTag", " " + response.body());
                presenter.loadingFinished(response.body());
            }

            @Override
            public void onFailure(Call<List<Coin>> call, Throwable t) {
                presenter.loadingFailed(t);
            }
        });
    }
}
