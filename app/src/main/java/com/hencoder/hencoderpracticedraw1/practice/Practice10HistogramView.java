package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.WHITE);
        canvas.drawLine(100, 50, 100, 600, paint);
        canvas.drawLine(100, 600, 1000, 600, paint);

        paint.setColor(Color.GREEN);
        RectF rect1 = new RectF(120, 580, 170, 600);
        canvas.drawRect(rect1, paint);

        RectF rect2 = new RectF(180, 560, 230, 600);
        canvas.drawRect(rect2, paint);

        RectF rect3 = new RectF(240, 580, 290, 600);
        canvas.drawRect(rect3, paint);

        RectF rect4 = new RectF(300, 300, 350, 600);
        canvas.drawRect(rect4, paint);

        RectF rect5 = new RectF(360, 190, 410, 600);
        canvas.drawRect(rect5, paint);

        RectF rect6 = new RectF(420, 200, 470, 600);
        canvas.drawRect(rect6, paint);

        RectF rect7 = new RectF(480, 480, 530, 600);
        canvas.drawRect(rect7, paint);

        paint.setTextSize(40);
        paint.setColor(Color.WHITE);
        canvas.drawText("直方图",480,650,paint);
    }
}
