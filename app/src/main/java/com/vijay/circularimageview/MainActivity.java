package com.vijay.circularimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    ImageView profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profile_image = findViewById(R.id.profile_image);

        Glide.with(this)
                .load("https://api.androidhive.info/images/glide/medium/deadpool.jpg")
                .apply(new RequestOptions()
                        .placeholder(R.mipmap.assign_to))
                .into(profile_image);


    }
}
