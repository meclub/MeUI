package com.me.ui.sample.base;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.me.ui.sample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tangqi on 17-6-19.
 */
public class FullColorAdapter extends RecyclerView.Adapter<FullColorAdapter.MainHolder> {

    public List<ColorItem> mItems;

    public FullColorAdapter() {
        mItems = new ArrayList<>();
    }

    public void setData(List<ColorItem> items) {
        if (items != null) {
            mItems.clear();
            mItems.addAll(items);
        }
        notifyDataSetChanged();
    }

    public void addData(List<ColorItem> items) {
        if (items != null) {
            mItems.addAll(items);
        }
    }

    public ColorItem getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public FullColorAdapter.MainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_full_color, parent, false));
    }

    @Override
    public void onBindViewHolder(FullColorAdapter.MainHolder holder, int position) {
        ColorItem mainItem = getItem(position);
        holder.tvMain.setText(String.valueOf(mainItem.index));
        holder.tvMain.setBackgroundColor(mainItem.color);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class MainHolder extends RecyclerView.ViewHolder {

        public TextView tvMain;

        public MainHolder(View itemView) {
            super(itemView);
            tvMain = itemView.findViewById(R.id.tv_full_color);
        }
    }
}
