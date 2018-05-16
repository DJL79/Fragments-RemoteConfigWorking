package uk.co.apptouch.imagetextremoteapps;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    View myView;
    String fragString;


    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fragment_two, container, false);

        TextView txtViewOne = myView.findViewById(R.id.txtViewFragTwo);
        Bundle b2 = getArguments();
        fragString = b2.getString("remoteconfigdata");
        txtViewOne.setText(fragString);

        return myView;


    }
}
