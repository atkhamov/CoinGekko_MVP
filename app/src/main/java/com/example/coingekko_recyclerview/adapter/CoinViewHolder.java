package com.example.coingekko_recyclerview.adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.coingekko_recyclerview.R;
import com.example.coingekko_recyclerview.rest.entities.Coin;

public class CoinViewHolder extends RecyclerView.ViewHolder {

    private ImageView coinImage;
    private TextView coinName;
    private TextView coinPrice;
    private TextView coinSymbol;
    private TextView coinRank;

    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);
        this.coinImage = itemView.findViewById(R.id.iv_coin);
        this.coinName = itemView.findViewById(R.id.tv_coin_name);
        this.coinPrice = itemView.findViewById(R.id.tv_coin_price);
        this.coinSymbol = itemView.findViewById(R.id.tv_symbol_name);
        this.coinRank = itemView.findViewById(R.id.tv_rank);
    }

    public void bind(Coin coin){
        coinName.setText(coin.getName());
        coinPrice.setText(coin.getCurrent_price());
        coinSymbol.setText(coin.getSymbol());
        coinRank.setText(coin.getMarket_cap_rank());
        Glide.with(itemView)
                .load(coin.getImage_url())
                .into(coinImage);
    }
}
