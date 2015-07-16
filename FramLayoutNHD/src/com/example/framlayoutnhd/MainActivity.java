package com.example.framlayoutnhd;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

/*
 * ����FramLayout��ʵ���޺�ƵĹ���
 */


public class MainActivity extends Activity {
	private int currentColor = 0;
	final int[] color = {
			R.color.color1,R.color.color2,
			R.color.color3,R.color.color4,
			R.color.color5,R.color.color6		
	};
	final int[] id = {
			R.id.view01,
			R.id.view02,
			R.id.view03,
			R.id.view04,
			R.id.view05,
			R.id.view06
	};
	TextView[] views = new TextView[id.length];
	Handler handler = new Handler(){
		@Override
		public void handleMessage(Message msg){
			//������Ϣ���Ա�����������
		if(msg.what == 0x123){
			for (int i = 0; i < id.length ; i ++){
				views[i].setBackgroundResource(color[(i+currentColor)%id.length]);
			}
			currentColor++;
		}
		super.handleMessage(msg);
		}
	};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i = 0 ; i < id.length; i++){
        	views[i] = (TextView)findViewById(id[i]); 
        }
        //����һ���µ��߳������Եظı�currentColor����ֵ
        new Timer().schedule(new TimerTask()
        {
        	@Override
        	public void run(){
        		//����һ����Ϣ֪ͨϵͳ�ı�6��TextView����ı���ɫ
        		handler.sendEmptyMessage(0x123);
        	}
        }, 0,200);
    }

  
}