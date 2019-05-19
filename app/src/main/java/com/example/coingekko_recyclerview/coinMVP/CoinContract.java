package com.example.coingekko_recyclerview.coinMVP;

import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;

public interface CoinContract {
    interface View{
        void showLanding();
        void hideLanding();
        void addNewCoins(List<Coin> newCoins);
        void showError(Throwable throwable);
    }

    interface Presenter{
        void load(int page);
        void loadingFailed(Throwable throwable);
    }

    interface Model{
        void getDealList(int page);
    }
}
