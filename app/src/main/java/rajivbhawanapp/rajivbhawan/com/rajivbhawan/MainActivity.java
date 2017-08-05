package rajivbhawanapp.rajivbhawan.com.rajivbhawan;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    ListView list;
    String[] listItems = {
            "Electricity Complaint","Carpenter Complaint","Mess Complaint","Other Complaint","Important Contacts","Visit Bhawan's website"
    };

    int[] listImages = {
            R.drawable.electricity,R.drawable.carpenter,R.drawable.mess,R.drawable.otherc,R.drawable.impcontact,R.drawable.web
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final MainActivity this_here = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this, listItems, listImages);
        list = (ListView)findViewById(R.id.mainListView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, item , Toast.LENGTH_LONG).show();
                Log.i("Maroof", item);

                Intent intent;
                switch(position) {
                    case 0:
                        Log.i("Maroof", "electricity complaint called");
                        intent = new Intent(this_here, ElectricityComplaint.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(this_here, CarpenterComplaint.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(this_here, MessFeedback.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(this_here, OtherComplaint.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(this_here, ImportantContacts.class);
                        startActivity(intent);
                        break;
                }



                }
            });
        }
    }


