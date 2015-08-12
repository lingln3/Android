package com.example.viewswitchertest;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;


public class MainActivity extends Activity {

	//����һ��������������ʾÿ����ʾ��Ӧ�ó�����Ŀ
	public static final int NUMBER_PER_SCREEN = 12;
	//����Ӧ�ó�����ڲ���
	public static class DataItem
	{
		//Ӧ�ó�������
		public String dataName;
		//Ӧ�ó���ͼ��
		public Drawable drawable;
	}
	//����ϵͳ����Ӧ�ó����List����
	private ArrayList<DataItem> items = new ArrayList<DataItem>();
	//��¼��ǰ������ʾ�ڼ����ĳ���
	private int screenNo = -1;
	//���������ռ��������
	private int screenCount;
	ViewSwitcher switcher;
	//����layoutinflater����
	LayoutInflater inflater;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflater = LayoutInflater.from(MainActivity.this);
        //����һ������40��Ԫ�ص�List���ϣ�����ģ�����40��Ӧ�ó���
        for (int i = 0; i<40 ; i++)
        {
        	String label = "" + i;
        	Drawable drawable = getResources().getDrawable(R.drawable.ic_launcher);
        	DataItem item = new DataItem();
        	item.dataName = label;
        	item.drawable = drawable;
        	items.add(item);
        }
        
        //����Ӧ�ó�����ռ��������
        //���Ӧ�ó��������������NUMBER_PER_SCREEN�������Ľ������������
        //�������������������ӦΪ�����Ľ��+1
        screenCount = items.size()%NUMBER_PER_SCREEN == 0?
        		items.size()/NUMBER_PER_SCREEN : items.size()/NUMBER_PER_SCREEN + 1;
        switcher = (ViewSwitcher)findViewById(R.id.viewSwitcher);
        switcher.setFactory(new ViewFactory()
        		{
        			@Override 
        			public View makeView()
        			{
        				//����R.layout.slidelistview�����ʵ���Ͼ���һ��GridView���
        				return inflater.inflate(R.layout.slidelistview, null);
        			}
        		});
        //ҳ�����ʱ����ʾ��һ��
        next(null);        
    }
    
    public void next(View v){
    	if(screenNo < screenCount - 1)
    	{
    		screenNo++;
    		//ΪViewSwitcher�������ʾ�������ö���
    		switcher.setInAnimation(this,R.anim.slide_in_right);
    		//ΪViewSwitcher��������ع������ö���
    		switcher.setInAnimation(this,R.anim.slide_out_left);
    		//������һ����Ҫ��ʾ��GridView��Ӧ��Adapter
    		((GridView)switcher.getNextView()).setAdapter(adapter);
    		//�����ұ߰�ť����ʾ��һ��
    		//ѧϰ���Ƽ���Ҳ��ͨ�����Ƽ��ʵ����ʾ��һ��
    		switcher.showNext();
    	}
    }
    
    public void prev(View v)
    {
    	if(screenNo > 0)
    	{
    		screenNo--;
    		//ΪViewSwitcher�������ʾ�������ö���
    		switcher.setInAnimation(this,R.anim.slide_in_right);
    		//ΪViewSwitcher��������ع������ö���
    		switcher.setInAnimation(this,R.anim.slide_out_left);
    		//������һ����Ҫ��ʾ��GridView��Ӧ��Adapter
    		((GridView)switcher.getNextView()).setAdapter(adapter);
    		//�����ұ߰�ť����ʾ��һ��
    		//ѧϰ���Ƽ���Ҳ��ͨ�����Ƽ��ʵ����ʾ��һ��
    		switcher.showPrevious();
    	}
    }
    
    //��BaseAdapter����Ϊÿ����Ļ��ʾ��GridView�ṩ�б���
    private BaseAdapter adapter = new BaseAdapter()
    {

		@Override
		public int getCount() {
			//����������һ������Ӧ�ó����������������NUMBER_PRE_SCREEN
			if(screenNo == screenNo -1
				&& items.size() % NUMBER_PER_SCREEN != 0)
			{
				//���һ����ʾ�ĳ�����ΪӦ�ó����������NUMBER_PER_SCREEN����
				return items.size() % NUMBER_PER_SCREEN;
			}
			//����ÿ����ʾ�ĳ�����ΪNUMBER_PER_SCREEN
			else return NUMBER_PER_SCREEN;			
		}
				

		@Override
		public DataItem getItem(int position) {
			// ����screenNo�����position���б��������
			return items.get(screenNo*NUMBER_PER_SCREEN+position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view = convertView;
			if(convertView == null)
			{
				//����R.layout.labelicon�����ļ�
				view = inflater.inflate(R.layout.labelicon, null);
			}
			//��ȡR.layout.labelicon�����ļ��е�ImageView�������λ������ͼ��
			ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
			imageView.setImageDrawable(getItem(position).drawable);
			//��ȡR.layout.labelicon�����ļ��е�TextView�������Ϊ֮�����ı�
			TextView textView = (TextView)view.findViewById(R.id.textView);
			textView.setText(getItem(position).dataName);
			return view;
		}
    	
    };

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
