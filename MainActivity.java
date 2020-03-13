package com.example.colorscroller;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar1, seekBar2, seekBar3, seekBar4;
    TextView textView1, textView2, textView3, textView4;
    Button button;
    int r = 0;
    int g = 0;
    int b = 0;
    int a = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setBackgroundColor(Color.argb(0,0,0,0));

        seekBar1 = findViewById(R.id.seekBarR);
        textView1 = findViewById(R.id.textviewR);
        seekBar1.setMax(255);

        seekBar2 = findViewById(R.id.seekBarG);
        textView2 = findViewById(R.id.textviewG);
        seekBar2.setMax(255);

        seekBar3 = findViewById(R.id.seekBarB);
        textView3 = findViewById(R.id.textviewB);
        seekBar3.setMax(255);

        seekBar4 = findViewById(R.id.seekBarA);
        textView4 = findViewById(R.id.textviewA);
        seekBar4.setMax(255);


        seekBar1.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        r = progress;
                        textView1.setText("RED = " + seekBar1.getProgress());
                        button.setBackgroundColor(Color.argb(a,r,g,b));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        seekBar2.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        g = progress;
                        textView2.setText("GREEN = " + seekBar2.getProgress());
                        button.setBackgroundColor(Color.argb(a,r,g,b));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        seekBar3.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        b = progress;
                        textView3.setText("BLUE = " + seekBar3.getProgress());
                        button.setBackgroundColor(Color.argb(a,r,g,b));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        seekBar4.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        a = progress;
                        textView4.setText("ALPHA = " + seekBar4.getProgress());
                        button.setBackgroundColor(Color.argb(a,r,g,b));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );




    }
}
