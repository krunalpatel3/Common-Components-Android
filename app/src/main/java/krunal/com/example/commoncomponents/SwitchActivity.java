package krunal.com.example.commoncomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class SwitchActivity extends AppCompatActivity {

    private Switch mSwitch;

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        mText = findViewById(R.id.textView2);

        mSwitch = findViewById(R.id.switch2);

        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mText.setText("The Switch is On");
                }else {
                    mText.setText("The Switch is Off");
                }
            }
        });
    }
}
