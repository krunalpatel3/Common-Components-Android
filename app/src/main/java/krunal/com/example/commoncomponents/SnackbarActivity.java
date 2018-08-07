package krunal.com.example.commoncomponents;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SnackbarActivity extends AppCompatActivity {

    private Button mBtnSimple,mBthActionCallBack,mBtnCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        ConstraintLayout constraintLayout = findViewById(R.id.ConstraintLayout);

        mBtnSimple = findViewById(R.id.buttonSimpleSnackbar);
        mBthActionCallBack = findViewById(R.id.buttonActionCallback);
        mBtnCustomView = findViewById(R.id.buttonCustomView);

        mBtnSimple.setOnClickListener(v -> {
            Snackbar.make(constraintLayout,"Simple SnackBar",Snackbar.LENGTH_LONG).show();
        });

        mBthActionCallBack.setOnClickListener(v -> {
            Snackbar.make(constraintLayout,"Message is deleted",Snackbar.LENGTH_LONG)
                    .setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Snackbar.make(constraintLayout,"Message is Restored!",Snackbar.LENGTH_LONG).show();
                        }
                    })
                    .show();
        });

        mBtnCustomView.setOnClickListener(v -> {
            Snackbar snackbar = Snackbar
                    .make(constraintLayout, "No internet connection!", Snackbar.LENGTH_LONG)
                    .setAction("RETRY", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });

            // Changing message text color
            snackbar.setActionTextColor(Color.RED);

            // Changing action button text color
            View getSnackbarView = snackbar.getView();
            TextView textView = getSnackbarView.findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextColor(Color.YELLOW);

            snackbar.show();
        });
    }
}
