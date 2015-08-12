package com.example.qingjingqiehuan;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends Activity {
	public TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    //获得初始情景模式
    public void getInitring(AudioManager audio)
    {
    	//取得手机的初始音量，并初始化进度条
    	int volume = audio.getStreamVolume(AudioManager.STREAM_RING);
    	//取得初始模式，并分别设置图标
    	int mode = audio.getRingerMode();
    }
    
    //设置情景模式一： 只有声音，无振动
    public void ring(AudioManager audio)
    {
    	audio.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,AudioManager.VIBRATE_SETTING_OFF);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION, AudioManager.VIBRATE_SETTING_OFF);
    	Toast.makeText(this, "设置成功！当前为铃声", Toast.LENGTH_LONG).show();    	
     }
    
    //情景模式二：既有声音，又有震动
    void ringAndVibrate(AudioManager audio)
    {
    	audio.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER, AudioManager.VIBRATE_SETTING_ON);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION, AudioManager.VIBRATE_SETTING_ON);
    	Toast.makeText(this, "设置成功！当前既有铃声又有震动", Toast.LENGTH_LONG).show();
    }
    
    //情景三：只有振动，没有铃声
    public void vibrate(AudioManager audio)
    {
    	audio.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,
                AudioManager.VIBRATE_SETTING_ON);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION,
                AudioManager.VIBRATE_SETTING_ON);
        Toast.makeText(this, "设置成功！当前为振动", Toast.LENGTH_LONG).show();
    }
    
    //情景模式四：无声音，无振动
    public void noRingAndVibrate(AudioManager audio) {
        audio.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,
                AudioManager.VIBRATE_SETTING_OFF);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION,
                AudioManager.VIBRATE_SETTING_OFF);
        Toast.makeText(this, "设置成功！当前为无声无振动", Toast.LENGTH_LONG).show();
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
