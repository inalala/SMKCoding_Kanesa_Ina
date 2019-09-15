package id.ina.projek.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ina.projek.R
import id.ina.projek.model.MNew
import id.ina.projek.model.Main3Activity
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter(var context: Main3Activity): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    var data: List<MNew> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        return NewsAdapter.ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_news, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(data.get(position))
    }

    class ViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        fun setData(news: MNew) {
            view.txtUserId.text = news.userId
            view.txtTitle.text = news.title
            view.txtBody.text = news.body

        }
    }
}