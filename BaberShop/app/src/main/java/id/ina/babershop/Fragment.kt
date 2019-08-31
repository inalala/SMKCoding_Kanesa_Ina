package id.ina.babershop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// TODO: Rename parameter argument, choose names that match
// the frament initialization parameter, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater : LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_fragment, container,  false)
    }
}