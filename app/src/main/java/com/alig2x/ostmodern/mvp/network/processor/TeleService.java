package com.alig2x.ostmodern.mvp.network.processor;

import android.util.Log;

import com.alig2x.ostmodern.mvp.callback.APIListenerTeleData;
import com.alig2x.ostmodern.mvp.model.Data;
import com.alig2x.ostmodern.mvp.network.api.ITeleService;
import com.alig2x.ostmodern.mvp.network.retrofit.RetrofitService;

import retrofit2.Retrofit;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by alig2x on 28/03/17.
 */
public class TeleService {

    public static final String TAG = TeleService.class.getSimpleName();

    public static TeleService instance = new TeleService();
    private Subscription subscription;

    private TeleService() {

    }

    public static TeleService getInstance() {
        return instance;
    }


    public void startTeleDataService(final APIListenerTeleData listener) {

        Retrofit retrofit = RetrofitService.getInstance().getRetrofit();

        ITeleService iService = retrofit.create(ITeleService.class);

        Observable<Data> observable = iService.getTeleData();
        subscription=observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Data>() {
                    @Override
                    public void onCompleted() {
                        Log.d(TAG,"Completed");

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG,"on Error"+e.getMessage());

                    }

                    @Override
                    public void onNext(Data remoteFetch) {
                        Log.d(TAG,"onNext");
                        listener.getWeatherDataInfo(remoteFetch);

                    }
                });


    }

    public void onDestroy(){
        if(subscription!=null && !subscription.isUnsubscribed()){
            subscription.unsubscribe();
        }
    }


}
