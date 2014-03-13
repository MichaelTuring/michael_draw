package mobile.android.ch15.draw;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(new CustomView(this));
    }
}
