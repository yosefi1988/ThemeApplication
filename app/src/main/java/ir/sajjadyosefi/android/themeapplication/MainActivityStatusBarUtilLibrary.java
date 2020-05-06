package ir.sajjadyosefi.android.themeapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jaeger.library.StatusBarUtil;

public class MainActivityStatusBarUtilLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setTransparent(this);

        setContentView(R.layout.activity_main);

    }
}
