package com.alquran;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class AlQuranIndex extends Activity  implements
AdapterView.OnItemClickListener {

	private static final int REQUEST_CODE = 10;
	TextView selection;	
	
	//String[] items = { "Juz 1", "Juz 2" };
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.quranindex);
        
        GridView gv = (GridView) findViewById(R.id.grid);
//		ArrayAdapter<String> aa = new ArrayAdapter<String>(
//		this,
//		android.R.layout.simple_list_item_1, 
//		items );
//		
		gv.setAdapter(new ImageAdapter(this));
		gv.setOnItemClickListener(this);
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		// TODO Auto-generated method stub

		//if (position==1)
		//{
		Intent i = new Intent(this, Quran.class);
		
		i.putExtra("Value1", "This value one for ActivityTwo " +position);
		//i.putExtra("Value2", "This value two ActivityTwo"+position);
		i.putExtra("Value2", position+"");
		i.putExtra("Value3", position);
		// Set the request code to any code you like, you can identify the
		// callback via this code
		startActivityForResult(i, REQUEST_CODE);
		//}
	}

}
