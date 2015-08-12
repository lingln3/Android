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
    //��ó�ʼ�龰ģʽ
    public void getInitring(AudioManager audio)
    {
    	//ȡ���ֻ��ĳ�ʼ����������ʼ��������
    	int volume = audio.getStreamVolume(AudioManager.STREAM_RING);
    	//ȡ�ó�ʼģʽ�����ֱ�����ͼ��
    	int mode = audio.getRingerMode();
    }
    
    //�����龰ģʽһ�� ֻ������������
    public void ring(AudioManager audio)
    {
    	audio.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,AudioManager.VIBRATE_SETTING_OFF);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION, AudioManager.VIBRATE_SETTING_OFF);
    	Toast.makeText(this, "���óɹ�����ǰΪ����", Toast.LENGTH_LONG).show();    	
     }
    
    //�龰ģʽ��������������������
    void ringAndVibrate(AudioManager audio)
    {
    	audio.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER, AudioManager.VIBRATE_SETTING_ON);
    	audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION, AudioManager.VIBRATE_SETTING_ON);
    	Toast.makeText(this, "���óɹ�����ǰ��������������", Toast.LENGTH_LONG).show();
    }
    
    //�龰����ֻ���񶯣�û������
    public void vibrate(AudioManager audio)
    {
    	audio.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,
                AudioManager.VIBRATE_SETTING_ON);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION,
                AudioManager.VIBRATE_SETTING_ON);
        Toast.makeText(this, "���óɹ�����ǰΪ��", Toast.LENGTH_LONG).show();
    }
    
    //�龰ģʽ�ģ�������������
    public void noRingAndVibrate(AudioManager audio) {
        audio.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,
                AudioManager.VIBRATE_SETTING_OFF);
        audio.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION,
                AudioManager.VIBRATE_SETTING_OFF);
        Toast.makeText(this, "���óɹ�����ǰΪ��������", Toast.LENGTH_LONG).show();
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
