package krunal.com.example.commoncomponents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mSeekbar,mToggleButton,mCheckBoxAndRadioButton,mSwitch,mImagebutton,mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetViewsById();
        OnClickListener();
    }


    private void GetViewsById(){
        mSeekbar = findViewById(R.id.seek_bar);
        mToggleButton = findViewById(R.id.Togglebutton);
        mCheckBoxAndRadioButton = findViewById(R.id.checkbox_and_radiobutton);
        mSwitch = findViewById(R.id.switch1);
        mImagebutton = findViewById(R.id.imagebutton);
        mSnackbar = findViewById(R.id.Snackbarbutton);
    }

    private void OnClickListener(){
        mSeekbar.setOnClickListener(v -> {
            Intent intent = new Intent(this,SeekbarActivity.class);
            startActivity(intent);
        });

        mToggleButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,ToggleButtonActivity.class);
            startActivity(intent);
        });

        mCheckBoxAndRadioButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,CheckBoxandRadioButtonActivity.class);
            startActivity(intent);
        });

        mSwitch.setOnClickListener(v -> {
            Intent intent = new Intent(this,SwitchActivity.class);
            startActivity(intent);
        });

        mImagebutton.setOnClickListener(v -> {
            Intent intent = new Intent(this,ImageButtonActivity.class);
            startActivity(intent);
        });

        mSnackbar.setOnClickListener(v -> {
            Intent intent = new Intent(this,SnackbarActivity.class);
            startActivity(intent);
        });


    }


}
