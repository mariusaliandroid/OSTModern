package com.alig2x.ostmodern.mvp.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.alig2x.ostmodern.mvp.R;
import com.alig2x.ostmodern.mvp.model.Object;
/**
 * Created by alig2x on 28/03/17.
 */
public class Main2Activity extends AppCompatActivity {

    TextView movieTitle,movieDesc,movieBody;
    ImageView movieIcon;
    Object object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        movieIcon=(ImageView) findViewById(R.id.img_movieImage);
        movieBody=(TextView)findViewById(R.id.tv_movieBody);
        movieTitle=(TextView)findViewById(R.id.tv_movieTitle);
        movieDesc=(TextView) findViewById(R.id.tv_movieDesc);

        Bundle bundle = getIntent().getExtras();
        object= bundle.getParcelable("obj");

        movieTitle.setText(object.getTitle());
        movieDesc.setText(object.getQuote());
        movieBody.setText(object.getBody());

    }
}
