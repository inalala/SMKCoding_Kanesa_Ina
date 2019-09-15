package id.ina.loginbabershop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import id.ina.loginbabershop.Home.Homefragment
import id.ina.loginbabershop.Home.Profilefragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    private lateinit var mPager: ViewPager2
    val NUM_PAGES = 2
    var viewPager: ViewPager2?=null
    var name_tab = arrayOf("Home", "Profile")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        viewPager=findViewById(R.id.viewpager)

        val pagerAdapter = ScreenSlidePagerAdapter(this)
        viewPager?.adapter = pagerAdapter


        val tabLayoutMediator = TabLayoutMediator(tab, viewPager!!, true,
            TabLayoutMediator.OnConfigureTabCallback { tab, position ->
            })
        tabLayoutMediator.attach();

        for (i in 0..2) {
            tab.getTabAt(i)!!.setText(name_tab.get(i));
        }
    }

    override fun onBackPressed() {
        if (viewPager!!.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager!!.currentItem = mPager.currentItem - 1
        }
    }

    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

        override fun createFragment(position: Int): Fragment {
            if (position == 0) {
                return Homefragment()

            } else {
                return Profilefragment()
            }
        }

        override fun getItemCount(): Int = NUM_PAGES
    }
}
