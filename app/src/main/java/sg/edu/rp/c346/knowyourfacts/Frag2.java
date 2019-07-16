package sg.edu.rp.c346.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class Frag2 extends Fragment {

    Button btn2;
    LinearLayout frag2;

    Integer i = 0;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container,false);

        btn2 = view.findViewById(R.id.btn2);
        frag2 = view.findViewById(R.id.frag2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    frag2.setBackgroundColor(Color.parseColor("#F8BBD0"));
                    i = 1;
                } else {
                    frag2.setBackgroundColor(Color.parseColor("#FFEC5E"));
                    i = 0;
                }
            }
        });

        return view;
    }

}
