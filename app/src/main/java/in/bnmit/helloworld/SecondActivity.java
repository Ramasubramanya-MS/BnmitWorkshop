package in.bnmit.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        System.out.println("Activity1 2nd : onCreate Called");

        String msg = getIntent().getStringExtra("msg");
        String msg1 = getIntent().getStringExtra("msg1");
        String msg2 = getIntent().getStringExtra("msg2");

        System.out.println("msgg : "+msg+" "+msg1+" "+msg2);

    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("Activity1 2nd : onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity1 2nd : onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("Activity1 2nd : onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity1 2nd : onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity1 2nd : onDestroy Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("Activity1 2nd : onRestart Called");
    }
}