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

    private boolean useCenter = true;
    public ArcView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);

        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(6);

    }
    @Override
    protected void onDraw(Canvas canvas) {

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(360, 110, 40, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(360, 110, 30, paint);

        RectF rectF1 = new RectF();
        rectF1.left = 30;
        rectF1.top = 190;
        rectF1.right = 120;
        rectF1.bottom = 280;

        canvas.drawArc(rectF1, 30, 60, useCenter, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF1, 90, 20, useCenter, paint);

//        RectF rectF2 = new RectF();
//        rectF2.left = 140;
//        rectF2.top = 190;
//        rectF2.right = 280;
//        rectF2.bottom = 290;
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawArc(rectF2, 0, 360, useCenter, paint);

//        RectF rectF3 = new RectF();
//        rectF3.left = 160;
//        rectF3.top = 190;
//        rectF3.right = 260;
//        rectF3.bottom = 290;
//
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
//        canvas.drawArc(rectF3, 0, 360, useCenter, paint);

    }
}