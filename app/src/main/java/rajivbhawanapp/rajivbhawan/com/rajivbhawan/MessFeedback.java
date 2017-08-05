package rajivbhawanapp.rajivbhawan.com.rajivbhawan;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessFeedback extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carpenter_complaint);

        final MessFeedback this_here = this;

        final EditText text = (EditText) findViewById(R.id.carpeditText);

        Button button = (Button) findViewById(R.id.carpSubmitbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String complain = text.getText().toString();
                Log.i("Maroof", "mess button pressed");
                Intent intent = new Intent(this_here,SubmitWorker.class);
                intent.putExtra("complain_type","mess");
                intent.putExtra("complain",complain);
                Log.i("Maroof", "Worker to be called");
                startActivity(intent);

            }
        });


    }


}




