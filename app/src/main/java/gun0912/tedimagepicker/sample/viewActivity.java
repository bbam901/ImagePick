package gun0912.tedimagepicker.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewActivity extends AppCompatActivity {
    Button btnFileView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        btnFileView =findViewById(R.id.btnFileView);
    }
    public void clickView(View view){

        Intent intent = new Intent(this, viewalbumActivity.class);
        startActivity(intent);
    }
}