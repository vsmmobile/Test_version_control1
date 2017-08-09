package or.th.vsmart.test_version_control;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  bb= (Button) findViewById(R.id.button);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"xxxx",Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),"xxxx",Toast.LENGTH_LONG).show();
            }
        });
    }
}
