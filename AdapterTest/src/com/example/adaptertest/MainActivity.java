package com.example.adaptertest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //����һ������
        String[] arr1 = {"�����","��˽�","ţħ��","�캢��"};
        String[] arr2 = {"Java","Hibernate","Spring","Android"};
        ListView listView01 = (ListView)findViewById(R.id.listView01);
        ListView listView02 = (ListView)findViewById(R.id.listView02);
        
        //�������װΪArrayAdapter
        ArrayAdapter<String> adapter01 = new ArrayAdapter<String>(this, R.layout.array_item, arr1);
        ArrayAdapter<String> adapter02 = new ArrayAdapter<String>(this,R.layout.array_item,arr2);
        
        //ΪListView����Adapter
        listView01.setAdapter(adapter01);
        listView02.setAdapter(adapter02);
        
        
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
