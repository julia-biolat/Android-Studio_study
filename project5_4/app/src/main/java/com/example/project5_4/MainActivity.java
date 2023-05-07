package com.example.project5_4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        EditText edit = new EditText(this);
        edit.setHint("입력하세요");
        baseLayout.addView(edit);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.rgb(255, 255,0));
        baseLayout.addView(btn);

        TextView tes = new TextView(this);
        tes.setTextColor(Color.MAGENTA);
        baseLayout.addView(tes);
        tes.setTextSize(20);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                String sentence;
                sentence = edit.getText().toString();
                tes.setText(sentence);
            }
        });
    }
}