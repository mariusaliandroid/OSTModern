package com.alig2x.ostmodern.mvp.network.api;


import com.alig2x.ostmodern.mvp.model.Data;
import com.alig2x.ostmodern.mvp.network.constants.Constants;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by alig2x on 28/03/17.
 */
public interface ITeleService {

    @GET(Constants.BASE_URL_QUERY)
    Observable<Data> getTeleData();
}
