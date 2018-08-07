package krunal.com.example.commoncomponents;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CheckBoxandRadioButtonActivity extends AppCompatActivity {

    private CheckBox mCheckIce,mCheckCake,mCheckCookies;

    private RadioGroup mGroupRadio;

    private RadioButton mRadioButton;

    private Button mBtnCheck,mBtnRadio;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxand_radio_button);

        mBtnRadio = findViewById(R.id.Radiobtn);

        mBtnCheck = findViewById(R.id.Checkbtn);


        mCheckCake = findViewById(R.id.checkBox);
        mCheckIce = findViewById(R.id.checkBox2);
        mCheckCookies = findViewById(R.id.checkBox3);

        mGroupRadio = findViewById(R.id.radioGroup2);


        mBtnCheck.setOnClickListener(v -> {
            StringBuffer result = new StringBuffer();
            if(mCheckCake.isChecked()){
                result.append("Thanks : ").append("Cake");
            }
             if(mCheckIce.isChecked()){
                result.append("\nThanks: ").append("Ice cream cake");
            }

            if (mCheckCookies.isChecked()){
                result.append("\nThanks: ").append("Cookies");
            }

            Toast.makeText(CheckBoxandRadioButtonActivity.this, result.toString(),
                    Toast.LENGTH_LONG).show();
        });

        mBtnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = mGroupRadio.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                mRadioButton = findViewById(selectedId);

                Toast.makeText(CheckBoxandRadioButtonActivity.this,
                        mRadioButton.getText(), Toast.LENGTH_SHORT).show();

            }
        });



    }
}
