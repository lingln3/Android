package com.example.framlayoutnhd;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

/*
 * 利用FramLayout来实现霓虹灯的功能
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
			//表明消息来自本程序所发送
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
        //定义一个新的线程周期性地改变currentColor变量值
        new Timer().schedule(new TimerTask()
        {
        	@Override
        	public void run(){
        		//发送一条消息通知系统改变6个TextView组件的背景色
        		handler.sendEmptyMessage(0x123);
        	}
        }, 0,200);
    }

  
}
