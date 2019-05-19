package com.example.coingekko_recyclerview.coinMVP;

import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;

public interface CoinContract {
    interface View{

        /**
         * Due to the fact that We don't want to use Fragments for showing the COINS
         * we have only one VIEW left, which is MainActivity.
         * In this case, we do NOT need to have View class in contMVP package.
         * Furthermore, we should implement methods of CoinContract.View interface
         * in the MainActivity class*/

        void showLoading();
        void hideLoading();
        void addNewCoins(List<Coin> newCoins);
        void showError(Throwable throwable);
    }

    interface Presenter{
        void load();
        void loadingFinished(List<Coin> coinsList);
        void loadingFailed(Throwable throwable);
    }

    interface Model{
        void getCoinList(String currency, int per_page);
    }
}
