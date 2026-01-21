package lk.razee.practical_1.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import lk.razee.practical_1.R;

public class HomeActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        textView=findViewById(R.id.textView2);

        String email = getIntent().getStringExtra("email");

        if (!email.isEmpty()){
            textView.setText("Welcome "+email);
        }
    }
}