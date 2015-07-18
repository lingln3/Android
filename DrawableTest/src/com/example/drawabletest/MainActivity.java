package com.example.drawabletest;
/*
 * ʹ��StateListDrawable��Դ��������ʾ����������ı���
 */
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageView imageView = (ImageView)findViewById(R.id.image);
        //��ȡͼƬ����ʾ��ClipDrawable����
        final ClipDrawable drawable = (ClipDrawable)imageView.getDrawable();
        
        final Handler handler = new Handler(){
        	@Override
        	public void handleMessage(Message msg){
        		//�����Ϣ�Ǳ����������͵�
        		if(msg.what == 0x1233)
        		{
        			//�޸�ClipDrawable��levelֵ
        			drawable.setLevel(drawable.getLevel()+200);
        		}
        	}
        };
        final Timer timer = new Timer();
        timer.schedule(new TimerTask(){
        	@Override
        	public void run(){
        		Message msg = new Message();
        		msg.what = 0x1233;
        		//������Ϣ��֪ͨӦ���޸�ClipDrawable�����levelֵ
        		handler.sendMessage(msg);
        		//ȡ����ʱ��
        		if(drawable.getLevel() >= 10000)
        		{
        			timer.cancel();
        		}
        	}
        }, 0,300);
        
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
