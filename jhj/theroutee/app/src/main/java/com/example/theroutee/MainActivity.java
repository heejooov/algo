package com.example.theroutee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    LinearLayout l_time,l_route,l_money;
    LinearLayout l_taxi,l_bus,l_train,l_bike,l_walk;
    ImageView i_time,i_route,i_money;
    ImageView i_taxi,i_bus,i_train,i_bike,i_walk;
    TextView tv_time,tv_route,tv_money;
    TextView tv_taxi,tv_bus,tv_train,tv_bike,tv_walk;
    boolean time_state,money_state,route_state;
    boolean taxi_state,bike_state,walk_state,bus_state,train_state;
    EditText e_depart,e_dest;
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i_time=(ImageView)findViewById(R.id.i_time);
        tv_time=(TextView)findViewById(R.id.tv_time);
        l_time=(LinearLayout)findViewById(R.id.l_time);
        time_state=false;

        i_route=(ImageView)findViewById(R.id.i_route);
        tv_route=(TextView)findViewById(R.id.tv_route);
        l_route=(LinearLayout)findViewById(R.id.l_route);
        route_state=false;

        i_money=(ImageView)findViewById(R.id.i_money);
        tv_money=(TextView)findViewById(R.id.tv_money);
        l_money=(LinearLayout)findViewById(R.id.l_money);
        money_state=false;

        i_taxi=(ImageView)findViewById(R.id.i_taxi);
        tv_taxi=(TextView)findViewById(R.id.tv_taxi);
        l_taxi=(LinearLayout)findViewById(R.id.l_taxi);
        taxi_state=false;

        i_bus=(ImageView)findViewById(R.id.i_bus);
        tv_bus=(TextView)findViewById(R.id.tv_bus);
        l_bus=(LinearLayout)findViewById(R.id.l_bus);
        bus_state=false;

        i_train=(ImageView)findViewById(R.id.i_train);
        tv_train=(TextView)findViewById(R.id.tv_train);
        l_train=(LinearLayout)findViewById(R.id.l_train);
        train_state=false;

        i_bike=(ImageView)findViewById(R.id.i_bike);
        tv_bike=(TextView)findViewById(R.id.tv_bike);
        l_bike=(LinearLayout)findViewById(R.id.l_bike);
        bike_state=false;

        i_walk=(ImageView)findViewById(R.id.i_walk);
        tv_walk=(TextView)findViewById(R.id.tv_walk);
        l_walk=(LinearLayout)findViewById(R.id.l_walk);
        walk_state=false;

        e_depart=(EditText)findViewById(R.id.e_depart);
        e_dest=(EditText)findViewById(R.id.e_dest);

        l_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(time_state){
                    tv_time.setTextColor(Color.parseColor("#484848"));
                    i_time.setImageResource(R.mipmap.ic_time);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_time.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    time_state=false;
                }else{
                    tv_time.setTextColor(Color.parseColor("#ffffff"));
                    i_time.setImageResource(R.mipmap.ic_time_w);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_time.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    time_state=true;
                }
            }
        });
        l_route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(route_state){
                    tv_route.setTextColor(Color.parseColor("#484848"));
                    i_route.setImageResource(R.mipmap.ic_route);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_route.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    route_state=false;
                }else{
                    tv_route.setTextColor(Color.parseColor("#ffffff"));
                    i_route.setImageResource(R.mipmap.ic_route_w);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_route.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    route_state=true;
                }
            }
        });
        l_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(money_state){
                    tv_money.setTextColor(Color.parseColor("#484848"));
                    i_money.setImageResource(R.mipmap.ic_money);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_money.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    money_state=false;
                }else{
                    tv_money.setTextColor(Color.parseColor("#ffffff"));
                    i_money.setImageResource(R.mipmap.ic_money_w);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_money.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    money_state=true;
                }
            }
        });
        l_taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(taxi_state){
                    tv_taxi.setTextColor(Color.parseColor("#484848"));
                    i_taxi.setImageResource(R.mipmap.ic_taxi);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_taxi.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    taxi_state=false;
                }else{
                    tv_taxi.setTextColor(Color.parseColor("#ffffff"));
                    i_taxi.setImageResource(R.mipmap.taxi);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_taxi.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    taxi_state=true;
                }
            }
        });
        l_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bus_state){
                    tv_bus.setTextColor(Color.parseColor("#484848"));
                    i_bus.setImageResource(R.mipmap.ic_bus);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_bus.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    bus_state=false;
                }else{
                    tv_bus.setTextColor(Color.parseColor("#ffffff"));
                    i_bus.setImageResource(R.mipmap.bus);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_bus.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    bus_state=true;
                }
            }
        });
        l_bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bike_state){
                    tv_bike.setTextColor(Color.parseColor("#484848"));
                    i_bike.setImageResource(R.mipmap.ic_bike);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_bike.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    bike_state=false;
                }else{
                    tv_bike.setTextColor(Color.parseColor("#ffffff"));
                    i_bike.setImageResource(R.mipmap.bike);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_bike.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    bike_state=true;
                }
            }
        });
        l_walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(walk_state){
                    tv_walk.setTextColor(Color.parseColor("#484848"));
                    i_walk.setImageResource(R.mipmap.ic_walk);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_walk.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    walk_state=false;
                }else{
                    tv_walk.setTextColor(Color.parseColor("#ffffff"));
                    i_walk.setImageResource(R.mipmap.walk);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_walk.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    walk_state=true;
                }
            }
        });
        l_train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(train_state){
                    tv_train.setTextColor(Color.parseColor("#484848"));
                    i_train.setImageResource(R.mipmap.ic_train);
                    //l_time.setBackgroundColor(Color.parseColor("#ffffff"));
                    l_train.setBackground(getResources().getDrawable(R.drawable.r_corner_gray));
                    train_state=false;
                }else{
                    tv_train.setTextColor(Color.parseColor("#ffffff"));
                    i_train.setImageResource(R.mipmap.train);
                    //l_time.setBackgroundColor(Color.parseColor("#5bb3a2"));
                    l_train.setBackground(getResources().getDrawable(R.drawable.r_corner_mint));
                    train_state=true;
                }
            }
        });

        search=(Button)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),mapActivity.class);
                intent.putExtra("money",money_state);
                intent.putExtra("route",route_state);
                intent.putExtra("time",time_state);
                intent.putExtra("taxi",taxi_state);
                intent.putExtra("bike",bike_state);
                intent.putExtra("bus",bus_state);
                intent.putExtra("walk",walk_state);
                intent.putExtra("train",train_state);
                intent.putExtra("dest",e_dest.getText().toString());
                intent.putExtra("depart",e_depart.getText().toString());

                startActivity(intent);
            }
        });
    }
}
