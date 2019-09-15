package id.ina.projek.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ina.projek.R
import id.ina.projek.model.MyFriend

import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friends_item.view.*
import java.util.ArrayList
import kotlin.contracts.Returns

class MyFriendAdapter(var context: Context): RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {

    var data: List<MyFriend> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.my_friends_item, parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return data.size


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(data.get(position))
    }


    class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bindItem(item: MyFriend) {
            containerView.txtFriendName.text = "Nama : " + item.nama
            containerView.txtFriendEmail.text ="Email : " + item.email
            containerView.txtFriendTelp.text ="Telp : " + item.telp
        }

    }
}