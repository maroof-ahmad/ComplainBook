package rajivbhawanapp.rajivbhawan.com.rajivbhawan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signin extends Activity {

    EditText name;
    EditText mobileNo;
    EditText roomNo;
    Button submit;

    final Signin this_here  = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        name = (EditText) findViewById(R.id.editName);
        mobileNo = (EditText) findViewById(R.id.editMob);
        roomNo = (EditText) findViewById(R.id.editRoom);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedpref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpref.edit();

                editor.putString("userName", name.getText().toString());
                editor.putString("mobNo", mobileNo.getText().toString());
                editor.putString("roomNo", roomNo.getText().toString());
                editor.apply();


                Toast.makeText(Signin.this, "Signed In" , Toast.LENGTH_LONG).show();
                final Intent intent  = new Intent(this_here, MainActivity.class);
                startActivity(intent);

            }
        });

    }

}
