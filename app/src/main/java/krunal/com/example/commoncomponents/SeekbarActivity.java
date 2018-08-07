package krunal.com.example.commoncomponents;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;



public class SeekbarActivity extends AppCompatActivity {

    private SeekBar mSeekbar,mseekbar2;

    private TextView mDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        mDisplay = findViewById(R.id.textView);
        mSeekbar = findViewById(R.id.seekBar);
        // Setting seekbar to 100.
        mSeekbar.setMax(100);
        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mDisplay.setText(progressValue + "/"+ mSeekbar.getMax());
            }
        });





    }
}
