package rajivbhawanapp.rajivbhawan.com.rajivbhawan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);


        final FlashActivity this_here = this;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedpref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
                final String name = sharedpref.getString("userName","none");

                if(name == "none"){
                    Log.i("Maroof", name);
                    final Intent intent  = new Intent(this_here, Signin.class);
                    startActivity(intent);
                } else {
                    Log.i("Maroof", "reached here");
                    final Intent intent  = new Intent(this_here, MainActivity.class);
                    startActivity(intent);
                }
            }
        }, 2000);
    }
}
