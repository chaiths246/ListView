package com.example.chaithra.listview;

/**
 * Created by chaithra on 9/14/16.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chaithra on 9/13/16.
 */
public class GridViewCustomAdapter extends ArrayAdapter
{
    Context context;



    public GridViewCustomAdapter(Context context)
    {
        super(context, 0);
        this.context=context;

    }

    public int getCount()
    {
        return 24;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;

        if (row == null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.grid, parent, false);


            TextView textViewTitle = (TextView) row.findViewById(R.id.textView);
            ImageView imageViewIte = (ImageView) row.findViewById(R.id.imageView);

            if(position%2==0)
            {
                textViewTitle.setText("Delete");
                imageViewIte.setImageResource(R.drawable.image1);
            }
            else
            {
                textViewTitle.setText("Power");
                imageViewIte.setImageResource(R.drawable.image2);
            }
        }



        return row;

    }

}
