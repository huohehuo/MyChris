package lins.mychris;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by LINS on 2017/2/10.
 * Please Try Hard
 */
public class MyTreeView extends View{
    public MyTreeView(Context context) {
        super(context);
    }

    public MyTreeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTreeView(Context context, AttributeSet attrs, int defStyleAttr) {
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
        path.moveTo(w/2+30,0);
        path.lineTo(w/2-30,0);
        path.lineTo(w/2-400,500);
        path.lineTo(w/2+400,500);
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
    }
}
