package rajivbhawanapp.rajivbhawan.com.rajivbhawan;

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

public class ElectricityComplaint extends Activity implements AdapterView.OnItemSelectedListener {

    String type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.electricity_complaint);

        final ElectricityComplaint this_here = this;

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"Tube-Light", "Fan", "Switch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        final EditText text = (EditText) findViewById(R.id.eleceditText);


        Button button = (Button) findViewById(R.id.elecSubmitbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String complain = text.getText().toString();
                Log.i("Maroof", "elec button pressed");
                Intent intent = new Intent(this_here,SubmitWorker.class);
                intent.putExtra("complain_type","electricity");
                intent.putExtra("complain",complain);
                intent.putExtra("type",type);
                Log.i("Maroof",type);
                Log.i("Maroof", "Worker to be called");
                startActivity(intent);

            }
        });

        dropdown.setOnItemSelectedListener(this);

    }


    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {

        type = parent.getItemAtPosition(pos).toString();
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


    /**
     * Attempt to call the API, after verifying that all the preconditions are
     * satisfied. The preconditions are: Google Play Services installed, an
     * account was selected and the device currently has online access. If any
     * of the preconditions are not satisfied, the app will prompt the user as
     * appropriate.
     */

}






