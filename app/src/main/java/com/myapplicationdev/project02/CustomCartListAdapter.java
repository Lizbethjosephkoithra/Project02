package com.myapplicationdev.project02;

/**
 * Created by 17041061 on 6/1/2019.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomCartListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public CustomCartListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.activity_listview, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_listview, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.itemName1);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.itemImage);
        TextView extratxt = (TextView) rowView.findViewById(R.id.itemName2);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("1kg ; 2 nos");
        return rowView;

    };
}