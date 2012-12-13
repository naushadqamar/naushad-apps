package com.alquran;





import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomButton;
import android.widget.ZoomButtonsController;
import android.widget.ZoomControls;



public class Quran extends Activity  {
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.quran);

//getting data from parent Activity	        
	        Bundle extras = getIntent().getExtras();
			if (extras == null) {
				return;
			}
			String value1 = extras.getString("Value1");
			String value2 = extras.getString("Value2");
			int value3 = extras.getInt("Value3");
			if (value1 != null && value2 != null) {
			
			}
	        
	        // Reference the Gallery view
	        Gallery g = (Gallery) findViewById(R.id.gallery);
	        g.setSpacing(2);
	        // Set the adapter to our custom adapter (below)

	        if (value3 ==1)
	        g.setAdapter(new ImageAdapter(this,sayaqool));
	        else if (value3==0)
	        	g.setAdapter(new ImageAdapter(this,alifLamMeem));
	        else if (value3==2)
	        	g.setAdapter(new ImageAdapter(this,tilkarRusl));
	        g.setSelection(g.getCount()-1);
	        
	        Toast.makeText(this, "Juz " +(value3+1), Toast.LENGTH_SHORT).show();
	       
	        
	       
	    }
	 
	 
	    public class ImageAdapter extends BaseAdapter  {

	        private Context mContext;
	        private Integer[] parah ;
	        
	        public ImageAdapter(Context c) {
	            mContext = c;
	            
	        }

	        public ImageAdapter(Context c, Integer[] Juz) {
	            mContext = c;
	            parah = Juz;
	            
	        }
	        public int getCount() {
	            return parah.length;
	        }

	        public Object getItem(int position) {
	            return position;
	        }

	        public long getItemId(int position) {
	            return position;
	        }

	        public View getView(int position, View convertView, ViewGroup parent) {
	      	
	        	ImageView i = new ImageView(mContext);

	            i.setImageResource(parah[position]);
	            i.setScaleType(ImageView.ScaleType.FIT_XY);
	            
	            //i.setLayoutParams(new Gallery.LayoutParams(136, 88));
	            
	            return i;
	            
	        }

	    }


        public Integer[] alifLamMeem = {
        		
        		R.drawable.p022,
        		R.drawable.p021,
                R.drawable.p020,
                R.drawable.p019,
                R.drawable.p018,
        		R.drawable.p017,
        		R.drawable.p016,
                R.drawable.p015,
                R.drawable.p014,
                R.drawable.p013,
                R.drawable.p012,
        		R.drawable.p011,
        		R.drawable.p010,
                R.drawable.p009,
                R.drawable.p008,
                R.drawable.p007,
                R.drawable.p006,
                R.drawable.p005,
                R.drawable.p004,
                R.drawable.p003
        };
        
        public Integer[] sayaqool = {
        
                R.drawable.p042,
                R.drawable.p041,
                R.drawable.p040,
                R.drawable.p039,
                R.drawable.p038,
                R.drawable.p037,
                R.drawable.p036,
                R.drawable.p035,
                R.drawable.p034,
                R.drawable.p033,
                R.drawable.p032,
                R.drawable.p031,
                R.drawable.p030,
                R.drawable.p029,
                R.drawable.p028,
                R.drawable.p027,
                R.drawable.p026,
                R.drawable.p025,
                R.drawable.p024,
                R.drawable.p023
        };
        
        public Integer[] tilkarRusl = {
                
                R.drawable.p062,
                R.drawable.p061,
                R.drawable.p060,
                R.drawable.p059,
                R.drawable.p058,
                R.drawable.p057,
                R.drawable.p056,
                R.drawable.p055,
                R.drawable.p054,
                R.drawable.p053,
                R.drawable.p052,
                R.drawable.p051,
                R.drawable.p050,
                R.drawable.p049,
                R.drawable.p048,
                R.drawable.p047,
                R.drawable.p046,
                R.drawable.p045,
                R.drawable.p044,
                R.drawable.p043
        };


}
