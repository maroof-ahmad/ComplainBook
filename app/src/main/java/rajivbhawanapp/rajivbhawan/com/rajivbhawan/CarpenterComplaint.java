package rajivbhawanapp.rajivbhawan.com.rajivbhawan;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CarpenterComplaint extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Maroof","carpenter complaint working correctly");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carpenter_complaint);

        final CarpenterComplaint this_here = this;

        final EditText text = (EditText) findViewById(R.id.carpeditText);

        Button button = (Button) findViewById(R.id.carpSubmitbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String complain = text.getText().toString();
                Log.i("Maroof", "carp button pressed");
                Intent intent = new Intent(this_here,SubmitWorker.class);
                intent.putExtra("complain_type","carpenter");
                intent.putExtra("complain",complain);
                Log.i("Maroof", "Worker to be called");
                startActivity(intent);

            }
        });


    }


}







