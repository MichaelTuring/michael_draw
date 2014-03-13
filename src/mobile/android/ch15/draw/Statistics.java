package mobile.android.ch15.draw;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Statistics extends Activity{
    private LinearLayout  lineChart_container;
    private LinearLayout  donutChart_container;
    private LinearLayout  barChart_container;
    private LinearLayout  pieChart_container;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statsitics);

        lineChart_container= (LinearLayout) findViewById(R.id.lineChart_container);
        CustomView customView=new CustomView(this);
        lineChart_container.addView(customView);

        donutChart_container= (LinearLayout) findViewById(R.id.donutChart_container);
        DonutView donutView=new DonutView(this);
        donutChart_container.addView(donutView);

        barChart_container= (LinearLayout) findViewById(R.id.barChart_container);
        ArcView arcView=new ArcView(this);
        barChart_container.addView(arcView);

    }
}
