package krunal.com.example.commoncomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    private ToggleButton mToggleButton;

    private TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        mToggleButton = findViewById(R.id.toggleButton);


        mTextview = findViewById(R.id.textView3);

        mToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean Check = mToggleButton.isChecked();
                if (Check){
                    mTextview.setText("Toggle Button is On");
                }else {
                    mTextview.setText("Toggle Button is Off");
                }

            }
        });

    }
}
