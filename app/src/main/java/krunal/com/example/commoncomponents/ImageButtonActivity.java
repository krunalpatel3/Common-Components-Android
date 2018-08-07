package krunal.com.example.commoncomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity {

    private ImageButton mImagebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        mImagebtn = findViewById(R.id.imageButton);

        mImagebtn.setOnClickListener(v ->
                Toast.makeText(getApplicationContext(),"Image Button Click",Toast.LENGTH_LONG).show());
    }
}
