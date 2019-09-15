package id.ina.projek.model

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import id.ina.projek.Adapter.NewsAdapter
import id.ina.projek.R
import id.ina.projek.api.APIService
import id.ina.projek.api.RetrofitService
import kotlinx.android.synthetic.main.activity_rest_main.*

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Main3Activity : AppCompatActivity() {
    var adapter: NewsAdapter? = null
    var apiService: APIService? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        val onCreate: Any = super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest_main)

        adapter = NewsAdapter(this)
        apiService = RetrofitService.createService(APIService::class.java)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        getData()
    }

    fun getData() {
        val enqueue: Any = apiService!!.getDataPost().enqueue(object : Callback<List<MNew>> {
            override fun onFailure(call: Call<List<MNew>>, t: Throwable) =
                Toast.makeText(this@Main3Activity, "Gagal " + t.toString(), LENGTH_SHORT).show()

            override fun onResponse(call: Call<List<MNew>>, response: Response<List<MNew>>) {
                if (response.isSuccessful) {
                    val dataResponse = response.body()!!
                    adapter?.data = dataResponse
                    adapter?.notifyDataSetChanged()
                }
            }

        })

        }

    }


