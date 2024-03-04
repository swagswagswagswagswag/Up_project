package com.example.myapplication

import android.net.http.HttpResponseCache
import android.net.http.HttpResponseCache.install
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.jan.supabase.postgrest.Postgrest
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    val supabase = createSupabaseClient(
        supabaseUrl = "https://pbzxwambufyormzxyauc.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InBienh3YW1idWZ5b3Jtenh5YXVjIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDk1MzMzMjMsImV4cCI6MjAyNTEwOTMyM30.n6P44aj18URlINvpUGjaYgGZwaluqkXF6jkc295xACs\n"
    ) {
        install(Postgrest)
    }

    private fun install(postgrest: Postgrest.Companion): HttpResponseCache {
        TODO("Not yet implemented")
    }

    private fun createSupabaseClient(
        supabaseUrl: String,
        supabaseKey: String,
        function: () -> HttpResponseCache
    ): Any {
        TODO("Not yet implemented")
    }
}