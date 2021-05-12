package com.example.audioequalizer;
import 	android.media.audiofx.Equalizer;
import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

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

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnReset:
                Toast.makeText(MainActivity.this, "Equalizer settings reset to 0", Toast.LENGTH_SHORT).show();
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

        editTextNumber63 = findViewById(R.id.editTextNumber63);
        editTextNumber125 = findViewById(R.id.editTextNumber125);
        editTextNumber250 = findViewById(R.id.editTextNumber250);
        editTextNumber500 = findViewById(R.id.editTextNumber500);
        editTextNumber1k = findViewById(R.id.editTextNumber1k);
        editTextNumber2k = findViewById(R.id.editTextNumber2k);
        editTextNumber4k = findViewById(R.id.editTextNumber4k);
        editTextNumber8k = findViewById(R.id.editTextNumber8k);
        editTextNumber16k = findViewById(R.id.editTextNumber16k);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnReset = findViewById(R.id.btnReset);//initialize
        btnReset.setOnClickListener(this); // used for the toast message

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