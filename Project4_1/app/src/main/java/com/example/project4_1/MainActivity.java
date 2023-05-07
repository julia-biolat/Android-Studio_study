package com.example.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");

        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);

        btnAdd = findViewById(R.id.BtnAdd);
        btnSub = findViewById(R.id.BtnSub);
        btnMul = findViewById(R.id.BtnMul);
        btnDiv = findViewById(R.id.BtnDiv);
        btnRem = findViewById(R.id.BtnRemainder);

        textResult = findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1)
                            + Double.parseDouble(num2);

                    textResult.setText("계산 결과 : "
                            + result.toString());
                }
                return false;
            }
        });
        btnSub.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1)
                            - Double.parseDouble(num2);

                    textResult.setText("계산 결과 : "
                            + result.toString());
                }
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1)
                            * Double.parseDouble(num2);

                    textResult.setText("계산 결과 : "
                            + result.toString());
                }
                return false;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(),
                                "0으로 나눌 수 없습니다",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1)
                                / Double.parseDouble(num2);

                        result = (int) (result * 10) / 10.0;

                        textResult.setText("계산 결과 : "
                                + result.toString(result));
                    }
                }
                return false;
            }
        });

        btnRem.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(),
                                "0으로 나눌 수 없습니다",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1) % Double.parseDouble(num2);

                        textResult.setText("계산 결과 : "
                                + result.toString());
                    }
                }
                return false;
            }
        });
    }
}