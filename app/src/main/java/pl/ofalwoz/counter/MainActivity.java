package pl.ofalwoz.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = findViewById(R.id.show_count);
    }

    public void CountUpButton(View view) {
        count++;
        if (showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }

    public void CountDownButton(View view) {
        count--;
        if (showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }

    public void ResetButton(View view) {
        count = 0;
        if (showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }
}