import com.example.weatherapi.API.WeatherAPI
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

public object RetrofitConnection
{
    fun getRetrofit() : WeatherAPI
    {
        return Retrofit.Builder()
            .baseUrl("http://dataservice.accuweather.com/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
            .build()
            .create(WeatherAPI::class.java)
    }
}