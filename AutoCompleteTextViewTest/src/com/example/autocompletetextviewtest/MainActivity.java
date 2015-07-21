package com.example.autocompletetextviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


public class MainActivity extends Activity {

	AutoCompleteTextView actv;
	MultiAutoCompleteTextView mctv;
	//定义字符串数组，作为提示的文本
	String[] books = new String[]{
			"book1", "Happy","lovely","ending","begining"
	};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //创建一个Adapter，封装数组
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
        		android.R.layout.simple_dropdown_item_1line,books);
        actv = (AutoCompleteTextView)findViewById(R.id.auto);
        mctv = (MultiAutoCompleteTextView)findViewById(R.id.multi);
        actv.setAdapter(aa);
        mctv.setAdapter(aa);
        //为mctv设置分隔符
        mctv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
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
