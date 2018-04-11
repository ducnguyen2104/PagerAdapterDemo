package com.example.ducnguyenvan.pageradapterdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mResources;

    public ViewPagerAdapter(Context mContext, int[] mResources) {
        this.mContext = mContext;
        this.mResources = mResources;
    }

    @Override
    public int getCount() {
        return mResources.length;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.img_pager_item);
        imageView.setImageResource(mResources[position]);
        container.addView(itemView);
        Log.i("instantiateItem", "Item" + (position + 1) );
        return itemView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        Log.i("onDestroy", "Item" + (position + 1));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
