package id.ina.barbershop.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ina.barbershop.R
import id.ina.barbershop.data.model.Galeriku
import kotlinx.android.extensions.LayoutContainer

class GaleriAdapter(private val context: Context, private val items: List<Galeriku>) :
    RecyclerView.Adapter<GaleriAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.galeri_item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: Galeriku) {
             = item.ImageView
             .text = item.TextView
        }

    }
}