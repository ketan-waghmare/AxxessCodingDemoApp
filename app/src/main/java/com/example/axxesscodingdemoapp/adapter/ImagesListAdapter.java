package com.example.axxesscodingdemoapp.adapter;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.annotation.SuppressLint;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.axxesscodingdemoapp.R;
import com.example.axxesscodingdemoapp.model.DataInfo;
import com.example.axxesscodingdemoapp.interfaces.RvClickListener;
import com.example.axxesscodingdemoapp.utils.Utils;

import java.util.List;

/**
 * Created by ketan 18-9-2020.
 */
public class ImagesListAdapter extends RecyclerView.Adapter<ImagesListAdapter.ViewHolder> {
    private List<DataInfo> dataList;

    private Context context;
    private View itemView;

    private RvClickListener rvClickListener;

    public ImagesListAdapter(Context context, List<DataInfo> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImage;

        public ViewHolder(View itemView) {
            super(itemView);

            ivImage = itemView.findViewById(R.id.iv_image);
        }
    }

    public void setRvClickListener(RvClickListener rvClickListener) {
        this.rvClickListener = rvClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        itemView = LayoutInflater.from(context).inflate(R.layout.row_image_list, parent, false);

        ViewHolder vh = new ViewHolder(itemView);

        return vh;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        if (dataList.get(position).getImages() != null && dataList.get(position).getImages().size() > 0)
            Utils.ImageLoaderWith(context, dataList.get(position).getImages().get(0).getLink(), holder.ivImage);

        itemView.setOnClickListener(view -> {
            rvClickListener.rv_click(position,position,"");
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
