package mobile.android.ch15.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by michael on 14-3-13.
 */
class ArcView extends View {
    private Paint paint = new Paint();

    private boolean useCenter = false;
    public ArcView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
    }
    @Override
    protected void onDraw(Canvas canvas) {

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(360, 110, 40, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(360, 110, 30, paint);

        RectF rectF1 = new RectF();
        rectF1.left = 30;
        rectF1.top = 50;
        rectF1.right = 330;
        rectF1.bottom = 350;
        paint.setStrokeWidth(20);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF1, 30, 60, useCenter, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF1, 90, 20, useCenter, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF1, 150, 98, false, paint);
        paint.setColor(Color.BLACK);

        RectF rectF2 = new RectF();
        rectF2.left = 20;
        rectF2.top = 40;
        rectF2.right = 340;
        rectF2.bottom = 360;

        canvas.drawArc(rectF2, 110, 40, false, paint);


    }
}