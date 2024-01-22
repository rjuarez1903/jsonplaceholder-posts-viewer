package app.rodrigojuarez.dev.jsonplaceholder.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.rodrigojuarez.dev.jsonplaceholder.repositories.PostRepository
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    private val postRepository = PostRepository()
    val postsLiveData = MutableLiveData<List<Post>>()

    fun getPosts() {
        viewModelScope.launch {
            val posts = postRepository.fetchPosts()
            postsLiveData.postValue(posts)
        }
    }
}

