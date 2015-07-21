package com.example.baseadaptertest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {

	ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mListView = (ListView)findViewById(R.id.listView01);
        
        BaseAdapter adapter = new BaseAdapter()
        {
        	@Override        	
        	public int getCount(){
        	//返回值决定了该Adapter将会包含多少个列表项
        		return 40;
        	}
        	@Override
        	public Object getItem(int position)
        	{
        		//返回值决定第position处的列表项的内容
        		return null;
        	}
        	@Override
        	public long getItemId(int position)
        	{
        		//返回之将作为列表项的ID
        		return position;
        	}
        	
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				
				//创建一个LinearLayout，并向其中添加两个组件
        		LinearLayout line = new LinearLayout(MainActivity.this);
        		line.setOrientation(0);
        		ImageView image = new ImageView(MainActivity.this);
        		image.setImageResource(R.drawable.ic_launcher);
        		TextView text = new TextView(MainActivity.this);
        		text.setText("第"+(position+1)+"个列表项");
        		text.setTextSize(20);
        		text.setTextColor(Color.RED);
        		line.addView(image);
        		line.addView(text);
        		
        		//返回LinearLayout实例
        		return line;
			}
        };
        mListView.setAdapter(adapter);
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
