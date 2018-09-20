package bryan.galon.galonbryanlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GalonBryanLab4 extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galon_bryan_lab4);
        Log.d("4ITE", "onCreate has been executed");

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),
                        "Button is clicked", Toast.LENGTH_LONG).show();

            }
        });

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"SNACKBAR!", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4IT-E", "onStart() IS EXECUTED");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4IT-E", "onResume() IS EXECUTED");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4IT-E", "onPause() IS EXECUTED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4IT-E", "onStop() IS EXECUTED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4IT-E", "onDestroy() IS EXECUTED");
    }

}
