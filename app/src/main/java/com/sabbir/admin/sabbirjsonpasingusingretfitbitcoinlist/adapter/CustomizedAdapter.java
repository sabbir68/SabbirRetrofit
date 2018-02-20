package com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.R;
import com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.activities.Data;
import com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.model.ProductDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2/19/2018.
 */

public class CustomizedAdapter extends RecyclerView.Adapter<CustomizedAdapter.CustomViewHolder>{
    private Context context;
    List<ProductDetails> productList;


    public CustomizedAdapter(Context context, ArrayList<ProductDetails> productList){

        this.context=context;
        this.productList=productList;
    }


    class CustomViewHolder extends RecyclerView.ViewHolder{

        Context context;
        ArrayList<ProductDetails> productList;
        TextView txtName;

        public CustomViewHolder(View itemView, Context context, ArrayList<ProductDetails> productList) {
            super(itemView);
            this.context=context;
            this.productList=productList;
            txtName=(TextView)itemView.findViewById(R.id.textName);


        }


    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.card_view,null);
        CustomViewHolder viewHolder=new CustomViewHolder(view,context, (ArrayList<ProductDetails>) productList);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        final ProductDetails e = productList.get(position);
        holder.txtName.setText(e.getName());

        holder.txtName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dataIntent=new Intent(context,Data.class);
                dataIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                dataIntent.putExtra("data", productList.get(position));
                context.startActivity(dataIntent);
            }
        });



    }


    @Override
    public int getItemCount() {
        return productList.size();
    }

}
