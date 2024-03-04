package com.example.weatherapi

import RetrofitConnection
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.weatherapi.API.Main
import com.example.weatherapi.API.WeatherAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.logging.Handler


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        RetrofitConnection.getRetrofit().GetNews(294199, "Ok69XglLET7jRqMO11DhuNpeSVZxAUbU").enqueue(object :
            Callback<Main>{
            override fun onResponse(call: Call<Main>, response: Response<Main>) {

                Log.println(Log.INFO,"t", response.body()!!.Headline.Category.toString())
            }

            override fun onFailure(call: Call<Main>, t: Throwable) {
                Log.println(Log.INFO,"t", t.message.toString())
            }

        })
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        Handler().postDelayed({ val intent = Intent (this@MainActivity, WeatherAPI::class.java)
            startActivity(intent)
        },5000)
    }
}

