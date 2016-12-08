package com.example.arifhasnat.swiperecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.swipe.SwipeLayout;

/**
 * Created by Arif hasnat on 3/24/2016.
 */
public class AdapterForRecyler extends RecyclerView.Adapter<AdapterForRecyler.ViewData> {

    private ItemData[] itemDatas;

    public AdapterForRecyler(ItemData[] itemDatas) {
        this.itemDatas = itemDatas;
    }

    @Override
    public ViewData onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_layout, null);
        ViewData viewData = new ViewData(itemLayoutView);
        return viewData;
    }

    @Override
    public void onBindViewHolder(ViewData holder, int position) {

        holder.imageView.setImageResource(itemDatas[position].getImageUrl());
        holder.textView.setText(itemDatas[position].getTitle());
    }

    @Override
    public int getItemCount() {
        return itemDatas.length;
    }

    public class ViewData extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;
        SwipeLayout swipeLayout;

        public ViewData(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textview);
            swipeLayout = (SwipeLayout) itemView.findViewById(R.id.samaple);

            //set show mode.
            swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);

//add drag edge.(If the BottomView has 'layout_gravity' attribute, this line is unnecessary)
            swipeLayout.addDrag(SwipeLayout.DragEdge.Left, itemView.findViewById(R.id.bottom_wrapper));

            swipeLayout.addSwipeListener(new SwipeLayout.SwipeListener() {
                @Override
                public void onClose(SwipeLayout layout) {
                    //when the SurfaceView totally cover the BottomView.
                }

                @Override
                public void onUpdate(SwipeLayout layout, int leftOffset, int topOffset) {
                    //you are swiping.
                }

                @Override
                public void onStartOpen(SwipeLayout layout) {

                }

                @Override
                public void onOpen(SwipeLayout layout) {
                    //when the BottomView totally show.
                }

                @Override
                public void onStartClose(SwipeLayout layout) {

                }

                @Override
                public void onHandRelease(SwipeLayout layout, float xvel, float yvel) {
                    //when user's hand released.
                }
            });

        }
    }
}
