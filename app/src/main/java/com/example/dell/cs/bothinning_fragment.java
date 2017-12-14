 package com.example.dell.cs;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 /**
 * Created by Dell on 12/05/2017.
 */

public class bothinning_fragment extends Dialog_fragment {

    int width, height;
    Button back,ok;
    View rootview;
EditText bt1name,bt2name,bovers;
String t1,t2,ovr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.both_fragment,container,false);
        getDialog().setTitle("Match Data");
        back=rootview.findViewById(R.id.back);
        ok=rootview.findViewById(R.id.ok);
        bt1name=rootview.findViewById(R.id.bt1name);
        bt2name=rootview.findViewById(R.id.bt2name);
        bovers=rootview.findViewById(R.id.bovers);
        setCancelable(false);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Intent intent = new Intent(getActivity(), MainActivity.class);
                //startActivity(intent);
                getDialog().cancel();
                android.support.v4.app.FragmentManager fragmentManager=getFragmentManager();
                Dialog_fragment dialogFragment=new Dialog_fragment();
                 dialogFragment.show(fragmentManager,"selectfragment");
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent intent = new Intent(getActivity(), MainActivity.class);
                  t1=bt1name.getText().toString();
                  t2=bt2name.getText().toString();
                  ovr=bovers.getText().toString();
                //  if((ovr.isEmpty())|| (t1.isEmpty()) || (t2.isEmpty()) )
                if((ovr.isEmpty()))
                {

                      Toast.makeText(getActivity(), "Enter the data", Toast.LENGTH_SHORT).show();
                  }
                  else {

                      if((ovr.startsWith("0"))&&(ovr.endsWith("0")))
                      {
                          Toast.makeText(getActivity(), "Over cant be 0", Toast.LENGTH_SHORT).show();
                      }
                      else
                          {
                         // intent.putExtra("team1", t1);
                          //intent.putExtra("team2", t2);
                              intent.putExtra("team1", "team1");
                              intent.putExtra("team1", "team2");
                          intent.putExtra("over", ovr);
                          startActivity(intent);
                          }
                  }
            }
        });
        return rootview;
    }



    @Override
    public void onResume() {
        super.onResume();
        width = getResources().getDimensionPixelSize(R.dimen.bwidth);
        height = getResources().getDimensionPixelSize(R.dimen.bheight);
        getDialog().getWindow().setLayout(width, height);
    }







}
