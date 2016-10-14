package com.example.chaithra.listview;

import java.util.ArrayList;

/**
 * Created by chaithra on 9/20/16.
 */
public class Category {
    String name;
    ArrayList<Icon> icons ;
     static int count =1;

    Category(String name)
    {
        this.name=name;
        icons=new ArrayList<Icon>();
        addTestIcons();
    }

    private void addTestIcons(){
        for( int index =0 ; index < count ; index++ ){
            Icon icon = new Icon(this.name + "-" + index);
            icons.add(icon);
        }

        count++;
    }

    public void addIcon(Icon icon)
    {
     icons.add(icon);
    }

    public int totalIcons()
    {
       return icons.size();
    }

    public Icon getIcon(int position){
        if(position>icons.size() || position<0)
        {
            return null;
        }
    return icons.get(position) ;
    }
   public String getName()
   {
       return name;
   }
public  String toString()
{
    return name;
}
}
