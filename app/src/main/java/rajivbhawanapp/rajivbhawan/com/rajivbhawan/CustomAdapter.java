package rajivbhawanapp.rajivbhawan.com.rajivbhawan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by maroofPC on 23-12-2016.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    private final String[] listItems;
    private final int[] listImages;


    CustomAdapter(Context context, String[] listItems, int[] listImages ) {
        super(context, R.layout.custom_list_view, listItems);
        this.listItems = listItems;
        this.listImages = listImages;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater listInflater = LayoutInflater.from(getContext());
        View customView = listInflater.inflate(R.layout.custom_list_view, parent, false);

        TextView heading = (TextView) customView.findViewById(R.id.rowText);
        ImageView icon = (ImageView) customView.findViewById(R.id.rowImage);

        heading.setText(listItems[position]);
        icon.setImageResource(listImages[position]);

        return customView;
    }
}
