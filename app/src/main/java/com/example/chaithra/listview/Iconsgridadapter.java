package com.example.chaithra.listview;

/**
 * Created by chaithra on 9/21/16.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chaithra on 9/20/16.
 */
public class Iconsgridadapter extends ArrayAdapter<Icon> {
    Category category;
    @Override
    public Icon getItem(int position) {
        return  category.getIcon(position);
    }

    @Override
    public int getCount() {
        return category.totalIcons();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        TextView iconNameField = null;
        ImageView iconImage = null;
        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            row = inflater.inflate(R.layout.grid, parent, false);


        }



        iconNameField = (TextView) row.findViewById(R.id.textView);
        iconImage = (ImageView) row.findViewById(R.id.imageView);
        Icon icon = category.getIcon(position);

        iconNameField.setText(icon.getName());
        iconImage.setImageResource(icon.getresource());

        return row;

    }

    public Iconsgridadapter(Context context, int resource, Category category) {

        super(context, resource);
        this.category=category;
    }

}

