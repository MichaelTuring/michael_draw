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
class MichaelChartView extends View {

    private Paint paint = new Paint();
    private boolean useCenter = false;

    static private int sum;

    static private RectF _drawRectF;
    static private int _drawGap;

    static private int[] _itemWeights;
    static private int[] _itemColors;
    static private int[] _itemStokes;
    static private int[] _itemOffset;

    public MichaelChartView(Context context, RectF drawRectF, int drawGap,
                            int[] itemWeights, int[] itemColors, int[] itemStokes, int[] itemOffset) {
        super(context);


        sum=itemWeights.length;
        _drawRectF=drawRectF;
        _drawGap=drawGap;
        _itemWeights=itemWeights;
        _itemColors=itemColors;
        _itemStokes=itemStokes;
        _itemOffset=itemOffset;


        setBackgroundColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        float startArc[] = new float[sum];
        float sweepArc[]=  new float[sum];




        for(int i=0;i<sum;i++)
        {
            paint.setColor(_itemColors[i]);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(_itemStokes[i]);

            RectF _newRectF=new RectF();
            _newRectF.left=_drawRectF.left-_itemOffset[i];
            _newRectF.top= _drawRectF.top-_itemOffset[i];
            _newRectF.right=_drawRectF.right+_itemOffset[i];
            _newRectF.bottom=_drawRectF.bottom+_itemOffset[i];


            canvas.drawArc(_newRectF,startArc[i],sweepArc[i],useCenter,paint);


        }

    }
}