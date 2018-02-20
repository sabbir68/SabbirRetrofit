package com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.apiInterface;

import com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.model.ProductDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Admin on 2/19/2018.
 */

public interface Api {

    String BASE_URL = "https://api.coinmarketcap.com/v1/";

    @GET("ticker")
    Call<List<ProductDetails>> getHeroes(@Query("start") int from, @Query("limit") int limit);
}
