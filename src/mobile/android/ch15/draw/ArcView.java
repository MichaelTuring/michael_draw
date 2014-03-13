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
    private Paint paint1 = new Paint();
    private Paint paint2 = new Paint();
    private Paint paint3 = new Paint();
    private boolean useCenter = true;
    public ArcView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);

        paint1.setColor(Color.BLACK);
        paint1.setStrokeWidth(2);
        paint2.setColor(Color.RED);
        paint2.setStrokeWidth(4);
        paint3.setColor(Color.BLUE);
        paint3.setStrokeWidth(8);

    }


    @Override
    protected void onDraw(Canvas canvas) {

        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(360, 110, 40, paint2);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(360, 110, 30, paint2);

        RectF rectF1 = new RectF();
        rectF1.left = 30;
        rectF1.top = 190;
        rectF1.right = 120;
        rectF1.bottom = 280;

        canvas.drawArc(rectF1, 30, 100, useCenter, paint2);

        RectF rectF2 = new RectF();
        rectF2.left = 140;
        rectF2.top = 190;
        rectF2.right = 280;
        rectF2.bottom = 290;
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF2, 0, 360, useCenter, paint2);

        RectF rectF3 = new RectF();
        rectF3.left = 160;
        rectF3.top = 190;
        rectF3.right = 260;
        rectF3.bottom = 290;

        paint3.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF3, 0, 360, useCenter, paint3);

    }
}