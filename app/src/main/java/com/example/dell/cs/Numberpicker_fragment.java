package com.example.dell.cs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

/**
 * Created by Dell on 12/08/2017.
 */

public class Numberpicker_fragment extends Dialog_fragment {
View rootview;
NumberPicker np;
int width,height,no;
Button ok;

    MainActivity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.numberpicker,container,false);
        np=rootview.findViewById(R.id.numberPicker);
        ok=rootview.findViewById(R.id.ok);


        getDialog().setTitle("Extras ");

        activity= (MainActivity) getActivity();

        if((activity.wd==1)||(activity.nb==1)) {
            np.setMinValue(0);
            Log.d("values",""+activity.wd+""+activity.nb+""+activity.lb+""+activity.b+""+activity.pen);
        }

        else if((activity.lb==1)||(activity.b==1)||(activity.pen==1))
        {
            np.setMinValue(1);
            Log.d("values1",""+activity.wd+""+activity.nb+""+activity.lb+""+activity.b+""+activity.pen);
        }
           np.setMaxValue(15);
    np.setWrapSelectorWheel(true);






    ok.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(), "selected no="+no, Toast.LENGTH_SHORT).show();

            activity.addr=activity.addr+no;
            //Log.d("nb",""+activity.addr);

            getDialog().cancel();
            if(activity instanceof MainActivity) {

                if(activity.nb==1) {
                    activity.nb=-1;
                    activity.noballaddruns(no);

                }


                else if(activity.wd==1)
                {
                    activity.wd=-1;
                    activity.wideaddruns(no);


                }
                else if(activity.b==1)
                {

                    activity.b=-1;
                    activity.byeaddruns(no);


                }

                else if(activity.lb==1)
                {

                    activity.lb=-1;
                    activity.addlegbyeruns(no);
                }

               else if(activity.pen==1)
                {

                    activity.pen=-1;
                    activity.addpenruns(no);
                }




            }
            else
            {
                Toast.makeText(getActivity(), "ERROR!!!!", Toast.LENGTH_SHORT).show();
            }

        }
    });


    np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int i1) {
            no=i1;
            Toast.makeText(getActivity(), "il="+i1, Toast.LENGTH_SHORT).show();


        }
    });

    no=np.getValue();
        return rootview;

    }


    @Override
    public void onResume() {
        super.onResume();
        width=getResources().getDimensionPixelSize(R.dimen.npwidth);
        height=getResources().getDimensionPixelOffset(R.dimen.npheight);
        getDialog().getWindow().setLayout(width,height);
    }
}
