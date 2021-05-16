package com.example.audioequalizer;
import 	android.media.audiofx.Equalizer;
import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.view.View;
import android.widget.Toast;
import android.widget.Switch;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextNumber63;
    private EditText editTextNumber125;
    private EditText editTextNumber250;
    private EditText editTextNumber500;
    private EditText editTextNumber1k;
    private EditText editTextNumber2k;
    private EditText editTextNumber4k;
    private EditText editTextNumber8k;
    private EditText editTextNumber16k;

    SeekBar seekBar63;
    SeekBar seekBar125;
    SeekBar seekBar250;
    SeekBar seekBar500;
    SeekBar seekBar1k;
    SeekBar seekBar2k;
    SeekBar seekBar4k;
    SeekBar seekBar8k;
    SeekBar seekBar16k;

    //test
    float start=0;
    float end=100;
    float start_pos=0;
    int start_position=0;

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnReset:
                seekBar63.setProgress(0);
                seekBar125.setProgress(0);
                seekBar250.setProgress(0);
                seekBar500.setProgress(0);
                seekBar1k.setProgress(0);
                seekBar2k.setProgress(0);
                seekBar4k.setProgress(0);
                seekBar8k.setProgress(0);
                seekBar16k.setProgress(0);
                Toast.makeText(MainActivity.this, "Equalizer settings reset to 0", Toast.LENGTH_SHORT).show();
                super.onPause();
                break;

            case R.id.editTextNumber63:


                break;
            case R.id.editTextNumber125:

                break;


            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber63 = findViewById(R.id.editTextNumber63);
        editTextNumber125 = findViewById(R.id.editTextNumber125);
        editTextNumber250 = findViewById(R.id.editTextNumber250);
        editTextNumber500 = findViewById(R.id.editTextNumber500);
        editTextNumber1k = findViewById(R.id.editTextNumber1k);
        editTextNumber2k = findViewById(R.id.editTextNumber2k);
        editTextNumber4k = findViewById(R.id.editTextNumber4k);
        editTextNumber8k = findViewById(R.id.editTextNumber8k);
        editTextNumber16k = findViewById(R.id.editTextNumber16k);
        seekBar63 = (SeekBar)findViewById(R.id.seekBar63);
        seekBar125 = (SeekBar)findViewById(R.id.seekBar125);
        seekBar250 = (SeekBar)findViewById(R.id.seekBar250);
        seekBar500 = (SeekBar)findViewById(R.id.seekBar500);
        seekBar1k = (SeekBar)findViewById(R.id.seekBar1k);
        seekBar2k = (SeekBar)findViewById(R.id.seekBar2k);
        seekBar4k = (SeekBar)findViewById(R.id.seekBar4k);
        seekBar8k = (SeekBar)findViewById(R.id.seekBar8k);
        seekBar16k = (SeekBar)findViewById(R.id.seekBar16k);
        Switch switchOnOff = (Switch)findViewById(R.id.switchOnOff);


        Button btnReset = findViewById(R.id.btnReset);//initialize
        btnReset.setOnClickListener(this); // used for the toast message

        //test
        /*
        start=-10;      //you need to give starting value of SeekBar
        end=10;         //you need to give end value of SeekBar
        start_pos=0;
        seekBar63.setProgress(start_position);
        editTextNumber63.setText(String.valueOf(start_pos));
    */
        switchOnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                if (arg1) {
                    seekBar63.setEnabled(true);
                    seekBar125.setEnabled(true);
                    seekBar250.setEnabled(true);
                    seekBar500.setEnabled(true);
                    seekBar1k.setEnabled(true);
                    seekBar2k.setEnabled(true);
                    seekBar4k.setEnabled(true);
                    seekBar8k.setEnabled(true);
                    seekBar16k.setEnabled(true);
                }
                else{
                    seekBar63.setEnabled(false);
                    seekBar125.setEnabled(false);
                    seekBar250.setEnabled(false);
                    seekBar500.setEnabled(false);
                    seekBar1k.setEnabled(false);
                    seekBar2k.setEnabled(false);
                    seekBar4k.setEnabled(false);
                    seekBar8k.setEnabled(false);
                    seekBar16k.setEnabled(false);
                    btnReset.setEnabled(false);
                }

            }
        });


        seekBar63.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber63.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar125.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber125.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        seekBar250.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber250.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        seekBar500.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber500.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar1k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber1k.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar2k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber2k.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar4k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber4k.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar8k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber8k.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar16k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTextNumber16k.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


    }

/*
    public void onResetBtnClick (View view){ //reset button on the bottom
        Button btnReset = findViewById(R.id.btnReset);//initialize
        btnReset.setOnClickListener((View.OnClickListener) this);

    }
*/

    //EditText editTextNumber63 = findViewById(R.id.editTextNumber63); //for 63 number input
    //editTextNumber63.getText().toString(); //get text of editText and converts to string


}