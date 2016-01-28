package com.nearsoft.nearsoftpair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nearsoft.nearsoftpair.model.ImageElement;
import com.nearsoft.nearsoftpair.util.JSONParser;
import com.nearsoft.nearsoftpair.util.StringUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RequestQueue requestQueue;
    private List<ImageElement> imageElementList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = Volley.newRequestQueue(this);
        getDataFromURL();
    }

    /**
     * Method that send the http request in order to get the JSON to parse
     */
    private void getDataFromURL() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, StringUtils.URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d(StringUtils.APP_TAG,"onResponse");
                try {
                    imageElementList = JSONParser.getImageElements(response.getJSONArray("data"));
                    Log.d(StringUtils.APP_TAG,"Number of elements: " + imageElementList.size());
                } catch (JSONException e) {
                    Log.e(StringUtils.APP_TAG,e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(StringUtils.APP_TAG,"onError");
            }
        });

        requestQueue.add(jsonObjectRequest);
    }
}
