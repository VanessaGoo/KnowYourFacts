package sg.edu.rp.c346.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;


public class Frag1 extends Fragment {

    Button btn1;
    LinearLayout frag1;
    ImageView iv;

    Integer i = 0;

    public Frag1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container,false);

        btn1 = view.findViewById(R.id.btn1);
        frag1 = view.findViewById(R.id.frag1);
        iv = view.findViewById(R.id.iv);

        String imageURL = "https://wtffunfact.com/wp-content/uploads/2019/07/Fun-Animal-Fact-Singing-Seals.png";
        Picasso.with(getActivity()).load(imageURL).into(iv);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    frag1.setBackgroundColor(Color.parseColor("#D1C4E9"));
                    i = 1;
                } else {
                    frag1.setBackgroundColor(Color.parseColor("#00E4FF"));
                    i = 0;
                }
            }
        });

        return view;
     }
}
