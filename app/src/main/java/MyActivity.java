import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hungr.R;

public class MyActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.user_info);

        final Button button = findViewById(R.id.log_in_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                setContentView(R.layout.user_info);
            }
        });
    }
}