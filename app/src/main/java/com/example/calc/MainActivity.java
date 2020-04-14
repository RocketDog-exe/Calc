package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    String str1, str2;
    Integer str3;
    TextView text1;
    Animation anim = null;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.edit1);
        ed2 = (EditText) findViewById(R.id.edit2);
        text1 = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        anim = AnimationUtils.loadAnimation(this, R.anim.aanim);

    }

    public void click1(View view) {
        str1 = ed1.getText().toString();
        str2 = ed2.getText().toString();
        str3 = (Integer.parseInt(str1) + Integer.parseInt(str2));
        text1.setText(str3.toString());
        button1.startAnimation(anim);
    }

    public void click2(View view) {
        str1 = ed1.getText().toString();
        str2 = ed2.getText().toString();
        str3 = (Integer.parseInt(str1) - Integer.parseInt(str2));
        text1.setText(str3.toString());
    }

    public void click3(View view) {
        str1 = ed1.getText().toString();
        str2 = ed2.getText().toString();
        str3 = (Integer.parseInt(str1) * Integer.parseInt(str2));
        text1.setText(str3.toString());
    }

    public void click4(View view) {
        str1 = ed1.getText().toString();
        str2 = ed2.getText().toString();
        str3 = (Integer.parseInt(str1) / Integer.parseInt(str2));
        text1.setText(str3.toString());

    }
}