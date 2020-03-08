package com.genevieve.listactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ImageListAdapter extends ArrayAdapter<Image> {

    List<Image> imageList;
    Context mContext;
    int resource;

    public ImageListAdapter(Context mContext, int resource, List<Image> imageList){
        super(mContext, resource, imageList);
        this.mContext = mContext;
        this.resource = resource;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(resource, null, false);

        LinearLayout listItem = view.findViewById(R.id.listItem);
        ImageView listImage = view.findViewById(R.id.listImage);
        TextView listText = view.findViewById(R.id.listText);

        final Image image = imageList.get(position);

        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Click On " + image.getName(), Snackbar.LENGTH_SHORT)
                        .setAction("No action", null).show();
            }
        });

        listImage.setImageDrawable(mContext.getResources().getDrawable(image.getImage()));
        listText.setText(image.getName());
        return view;
    }
}
