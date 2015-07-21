package com.example.simpleadaptertest;

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
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class MainActivity extends Activity {

	private String[] name = new String[]{"��ͷ","Ū��","������","���"};
	private String[] descs = new String[]
			{"�ɰ���С��","һ���ó����ֵ�Ů��","һ���ó���ѧ��Ů��","��������ʫ��"};
	private int[] imageId = new int[]{
		R.drawable.f000,R.drawable.f001,R.drawable.f002,
		R.drawable.f003,R.drawable.f004
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        List<Map<String,Object>> listItems = 
        		new ArrayList<Map<String,Object>>();
        for(int i = 0; i<name.length; i++)
        {
        	Map<String,Object> listItem = new HashMap<String,Object>();
        	listItem.put("header", imageId[i]);
        	listItem.put("personName", name[i]);
        	listItem.put("desc", descs[i]);
        	listItems.add(listItem);
        }
        
        //����һ��SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,R.layout.simple_item,
        		new String[]{"personName","header","desc"},
        		new int[]{R.id.textView01,R.id.imageView,R.id.textView02});
        ListView listView = (ListView)findViewById(R.id.listView01);
        listView.setAdapter(simpleAdapter);
    }

    
    public void listOnItemClickListener(ListView list){
    	list.setOnItemClickListener(new OnItemClickListener(){
    	
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				System.out.println(name[position]+"��������");
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
