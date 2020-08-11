package com.example.asuper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.jackandphantom.blurimage.BlurImage;

public class MainActivity extends AppCompatActivity {

    ImageView iv_background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_background = (ImageView)findViewById(R.id.backgorund_Image);
        /*Button mDriver = (Button) findViewById(R.id.driver);*/
        Button mCustomer = (Button) findViewById(R.id.customer);

        BlurImage.with(getApplicationContext()).load(R.drawable.toll_plaza).intensity(4).Async(true).into(iv_background);

        startService(new Intent(MainActivity.this, onAppKilled.class));
        /*(mDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });*/

        mCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomerLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
