package com.yasic.noop.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yasic.noop.Objects.Note;
import com.yasic.noop.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2016/1/4.
 */
public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.MyViewHolder>{
    /**
     * 上下文
     */
    private Context context;

    /**
     * 笔记列表
     */
    private List<Note> noteList = new ArrayList<>();

    public NoteListAdapter(Context context, List<Note> noteList){
        this.context = context;
        this.noteList = noteList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_note, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if (noteList.size() != 0){

        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
            public MyViewHolder(View itemView) {
                super(itemView);
            }
        }
}
