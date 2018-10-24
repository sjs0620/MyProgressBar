package com.sjs.edu.myprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
// Toggle버튼을 누르면 ProgressBar가 on/off 며 상태가 텍스트뷰에 나타난다

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ProgressBar progressBar01;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        progressBar01 = (ProgressBar)findViewById(R.id.progressBar01);
        textView = (TextView)findViewById(R.id.textView);

        progressBar01.setVisibility(View.INVISIBLE);    //progressBar가 초기엔 보이지 않게

    }

    public void onclickwidget(View view){
        String text = toggleButton.getText().toString() + " - " + toggleButton.isChecked();
        if(toggleButton.isChecked()){
            progressBar01.setVisibility(View.VISIBLE);
        }
        else{
            progressBar01.setVisibility(View.GONE);
        }
//        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
        textView.setText(text);
    }
}
