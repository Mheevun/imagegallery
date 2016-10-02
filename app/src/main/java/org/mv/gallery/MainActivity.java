package org.mv.gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class MainActivity extends AppCompatActivity {

    private FeatureCoverFlow coverFlow;
    private CoverFlowAdapter adapter;
    private ArrayList<ImageGallery> imageList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coverflow);
        coverFlow = (FeatureCoverFlow) findViewById(R.id.coverflow);

        settingDummyData();
        adapter = new CoverFlowAdapter(this, imageList);
        coverFlow.setAdapter(adapter);
        coverFlow.setOnScrollPositionListener(onScrollListener());
    }

    private FeatureCoverFlow.OnScrollPositionListener onScrollListener() {
        return new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                Log.v("MainActiivty", "position: " + position);
            }

            @Override
            public void onScrolling() {
                Log.i("MainActivity", "scrolling");
            }
        };
    }

    private void settingDummyData() {
        imageList = new ArrayList<ImageGallery>();
        imageList.add(new ImageGallery(R.mipmap.rem2, "Avatar 3D"));
        imageList.add(new ImageGallery(R.mipmap.rem3, "Call Of Duty Black Ops 3"));
        imageList.add(new ImageGallery(R.mipmap.rem4, "DotA 2"));
        imageList.add(new ImageGallery(R.mipmap.rem5, "Halo 5"));
        imageList.add(new ImageGallery(R.mipmap.rem6, "Left 4 Dead 2"));
        imageList.add(new ImageGallery(R.mipmap.rem7, "StarCraft"));
        imageList.add(new ImageGallery(R.mipmap.rem8, "The Witcher 3"));
        imageList.add(new ImageGallery(R.mipmap.rem9, "Tom raider 3"));
        imageList.add(new ImageGallery(R.mipmap.rem10, "Need for Speed Most Wanted"));
        imageList.add(new ImageGallery(R.mipmap.rem11, "Need for Speed Most Wanted"));

        }
}
