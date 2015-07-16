package com.example.drawview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View{
	
	public float currentX = 40;
	public float currentY = 50;
	//���岢��������
	Paint p = new Paint();
	public DrawView(Context context){
		super(context);
	}
	public DrawView(Context context,AttributeSet set){
		super(context,set);
	}
	
	@Override
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);
		//���û��ʵ���ɫ
		p.setColor(Color.RED);
		//����һ��СԲ����ΪС��
		canvas.drawCircle(currentX, currentY, 15, p);
	}
	
	//Ϊ������Ĵ����¼���д�¼���������
	@Override
	public boolean onTouchEvent(MotionEvent event){
		//�޸�currentX,currentY��������
		currentX = event.getX();
		currentY = event.getY();
		//֪ͨ��ǰ����ػ��Լ�
		invalidate();
		//����true�����ô��������Ѿ��������¼�
		return true;
	}

}