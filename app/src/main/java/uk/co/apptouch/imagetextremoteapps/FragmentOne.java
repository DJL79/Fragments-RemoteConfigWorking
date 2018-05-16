package uk.co.apptouch.imagetextremoteapps;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    View myView;
    String fragString;


    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fragment_one, container, false);

        TextView txtViewOne = myView.findViewById(R.id.txtViewFragOne);
        Bundle b1 = getArguments();
        fragString = b1.getString("remoteconfigdata");
        txtViewOne.setText(fragString);

        return myView;


    }

}
