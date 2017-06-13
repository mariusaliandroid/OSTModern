package com.alig2x.ostmodern.mvp.presenter;

import com.alig2x.ostmodern.mvp.callback.APIListenerTeleData;
import com.alig2x.ostmodern.mvp.network.processor.TeleService;

/**
 * Created by alig2x on 28/03/17.
 */
public class TestPresenter {

    public static final String TAG = TestPresenter.class.getSimpleName();
    public static TestPresenter instance= new TestPresenter();

    private TestPresenter() {

    }


    public static TestPresenter getInstance() {
        return instance;
    }

    public void doExecute(APIListenerTeleData listener){

        TeleService.getInstance().startTeleDataService(listener);
    }

    public void onDestroy(){
        TeleService.getInstance().onDestroy();
    }

}
