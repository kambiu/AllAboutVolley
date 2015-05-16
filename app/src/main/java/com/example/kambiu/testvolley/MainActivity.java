package com.example.kambiu.testvolley;

import android.app.DownloadManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {


    ListView lv;
    ArrayList videoArray = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.list_video);
        videoArray.add("1stVideo");
        videoArray.add("2ndVideo");
        videoArray.add("3rdVideo");

        ArrayAdapter<String> vAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videoArray);
        lv.setAdapter(vAdapter);

        RequestQueue rq = Volley.newRequestQueue(this);
        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, );
    }


}
