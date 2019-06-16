package com.example.theroutee;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

import static android.view.ViewGroup.*;

public class mapActivity extends AppCompatActivity {
    Intent intent;
    boolean time_state,money_state,route_state;
    boolean taxi_state,bike_state,walk_state,bus_state,train_state;
    String depart,dest;

    SupportMapFragment mapFragment;
    GoogleMap map;
    ListView listView;
    TextView tv;
    Adapter adapter;






    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        this.intent=getIntent();


        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                Log.d("MAPP", "GoogleMap is ready.");

                map = googleMap;
            }
        });


        try {
            MapsInitializer.initialize(this);
        } catch(Exception e) {
            e.printStackTrace();
        }



            //메인 액티비티에서 가져온 내용
        depart=intent.getStringExtra("depart");
        dest=intent.getStringExtra("dest");
        bike_state=intent.getBooleanExtra("bike",false);
        walk_state=intent.getBooleanExtra("walk",false);
        train_state=intent.getBooleanExtra("train",false);
        bus_state=intent.getBooleanExtra("bus",false);
        taxi_state=intent.getBooleanExtra("taxi",false);
        route_state=intent.getBooleanExtra("route",false);
        money_state=intent.getBooleanExtra("money",false);
        time_state=intent.getBooleanExtra("time",false);


        listView=(ListView)findViewById(R.id.listView);
        adapter = new Adapter();

        adapter.addItem(new Item("4호선 수유역에서 하차",R.mipmap.ic_train));

        adapter.addItem(new Item("4호선 사당역까지 20m 걷기", R.mipmap.ic_walk));
        adapter.addItem(new Item("강북중학교 대여소까지 5분 이용 ", R.mipmap.ic_bike));

        adapter.addItem(new Item("버스 152번 수유역 하차", R.mipmap.ic_bus));
        adapter.addItem(new Item("택시 수유중학교로 20m 이동",  R.mipmap.ic_taxi));
        listView.setAdapter(adapter);

        //시간소요
        tv=(TextView)findViewById(R.id.tv1);





    }


    class Adapter extends BaseAdapter {
        ArrayList<Item> items = new ArrayList<Item>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(Item item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            ItemView view = new ItemView(getApplicationContext());

            Item item = items.get(position);
            view.setName(item.getName());


            view.setImage(item.getResId());

            return view;
        }
    }

}
