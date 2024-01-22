package app.rodrigojuarez.dev.jsonplaceholder.models

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface JsonPlaceholderApiService {
    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>
}

object RetrofitClient {
    val retrofitService: JsonPlaceholderApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JsonPlaceholderApiService::class.java)
    }
}
