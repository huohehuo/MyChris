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
public class TreeTop extends View {
    private RectF rectF;
    public TreeTop(Context context) {
        super(context);
    }

    public TreeTop(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TreeTop(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        paint.setAntiAlias(true);

        Path path = new Path();
        path.moveTo(w/2,0);
        path.lineTo(w/2-100,200);
        path.lineTo(w/2+100,200);
        path.close();
        canvas.drawPath(path,paint);
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

