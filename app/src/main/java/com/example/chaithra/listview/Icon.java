package com.example.chaithra.listview;

/**
 * Created by chaithra on 9/20/16.
 */
public class Icon {
   private String name;
    Icon(String name)
    {
        this.name=name;

    }

    public String getName()
    {
       return  name;
    }
    public int getresource()
    {
        return R.drawable.image1;

    }
    public String toStrig()
    {
    return name;
    }
}
