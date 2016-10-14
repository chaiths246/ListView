package com.example.chaithra.listview;

import java.util.ArrayList;

/**
 * Created by chaithra on 9/20/16.
 */
public class CategoryManager {

    public static CategoryManager INSTANCE = new CategoryManager();
    private ArrayList<Category> categories;

    private CategoryManager() {
        categories = new ArrayList<Category>();
    }

    public int totalCategories() {
        return categories.size();
    }
    public Category getCategory(int position)
    {
        if(position>categories.size() || position<0)
        {
            return null;
        }

        return categories.get(position);
    }

    public void addCategory(Category category)
    {
        if(category==null)
        {
            return;
        }
        categories.add(category);
    }
}