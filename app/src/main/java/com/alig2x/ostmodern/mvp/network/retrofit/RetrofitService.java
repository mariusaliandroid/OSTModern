package com.alig2x.ostmodern.mvp.network.retrofit;


import com.alig2x.ostmodern.mvp.network.constants.Constants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alig2x on 28/03/17.
 */
public class RetrofitService {

    public static RetrofitService instance = new RetrofitService();
    public static Retrofit retrofit = new Retrofit.Builder()
                                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                                        .addConverterFactory(GsonConverterFactory.create())
                                        .baseUrl(Constants.BASE_URL)
                                        .client(getOkHttpClient())
                                        .build();
    public static OkHttpClient.Builder okHttpClient;


    private RetrofitService(){

    }

    public static RetrofitService getInstance() {
        return instance;
    }

    public Retrofit getRetrofit(){
        return retrofit;
    }


    public static OkHttpClient getOkHttpClient() {
       okHttpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okHttpClient.addInterceptor(interceptor);
        return okHttpClient.build();
    }
}
