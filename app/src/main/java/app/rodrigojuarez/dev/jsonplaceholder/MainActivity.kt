package app.rodrigojuarez.dev.jsonplaceholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.rodrigojuarez.dev.jsonplaceholder.adapters.PostsAdapter
import app.rodrigojuarez.dev.jsonplaceholder.models.PostViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var postAdapter: PostsAdapter
    private lateinit var postRecycler: RecyclerView
    private lateinit var viewModel: PostViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[PostViewModel::class.java]

        setupRecyclerView()
        observeViewModel()
        viewModel.getPosts()
    }

    private fun setupRecyclerView() {
        postRecycler = findViewById(R.id.recyclerPosts)
        postAdapter = PostsAdapter(emptyList())
        postRecycler.adapter = postAdapter
        postRecycler.layoutManager = LinearLayoutManager(this)
    }

    private fun observeViewModel() {
        viewModel.postsLiveData.observe(this) { posts ->
            posts?.let {
                postAdapter.updatePosts(it)
            }
        }
    }
}