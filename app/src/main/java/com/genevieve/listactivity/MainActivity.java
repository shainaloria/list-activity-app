package com.genevieve.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Image> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list);

        imageList.add(new Image(R.drawable.baseline_brush_black_24, "Item 1"));
        imageList.add(new Image(R.drawable.baseline_face_black_24, "Item 2"));
        imageList.add(new Image(R.drawable.baseline_how_to_vote_black_24, "Item 3"));
        imageList.add(new Image(R.drawable.baseline_new_releases_black_24, "Item 4"));
        imageList.add(new Image(R.drawable.baseline_sentiment_satisfied_alt_black_24, "Item 5"));
        imageList.add(new Image(R.drawable.baseline_settings_input_antenna_black_24, "Item 6"));
        imageList.add(new Image(R.drawable.baseline_mood_bad_black_24, "Item 7"));
        imageList.add(new Image(R.drawable.baseline_sports_kabaddi_black_24, "Item 8"));
        imageList.add(new Image(R.drawable.baseline_nature_people_black_24, "Item 9"));

        ImageListAdapter adapter = new ImageListAdapter(this, R.layout.list_item, imageList);

        listView.setAdapter(adapter);
    }
}
