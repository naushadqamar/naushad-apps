package com.alquran;




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter
{
	 private Context context;
	 
	 //---the images to display---
	   public Integer[] imageIDs = {
			   
			   R.drawable.alf,
			   R.drawable.sq,
	           R.drawable.tilkr,
	            R.drawable.juz4//,
//	            R.drawable.parah1,
//	            R.drawable.parah1,
//	            R.drawable.parah1,
//	            R.drawable.parah1,
//	            R.drawable.parah1,
//	           R.drawable.parah1,
//	            R.drawable.parah1,
//	            R.drawable.parah1,
//	            R.drawable.parah1,
//	            R.drawable.quranmain

	            
			   
	    };
	 
	 
     public ImageAdapter(Context c) 
     {
         context = c;
     }

     //---returns the number of images---
     @Override
	public int getCount() {
         return imageIDs.length;
     }

     //---returns the ID of an item--- 
     @Override
	public Object getItem(int position) {
         return position;
     }

     @Override
	public long getItemId(int position) {
         return position;
     }

     //---returns an ImageView view---
     @Override
	public View getView(int position, View convertView, ViewGroup parent) 
     {
         ImageView imageView;
        
         if (convertView == null) {
        	  
             imageView = new ImageView(context);
             imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
             imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
             imageView.setPadding(5, 5, 5, 5);
             
             
         } else {
        	 	imageView = (ImageView) convertView;
 
         }
         imageView.setImageResource(imageIDs[position]);
         return imageView;
     }
 }    

