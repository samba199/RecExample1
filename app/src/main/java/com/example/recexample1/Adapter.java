package com.example.recexample1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<DataClass> list;
    public Adapter(List<DataClass>list){this.list=list; }



    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.itetm_layout,parent,false);
    return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource=list.get(position).getImageview1();
        String name=list.get(position).getTextview1();
        String tag=list.get(position).getTextview2();
        int iconvi=list.get(position).getImageview2();
        int iconmsg=list.get(position).getImageview3();
        holder.setData(resource,name,tag,iconvi,iconmsg);
    }

    @Override
    public int getItemCount() {
       return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageview1;
        private TextView textview1;
        private TextView textview2;
        private ImageView imageview2;
        private ImageView imageview3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview1=itemView.findViewById(R.id.imageview1);
            textview1=itemView.findViewById(R.id.textview1);
            textview2=itemView.findViewById(R.id.textview2);
            imageview2=itemView.findViewById(R.id.imageview2);
            imageview3=itemView.findViewById(R.id.imageview3);

        
    }

        public void setData(int resource, String name, String tag, int iconvi, int iconmsg) {
            imageview1.setImageResource(resource);
            textview1.setText(name);
            textview2.setText(tag);
            imageview2.setImageResource(iconvi);
            imageview3.setImageResource(iconmsg);
        }
    }
}
