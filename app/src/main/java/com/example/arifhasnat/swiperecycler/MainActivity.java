package com.example.arifhasnat.swiperecycler;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.daimajia.swipe.SwipeLayout;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);


        ItemData itemData[] = {new ItemData(R.drawable.image1, "flowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOne"),new ItemData(R.drawable.image1, "flowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOne")
                ,new ItemData(R.drawable.image1, "flowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOne"),new ItemData(R.drawable.image1, "flowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOne"),new ItemData(R.drawable.image1, "flowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOne"),new ItemData(R.drawable.image1, "flowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOne")
                ,new ItemData(R.drawable.image1, "flowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOneflowerOne")};

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new AdapterForRecyler(itemData);
        mRecyclerView.setAdapter(mAdapter);

/*
        SwipeLayout swipeLayout =  (SwipeLayout)findViewById(R.id.surface);

//set show mode.
        swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);

//add drag edge.(If the BottomView has 'layout_gravity' attribute, this line is unnecessary)
        swipeLayout.addDrag(SwipeLayout.DragEdge.Left, findViewById(R.id.bottom_wrapper));

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
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
