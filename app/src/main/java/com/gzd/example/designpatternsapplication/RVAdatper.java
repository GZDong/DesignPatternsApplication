package com.gzd.example.designpatternsapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class RVAdatper extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<String> mFirstList;

    public RVAdatper(List<String> list){
        mFirstList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        FirstViewHolder viewHolder = new FirstViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main_rv, viewGroup, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof FirstViewHolder){
            FirstViewHolder viewHolder1 = (FirstViewHolder) viewHolder;
            viewHolder1.mTextView.setText(mFirstList.get(i));
            viewHolder1.mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(BaseApplication.getContext(),"Button was click",Toast.LENGTH_LONG).show();
                }
            });
            viewHolder1.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(BaseApplication.getContext(),"item was click",Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mFirstList.size();
    }

    static class FirstViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public Button mButton;
        public FirstViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.text_item);
            mButton = itemView.findViewById(R.id.btn_item);
        }
    }
}
