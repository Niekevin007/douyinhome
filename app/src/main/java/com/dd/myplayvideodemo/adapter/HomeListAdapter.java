package com.dd.myplayvideodemo.adapter;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.view.HeartLayout;
import com.like.LikeButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;

/**
 * @author Created by CHEN on 2019/7/18
 * @email 188669@163.com
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {
    private Context mContext;
    private List<String> mDatas;
    private OnItemClickListener onItemClickListener;

    public HomeListAdapter(Context mContext, List<String> mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_movie_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText("position : " + mDatas.get(position) + "  :  " + position);




        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (onItemClickListener != null){
                    onItemClickListener.onItemLongClick(position);
                }
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textView)
        TextView textView;
        @BindView(R.id.ivHead)
        ImageView ivHead;
        @BindView(R.id.ivAttention)
        ImageView ivAttention;
        @BindView(R.id.ivAttentionBg)
        ImageView ivAttentionBg;
        @BindView(R.id.tvLikes)
        TextView tvLikes;
        @BindView(R.id.btLikes)
        LikeButton btLikes;
        @BindView(R.id.tvComment)
        TextView tvComment;
        @BindView(R.id.tvReprinted)
        TextView tvReprinted;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }





    public interface OnItemClickListener {
        void onItemClick(int position);
        void onItemLongClick(int position);

        //点赞
        void onLikes(int position);

        //评论
        void onComment(int position);

        //分享
        void onReprinted(int position);
    }
}
