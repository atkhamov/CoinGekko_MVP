package com.example.coingekko_recyclerview.coinMVP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.coingekko_recyclerview.R;
import com.example.coingekko_recyclerview.adapter.CoinAdapter;
import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;

public class CoinFragment implements CoinContract.View {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private CoinAdapter coinAdapter;
    private int currentPage = 1;
    private CoinContract.Presenter coinPresenter;

    public CoinFragment(){
        //Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //Inflate layout for this fragment
        return inflater.inflate(R.layout.item_layout, container, false);
    }

    @Override
    public void showLanding() {

    }

    @Override
    public void hideLanding() {

    }

    @Override
    public void addNewCoins(List<Coin> newCoins) {

    }

    @Override
    public void showError(Throwable throwable) {

    }
}
