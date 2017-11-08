package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private final Context context;

    public Practice11PieChartView(Context context) {
        super(context);
        this.context=context;
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);

        RectF oval=new RectF(300,200,800,700);
        paint.setColor(Color.GRAY);
        canvas.drawArc(oval,5,10,true,paint);

        paint.setColor(Color.WHITE);
        canvas.drawArc(oval,20,10,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(oval,33,50,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(oval,86,94,true,paint);

        paint.setColor(context.getColor(android.R.color.holo_orange_dark));
        canvas.drawArc(oval,0,-45,true,paint);


        paint.setColor(context.getColor(android.R.color.holo_red_dark));
        RectF oval1=new RectF(280,180,780,680);
        canvas.drawArc(oval1,-45,-135,true,paint);
    }
}
