package ir.sajjadyosefi.android.themeapplication;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTranslucent extends AppCompatActivity {

    //https://stackoverflow.com/a/29311321/1821714
    //http://s3xy-dev-story.blogspot.com/2014/02/android-translucent-navigation-gain-or.html

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_translucent);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        // and add fitsSystemWindows for list in xml


    }
}
