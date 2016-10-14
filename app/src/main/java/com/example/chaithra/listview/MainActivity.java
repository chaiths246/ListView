package com.example.chaithra.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    CategoryManager categoryManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);

prepareCategories();
     CategoryListAdapter adapter = new CategoryListAdapter(this,
                android.R.layout.simple_list_item_1, categoryManager);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent gridViewActivityIntent = new Intent(MainActivity.this,list1.class);
                gridViewActivityIntent.putExtra("position", position);
                startActivity(gridViewActivityIntent);

}
});


        }
    private void prepareCategories()
    {
        categoryManager= CategoryManager.INSTANCE;
        Category tvc=new Category("TV");

        categoryManager.addCategory(tvc);
        Category action=new Category("Action");
        categoryManager.addCategory(action);
        Category movies=new Category("Movies");
        categoryManager.addCategory(movies);

        Category arena=new Category("Arena");
        categoryManager.addCategory(arena);
        Category arena1=new Category("Arena1");
        categoryManager.addCategory(arena1);
    }
}
