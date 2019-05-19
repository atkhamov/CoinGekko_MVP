package com.example.coingekko_recyclerview.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Coin implements Serializable {

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("current_price")
    private String current_price;

    @Expose
    @SerializedName("symbol")
    private String symbol;

    @Expose
    @SerializedName("market_cap_rank")
    private String market_cap_rank;

    @Expose
    @SerializedName("image")
    private String image;


    public Coin(String name, String current_price, String symbol, String market_cap_rank) {
        this.name = name;
        this.current_price = current_price;
        this.symbol = symbol;
        this.market_cap_rank = market_cap_rank;
    }

    public String getName() {
        return name;
    }

    public String getCurrent_price() {
        return current_price;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getMarket_cap_rank() {
        return market_cap_rank;
    }

    public String getImage_url() {
        return image;
    }
}
