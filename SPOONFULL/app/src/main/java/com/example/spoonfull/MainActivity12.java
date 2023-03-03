package com.example.spoonfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {

    SeekBar seekBar;
    TextView seekBarText, result;
    Button seekBarDoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBarText = (TextView) findViewById(R.id.seekBarText);
        seekBarDoneBtn = (Button) findViewById(R.id.seekBarDone);
        result = (TextView) findViewById(R.id.feedBackResult);

        seekBarDoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,MainActivity13.class);
                startActivity(intent);
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                seekBarText.setText(""+seekBar.getProgress()+"%");
                seekBarText.setVisibility(View.VISIBLE);

                result.setVisibility(View.VISIBLE);

                if(seekBar.getProgress()<=30){
                    seekBarText.setTextColor(Color.RED);
                    result.setTextColor(Color.RED);
                    result.setText("BAD");
                }else if(seekBar.getProgress()<=50){
                    seekBarText.setTextColor(Color.BLACK);
                    result.setTextColor(Color.BLACK);
                    result.setText("GOOD");
                }else if(seekBar.getProgress()<75){
                    seekBarText.setTextColor(Color.DKGRAY);
                    result.setTextColor(Color.DKGRAY);
                    result.setText("BETTER");
                }else{
                    seekBarText.setTextColor(Color.BLUE);
                    result.setTextColor(Color.BLUE);
                    result.setText("BEST");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {



            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {



            }
        });


    }
}