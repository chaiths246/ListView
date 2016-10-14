package com.example.chaithra.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class list1 extends AppCompatActivity
{
    GridView gridView;
    Iconsgridadapter grisViewCustomeAdapter;
    Category category;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        Intent intent = getIntent();

        if( intent != null ){
            int position = intent.getIntExtra("position", 0);
            category = CategoryManager.INSTANCE.getCategory(position);
        }


        gridView=(GridView)findViewById(R.id.gridViewCustom);
        prepareCategory();
        // Create the Custom Adapter Object
        grisViewCustomeAdapter = new Iconsgridadapter(this,android.R.layout.simple_list_item_1,category);
        // Set the Adapter to GridView
        gridView.setAdapter(grisViewCustomeAdapter);


        Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Icon icon = new Icon(category.name + "-" + category.totalIcons());
                category.addIcon(icon);
                grisViewCustomeAdapter.notifyDataSetChanged();
            }
        });


    }

    private void prepareCategory(){

    }
}

