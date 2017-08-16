package com.example.mert.toastmesaj;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benimekranim);

        Button btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"bu bir uyarı mesajıdır.",Toast.LENGTH_SHORT).show();


            }
        });

        Button btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView uyari = new ImageView(getApplicationContext());
                uyari.setImageResource(R.mipmap.uyari);
                Toast uyarim = new Toast(getApplicationContext());
                uyarim.setView(uyari);
                uyarim.setDuration(Toast.LENGTH_SHORT);
                uyarim.show();
            }
        });

        Button btn3 = (Button)findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = new TextView(getApplicationContext());
                textview.setText("bu bir özelleştirilmiş uyarı mesajıdır");
                textview.setBackgroundColor(Color.parseColor("#6200ea"));
                textview.setTextColor(Color.YELLOW);

                Toast uyarim2 = new Toast(getApplicationContext());
                uyarim2.setView(textview);
                uyarim2.setDuration(Toast.LENGTH_SHORT);
                uyarim2.show();
            }
        });

    }
}
