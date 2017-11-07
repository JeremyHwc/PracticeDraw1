package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        //1.实心圆
        Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(200,200,100,paint);

        //2.空心圆
        Paint paint1=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setColor(Color.BLACK);
        canvas.drawCircle(400,200,100,paint1);

        //3.蓝色实心圆
        Paint paint2=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint2.setColor(Color.BLUE);
        canvas.drawCircle(200,400,100,paint2);

        //4.线宽为 20 的空心圆
        Paint paint3=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint3.setStrokeWidth(20);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(Color.BLACK);
        canvas.drawCircle(400,400,100,paint3);//半径指的是内圆半径
    }
}
