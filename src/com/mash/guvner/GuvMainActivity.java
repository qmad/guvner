package com.mash.guvner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class GuvMainActivity extends Activity {
	CustomListAdapter adapter;
	ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guv_main);
		 list=(ListView)findViewById(R.id.list);
		 
		 String[]governors={"evans kidero","peter munya","alfred mutua","isaac ruto"};
		  
		 Integer[]images={R.drawable.kidero,R.drawable.munya,R.drawable.mutua,R.drawable.ruto};
		 
		 adapter= new CustomListAdapter(this,governors, images);
		 
		 list.setAdapter(adapter);
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.guv_main, menu);
		return true;
	}

}
