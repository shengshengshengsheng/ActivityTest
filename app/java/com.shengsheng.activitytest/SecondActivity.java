package com.example.shengsheng.activitytest;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(SecondActivity.this,FirstActivity.class);
                //intent.putExtra("data_return","Hello FirstActivity");
                //setResult(RESULT_OK,intent);
                //finish();
                startActivity(intent);
            }

        });

        /*Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);*/
    }
}
