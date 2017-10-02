package com.example.shengsheng.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Log.d("ThirdActivity","Task id is"+getTaskId());
        setContentView(R.layout.third_layout);
        Button button3=(Button)findViewById(R.id.button_3);
        button3.OnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ActivityCollector.finishall();

            }
        });

    }
}
