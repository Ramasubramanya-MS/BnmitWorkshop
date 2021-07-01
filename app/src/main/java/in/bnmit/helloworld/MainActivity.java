package in.bnmit.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Activity1 Main : onCreate Called");

        initViews();

    }
    private void initViews() {

        Button btn = findViewById(R.id.btn1);
        Button btnUrl = findViewById(R.id.btn_url);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Explicit Intent
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("msg","hello welcome");
                i.putExtra("msg1","hi");
                i.putExtra("msg2","hello world");

                startActivity(i);
               // finish();

            }
        });
        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Implicit Intent
                String url = "https://www.bnmit.org/";
                Intent urlIntent = new Intent(Intent.ACTION_VIEW);
                urlIntent.setData(Uri.parse(url));
                startActivity(urlIntent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("Activity1 Main : onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity1 Main : onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("Activity1 Main : onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity1 Main : onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity1 Main : onDestroy Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("Activity1 Main : onRestart Called");
    }
}