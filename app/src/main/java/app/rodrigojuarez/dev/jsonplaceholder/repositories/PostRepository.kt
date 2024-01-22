package app.rodrigojuarez.dev.jsonplaceholder.repositories

import android.util.Log
import app.rodrigojuarez.dev.jsonplaceholder.models.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import app.rodrigojuarez.dev.jsonplaceholder.models.RetrofitClient

class PostRepository {

    suspend fun fetchPosts(): List<Post>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = RetrofitClient.retrofitService.getPosts()
                if (response.isSuccessful) {
                    response.body()
                } else {
                    null
                }
            } catch (e: Exception) {
                Log.d("Retrofit", e.message!!)
                null
            }
        }
    }
}
