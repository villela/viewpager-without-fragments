package com.matheusvillela.viewpagerwithoutfragments

import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class SectionsPagerAdapter :
    PagerAdapter() {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            else -> "Tab 3"
        }
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        return when (position) {
            0 -> container.findViewById<View>(R.id.section_label1)
            1 -> container.findViewById<View>(R.id.section_label2)
            else -> container.findViewById<View>(R.id.section_label3)
        }
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun getCount(): Int {
        return 3
    }
}