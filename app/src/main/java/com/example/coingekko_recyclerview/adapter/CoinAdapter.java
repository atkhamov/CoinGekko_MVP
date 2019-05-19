package com.example.coingekko_recyclerview.adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coingekko_recyclerview.R;
import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.ArrayList;
import java.util.List;

/**The class CoinAdapter extends RecyclerView, as soon as we extend the RecyclerView
 * there will be required to implement methods, namely
 * 1. onCreateViewHolder()
 * 2. onBindViewHolder()
 * 3. getItemCount*/

public class CoinAdapter extends RecyclerView.Adapter<CoinViewHolder> {

    private View view;
    private CoinViewHolder coinViewHolder;
    private List<Coin> coinList;

    public CoinAdapter() {
        this.coinList = new ArrayList<>();
    }

    public List<Coin> getCoinList() {
        return coinList;
    }


    //This method sets up the list of Coins into the list
    public void setCoinList(List<Coin> list){
        this.coinList = new ArrayList<>();
        Log.i("myTag", "isList null = " + list);
        this.coinList.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CoinViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        coinViewHolder = new CoinViewHolder(view);
        return coinViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoinViewHolder viewHolder, int i) {
        viewHolder.bind(coinList.get(i));
    }

    @Override
    public int getItemCount() {
        return coinList.size();
    }
}
