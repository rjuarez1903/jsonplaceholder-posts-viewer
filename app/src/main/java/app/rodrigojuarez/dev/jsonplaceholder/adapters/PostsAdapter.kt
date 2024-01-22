package app.rodrigojuarez.dev.jsonplaceholder.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import app.rodrigojuarez.dev.jsonplaceholder.R
import app.rodrigojuarez.dev.jsonplaceholder.models.Post

class PostsAdapter(private var postList: List<Post>) : Adapter<PostsAdapter.PostViewHolder>() {
    class PostViewHolder(viewItem: View) : ViewHolder(viewItem) {
        val lblTitle: TextView = viewItem.findViewById(R.id.lblTitle)
        val lblBody: TextView = viewItem.findViewById(R.id.lblBody)
        val lblUserId: TextView = viewItem.findViewById(R.id.lblUserId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = postList[position]
        holder.lblTitle.text = post.title
        holder.lblBody.text = post.body
        holder.lblUserId.text = "User id: ${post.userId}"
    }

    fun updatePosts(newPosts: List<Post>) {
        postList = newPosts
        notifyDataSetChanged()
    }
}