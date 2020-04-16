package vn.edu.hoangnguyen.nguyenvanhoang_59130826_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","Call onCreate");
        Toast.makeText(getApplicationContext(), "HELLO onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","Call onStar");
        Toast.makeText(getApplicationContext(), "HELLO onStar", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","Call onResume");
        Toast.makeText(getApplicationContext(), "HELLO onResume", Toast.LENGTH_SHORT).show();
        TextView txttime;
        txttime = findViewById(R.id.txttime);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strData = spf.format(new Date());
        txttime.setText(strData);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","Call onRestar");
        Toast.makeText(getApplicationContext(), "HELLO onRestar", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","Call onPasue");
        Toast.makeText(getApplicationContext(), "HELLO onPasue", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","Call onStop");
        Toast.makeText(getApplicationContext(), "HELLO onStop", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","Call onDestroy");
        Toast.makeText(getApplicationContext(), "HELLO onDestroy", Toast.LENGTH_SHORT).show();
    }

}
