package lins.mychris;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by LINS on 2017/2/10.
 * Please Try Hard
 */
public class Zhuzi extends View {
    private RectF rectF;
    public Zhuzi(Context context) {
        super(context);
    }

    public Zhuzi(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Zhuzi(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);

        canvas.drawRect(rectF,paint);
        //canvas.drawRect(0,0,30,100,paint);
    }
    int w;
    int h;

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        w = MeasureSpec.getSize(widthMeasureSpec);
        h = MeasureSpec.getSize(heightMeasureSpec);
        rectF = new RectF(0,0,w,h/2);
    }
}

