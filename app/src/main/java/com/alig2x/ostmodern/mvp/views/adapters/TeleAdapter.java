package com.alig2x.ostmodern.mvp.views.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alig2x.ostmodern.mvp.R;
import com.alig2x.ostmodern.mvp.model.Object;
import com.alig2x.ostmodern.mvp.network.constants.Constants;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by alig2x on 28/03/17.
 */
public class TeleAdapter extends RecyclerView.Adapter<TeleAdapter.ViewHolderTeleAdapter>  {

    private LayoutInflater layoutInflater;
    private static ClickListener clickListener;
    private Context mContext;
    private List<Object> Object_List = new ArrayList<>();


    ////CONSTRUCTOR
    public TeleAdapter(Context context) {
        this.layoutInflater = layoutInflater.from(context);
        this.mContext = context;
        Log.d("TeleAdapter", "Tele Adapter Class: Set Constructor");

    } // END

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
        Log.d("TeleAdapter", "Tele Adapter Class: Set Clicklistener");



    }

    public void setList(List<Object> Object_List)
    {
        this.Object_List= Object_List;
        Log.d("TeleAdapter", "Tele Adapter Class: SetList");

        for(Object param:Object_List){

                    Log.d("TeleAdapter", "showTeleFragment Found... List Counter" + param);

            }
    }


    @Override
    public ViewHolderTeleAdapter onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.row_tele, parent, false);
        Log.d("TeleAdapter", "Tele Adapter Class: View Inflated");

        return new ViewHolderTeleAdapter(view,mContext);

    }

    @Override
    public void onBindViewHolder(ViewHolderTeleAdapter holder, int position) {

        Log.d("TeleAdapter", "Tele Adapter Class: On BindViewHolder");


       // String title = Jsoup.parse(Characters_List.get(position).getResult()).text().;
        String title = Object_List.get(position).getTitle();
        String description = Object_List.get(position).getQuoter();
        //String characterTitle = character.substring(0, character.indexOf('-'));\\\
        holder.movieTitle.setText(title);
        holder.movieDesc.setText(description);
        Log.d("TeleAdapter", "Tele Adapter Class: Bind" + title);

        if(Object_List.get(position).getImageUrls().size()!=0) {
            Log.d("TeleAdapter", "Tele Adapter Class: Bind Image URL is more than Zero" + Object_List.get(position).getImageUrls().size());

            Uri uri = Uri.parse(Constants.BASE_URL+Object_List.get(position).getImageUrls().get(0)+Object_List.get(position).getTempImage());
            Picasso.with(mContext)
                    .load(uri)
                    .resize(150,150)
                    .into(holder.movieIcon);
        }

        else {
            holder.movieIcon.setImageResource(R.drawable.simpson);
        }


        }

    @Override
    public int getItemCount() {
        return Object_List == null ? 0 : Object_List.size();
    }

    public static class ViewHolderTeleAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView movieIcon;
        public TextView movieTitle;
        public TextView movieDesc;

        private ClickListener clickListener;


        public ViewHolderTeleAdapter(View itemView, Context mContext) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            Log.d("ViewHolder", "ViewHolder Constructor");
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
            itemView.setTag(itemView);
            movieIcon=(ImageView) itemView.findViewById(R.id.movieImage);
            movieTitle=(TextView) itemView.findViewById(R.id.movieTitle);
            movieDesc=(TextView) itemView.findViewById(R.id.movieDesc);

            this.clickListener=(ClickListener)mContext;
        }


        @Override
        public void onClick(View itemView) {
            Log.d("Click", "FrameLayout from ViewHolder");
            // clickListener.itemClicked(itemView,getItemViewType());
            if (clickListener != null) {
                Log.d("Click", "FrameLayout not Null");
                String s = String.valueOf(itemView.getId());

                clickListener.itemClicked(itemView, getAdapterPosition());
            }
        }

    }

    ///// INTERFACE
    public interface ClickListener{
        public void itemClicked(View view, int position);

    }
}
