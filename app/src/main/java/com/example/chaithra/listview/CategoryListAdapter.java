package com.example.chaithra.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by chaithra on 9/20/16.
 */
public class CategoryListAdapter extends ArrayAdapter<Category>{
    CategoryManager categoryManager;
    @Override
    public Category getItem(int position) {
        return categoryManager.getCategory(position);
    }

    @Override
    public int getCount() {
        return categoryManager.totalCategories();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        TextView categoryNameField = null;
        TextView iconsCountField = null;
        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            row = inflater.inflate(R.layout.category_cell, parent, false);

        }

        categoryNameField = (TextView) row.findViewById(R.id.categoryName);
        iconsCountField = (TextView) row.findViewById(R.id.iconsCount);

        Category category = categoryManager.getCategory(position);

        categoryNameField.setText(category.getName());
        iconsCountField.setText( "" + category.totalIcons());



        return row;

    }



    public CategoryListAdapter(Context context, int resource, CategoryManager categoryManager) {

        super(context, resource);
        this.categoryManager=categoryManager;
    }

}
