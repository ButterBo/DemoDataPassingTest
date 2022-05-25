package sg.edu.rp.c346.id21044912.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvDouAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tvDouAns = findViewById(R.id.textView3);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0);
        tvDouAns.setText("Double value received is: " + value);
    }
}