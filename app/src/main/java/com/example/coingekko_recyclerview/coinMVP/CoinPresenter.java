package com.example.coingekko_recyclerview.coinMVP;

import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;

public class CoinPresenter implements CoinContract.Presenter {
    private CoinContract.Model model;
    private CoinContract.View view;


    public CoinPresenter(CoinContract.View view){
        this.model = new CoinModel(this);
        this.view = view;
    }

    @Override
    public void load() {
        view.showLoading();
        model.getCoinList("usd", 100);
    }

    @Override
    public void loadingFinished(List<Coin> coinsList) {
        view.hideLoading();
        view.addNewCoins(coinsList);
    }

    @Override
    public void loadingFailed(Throwable throwable) {
        view.hideLoading();
        view.showError(throwable);
    }
}
