package com.example.coingekko_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.coingekko_recyclerview.adapter.CoinAdapter;
import com.example.coingekko_recyclerview.coinMVP.CoinContract;
import com.example.coingekko_recyclerview.coinMVP.CoinPresenter;
import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;


public class MainActivity extends AppCompatActivity implements CoinContract.View {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private CoinAdapter coinAdapter;
    private CoinContract.Presenter presenter;

    /**
     * Due to the fact that We don't want to use Fragments for showing the COINS
     * we have only one VIEW left, which is MainActivity.
     * In this case, we do NOT need to have View class in contMVP package.
     * Furthermore, we should implement methods of CoinContract.View interface
     * in the MainActivity class*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.myRecyclerView);
        progressBar = findViewById(R.id.progressBar);
        coinAdapter = new CoinAdapter();
        recyclerView.setAdapter(coinAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        presenter = new CoinPresenter(this);
        presenter.load();


    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void addNewCoins(List<Coin> newCoins) {
        coinAdapter.setCoinList(newCoins);
    }

    @Override
    public void showError(Throwable throwable) {
        Toast.makeText(getBaseContext(), "Error" + throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
