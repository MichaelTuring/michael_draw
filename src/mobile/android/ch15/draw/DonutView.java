package mobile.android.ch15.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by michael on 14-3-13.
 */
class DonutView extends View {
    private Paint paint1 = new Paint();
    private Paint paint2 = new Paint();
    private Paint paint3 = new Paint();
    private boolean useCenter = true;
    public DonutView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);

        paint1.setColor(Color.BLACK);
        paint1.setStrokeWidth(2);
        paint2.setColor(Color.RED);
        paint2.setStrokeWidth(4);
        paint3.setColor(Color.BLUE);
        paint3.setStrokeWidth(8);

    }

    private void drawLinesExt(Canvas canvas, float[] pts, Paint paint) {

        for (int i = 0; i < pts.length; i += 2) {
            int stopXIndex = i + 2;
            int stopYIndex = i + 3;
            if (stopXIndex > pts.length - 1)
                stopXIndex = 0;
            if (stopYIndex > pts.length - 1)
                stopYIndex = 1;
            canvas.drawLine(pts[i], pts[i + 1], pts[stopXIndex],
                    pts[stopYIndex], paint);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPoint(60, 120, paint3);
        canvas.drawPoint(70, 130, paint3);
        canvas.drawPoints(new float[]
                {70, 140, 75, 145, 75, 160}, paint2);
        // canvas.drawPoints(new float[]
        // { 70, 140, 75, 145, 75, 160 }, 1,4,paint2);

        canvas.drawLine(10, 10, 300, 10, paint1);
        canvas.drawLine(10, 30, 300, 30, paint2);
        canvas.drawLine(10, 50, 300, 50, paint3);
        drawLinesExt(canvas, new float[]
                {10, 70, 120, 70, 120, 170, 10, 170}, paint2);
        drawLinesExt(canvas, new float[]
                {25, 85, 105, 85, 105, 155, 25, 155}, paint3);
        drawLinesExt(canvas, new float[]
                {160, 70, 230, 150, 170, 155}, paint2);
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(260, 110, 40, paint2);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(260, 110, 30, paint2);

        RectF rectF = new RectF();
        rectF.left = 30;
        rectF.top = 190;
        rectF.right = 120;
        rectF.bottom = 280;

        canvas.drawArc(rectF, 30, 100, useCenter, paint2);

        rectF.left = 140;
        rectF.top = 190;
        rectF.right = 280;
        rectF.bottom = 290;
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 0, 360, useCenter, paint2);

        rectF.left = 160;
        rectF.top = 190;
        rectF.right = 260;
        rectF.bottom = 290;
        paint3.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 0, 360, useCenter, paint3);

        float y = 0;

        paint1.setTextSize(22);
        //添加
        canvas.drawPoint(20,20,paint1);

    }
}