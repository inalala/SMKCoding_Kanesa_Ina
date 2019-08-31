package id.ina.loginbabershop

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainAdapter(fm: FragmentManager) : FragmentPagerAdapter (fm) {
    private val fragments :Array<Fragment> = arrayOf(
        Fragment1(),
        Fragment2(),
        Fragment3()
    )
    private val title: Array<String> = arrayOf(
        "fragment 1",
        "fragment 2",
        "fragment 3"
    )
    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    override fun getPageTitle(position: Int): CharSequence? = title[position]
}