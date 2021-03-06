package com.example.simpleclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SimpleClient extends Activity {

	EditText show;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_simple_client);		
		LinearLayout layout = (LinearLayout)findViewById(R.layout.activity_simple_client);
		TextView textView = new TextView(this);
//		textView.setId(110);
		layout.addView(textView);
		setContentView(layout);
		show = (EditText)findViewById(R.id.show);
		new Thread()
		{
			@Override
			public void run()
			{
			try
			{
				//建立连接到远程服务器的socket
				Socket socket = new Socket("223.3.52.191",12333);
				//将socket对应的输入流包装成BufferedReader
				BufferedReader br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				//进行普通I/O操作
				String line = br.readLine();
				show.setText("来自服务器的数据："+line);
				//关闭输入流、socket
				br.close();
				socket.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}.start();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simple_client, menu);
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
