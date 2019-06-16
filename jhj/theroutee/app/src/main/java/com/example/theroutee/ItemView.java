package com.example.theroutee;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemView extends LinearLayout {
    TextView textView;

    ImageView imageView;
    public ItemView(Context context) {
        super(context);

        init(context);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item, this, true);

        textView = (TextView) findViewById(R.id.textView);


        imageView = (ImageView) findViewById(R.id.imageView);
    }
    public void setName(String name) {
        textView.setText(name);
    }





    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}
