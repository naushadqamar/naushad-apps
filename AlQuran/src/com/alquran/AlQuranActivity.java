package com.alquran;



import com.alquran.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageSwitcher;
import android.widget.Toast;

public class AlQuranActivity extends Activity {
    /** Called when the activity is first created. */
	
	private WebView webView;
	View.OnTouchListener gestureListener;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        webView = (WebView) findViewById(R.id.WebView01);
        webView.getSettings().setJavaScriptEnabled(true);

        
        Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		String value1 = extras.getString("Value1");
		String value2 = extras.getString("Value2");
		int value3 = extras.getInt("Value3");
		if (value1 != null && value2 != null) {
			Toast.makeText(this, value1 , Toast.LENGTH_SHORT).show();
			Toast.makeText(this, value1 , Toast.LENGTH_SHORT).show();
			//EditText text1 = (EditText) findViewById(R.id.EditText01);
			//EditText text2 = (EditText) findViewById(R.id.EditText02);
			//text1.setText(value1);
			//text2.setText(value2);
		}
        
//        if (value2 == "1")
//           webView.loadUrl("file:///android_asset/swipeSlides.html");
//        else
//        	webView.loadUrl("file:///android_asset/index.html");

        if (value3 == 1)
            webView.loadUrl("file:///android_asset/swipeSlides.html");
         
         
           //webView.getSettings().setBuiltInZoomControls(true);
    
    }
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
    	
//    	if (item.getTitle().length() == 11)
//    		
//		Toast.makeText(this, "Enabled" +item.getTitle().length()+" " + item.getItemId(), Toast.LENGTH_SHORT).show();
//    	else// if  (item.getTitle().toString() == "ZoomDisabled")
//    		Toast.makeText(this, "Diaabled a test " +item.getTitle() +" " + item.getItemId(), Toast.LENGTH_SHORT).show();
//		
    	 
if (item.getTitle().length() == 11)
    		
		{ ImageSwitcher is= new ImageSwitcher(null);
		
    		webView.getSettings().setBuiltInZoomControls(true);
    		Toast.makeText(this, "Zoom Enabled ", Toast.LENGTH_SHORT).show();
		}
		
    	else if (item.getTitle().length() == 12)
    	{
    		webView.getSettings().setBuiltInZoomControls(false);
    		Toast.makeText(this, "Zoom Disabled " , Toast.LENGTH_SHORT).show();
    		webView.refreshPlugins(true);
    	}
    	 
    	 
		return true;
	}


}