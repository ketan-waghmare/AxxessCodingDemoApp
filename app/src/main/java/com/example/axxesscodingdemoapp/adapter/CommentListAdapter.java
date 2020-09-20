package com.example.axxesscodingdemoapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.axxesscodingdemoapp.R;
import com.example.axxesscodingdemoapp.interfaces.RvClickListener;
import com.example.axxesscodingdemoapp.model.DataInfo;
import com.example.axxesscodingdemoapp.utils.Utils;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.List;

/**
 * Created by ketan 18-9-2020.
 */
public class CommentListAdapter extends RecyclerView.Adapter<CommentListAdapter.ViewHolder> {
    private View itemView;
    private Context context;
    private JSONArray dataList;
    private RvClickListener rvClickListener;

    public CommentListAdapter(Context context, JSONArray dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvComment;

        public ViewHolder(View itemView) {
            super(itemView);

            tvComment = itemView.findViewById(R.id.tv_comment);
        }
    }

    public void setRvClickListener(RvClickListener rvClickListener) {
        this.rvClickListener = rvClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        itemView = LayoutInflater.from(context).inflate(R.layout.row_comment_layout, parent, false);

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
        try {
            holder.tvComment.setText(""+dataList.getJSONObject(position).getString("comment") +" "+ dataList.getJSONObject(position).getString("created_date_time"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return dataList.length();
    }
}
