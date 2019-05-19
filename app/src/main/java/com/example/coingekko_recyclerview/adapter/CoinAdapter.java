package com.example.coingekko_recyclerview.adapter;


//public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>


//Arslan's version
//public class DealAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coingekko_recyclerview.R;
import com.example.coingekko_recyclerview.rest.entities.Coin;

import java.util.List;

/**The class CoinAdapter extends RecyclerView, as soon as we extend the RecyclerView
 * there will be required to implement methods, namely
 * 1. onCreateViewHolder()
 * 2. onBindViewHolder()
 * 3. getItemCount*/

public class CoinAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private View view;
    private CoinViewHolder coinViewHolder;
    private List<Coin> coinList;

    public List<Coin> getCoinList() {
        return coinList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main, viewGroup, false);
        coinViewHolder = new CoinViewHolder(view);
        return coinViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
