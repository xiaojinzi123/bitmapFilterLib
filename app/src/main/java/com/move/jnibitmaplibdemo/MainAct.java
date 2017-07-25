package com.move.jnibitmaplibdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.move.bitmaplib.Filter;

public class MainAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
    }

    public void filter(View v){
        ImageView iv2 = (ImageView) findViewById(R.id.iv2);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.mipmap.demo);
        Filter.pencli(b);
        iv2.setImageBitmap(b);
    }

}
