package com.alig2x.ostmodern.mvp.views.activities;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alig2x.ostmodern.mvp.R;
import com.alig2x.ostmodern.mvp.callback.APIListenerTeleData;
import com.alig2x.ostmodern.mvp.model.Data;
import com.alig2x.ostmodern.mvp.model.Object;
import com.alig2x.ostmodern.mvp.presenter.TestPresenter;
import com.alig2x.ostmodern.mvp.views.adapters.TeleAdapter;
import com.alig2x.ostmodern.mvp.views.adapters.TeleAdapter.ClickListener;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by alig2x on 28/03/17.
 */
public class MainActivity extends AppCompatActivity implements APIListenerTeleData,ClickListener {



    private RecyclerView mRecyclerView;
    private TeleAdapter mAdapter;
    List<Object> Object_List = new ArrayList<>();
    APIListenerTeleData listener = this;
    ClickListener clickListener = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new TeleAdapter(this);
        mAdapter.setClickListener(clickListener);
        TestPresenter.getInstance().doExecute(listener);

    }

    @Override
    public void getWeatherDataInfo(Data data) {

        Object_List = data.getObjects();
        mAdapter.setList(Object_List);
        mRecyclerView.setAdapter(mAdapter);



    }

    @Override
    public void itemClicked(View view, int position) {

        Object obj = Object_List.get(position);

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("obj", (Parcelable) obj);
        startActivity(intent);

    }
}
