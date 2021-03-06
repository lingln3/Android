package com.example.gridviewtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;


public class MainActivity extends Activity {
	
	GridView gridView;
	ImageView imageView;
	
	int[] imageIds = new int[]{
			R.drawable.f000,R.drawable.f001,R.drawable.f002,
			R.drawable.f003,R.drawable.f004,R.drawable.f005,
			R.drawable.f006,R.drawable.f007,R.drawable.f008,
			R.drawable.f009,R.drawable.f010,R.drawable.f011
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imageView = (ImageView)findViewById(R.id.imageView);
        gridView = (GridView)findViewById(R.id.grid01); 
        
        //创建一个List对象，List对象的元素是Map
        List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
        for(int i = 0; i < imageIds.length; i++)
        {
        	Map<String,Object> listItem = new HashMap<String,Object>();
        	listItem.put("image", imageIds[i]);
        	listItems.add(listItem);
        }
       
        //创建一个SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(this,listItems,
        		R.layout.cell2,new String[]{"image"},new int[]{R.id.image1});
        
        gridView.setAdapter(adapter);
        
        gridView.setOnItemSelectedListener(new OnItemSelectedListener(){
        	
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				
				//显示当前图片
				imageView.setImageResource(imageIds[position]);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
        });
        
        //添加列表项被单击的监听器
       gridView.setOnItemClickListener(new OnItemClickListener(){
    	 
    	   @Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			
    		   //显示被单击的图片
    		   imageView.setImageResource(imageIds[position]);
    	   }
       });
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
