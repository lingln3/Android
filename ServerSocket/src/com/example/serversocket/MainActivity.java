package com.example.serversocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText write_text;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		write_text = (EditText)findViewById(R.id.write);
		
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				
				try{
					ServerSocket serverSocket = new ServerSocket(12333);
					while(true)
					{
						Socket socket = serverSocket.accept();
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(socket.getInputStream()));
						BufferedWriter writer = new BufferedWriter(
								new OutputStreamWriter(socket.getOutputStream()));
						writer.write(write_text.toString());
						writer.flush();
						writer.close();
						socket.close();
					}
				}catch(IOException e)
				{
					e.printStackTrace();
				}
				
			}
			
		}).start();
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
