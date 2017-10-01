package com.example.shengsheng.activitytest;

import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.util.Log;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*Toast.makeText(FirstActivity.this,"you click button1",Toast.LENGTH_SHORT).
            show();*/
            String data="hello SecondActivity";
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
                //intent.putExtra("extra_data",data);
             /*Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http:www.baidu.com"));*/
                startActivity(intent);
        }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        switch (requestCode)
        {
            case 1:if(resultCode==RESULT_OK)
            {
                String returnData=data.getStringExtra("data_return");
                //Log.d("FirstActivity",returnedData);
            }
            break;
            default:
        }
    }

}
