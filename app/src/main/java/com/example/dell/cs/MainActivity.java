package com.example.dell.cs;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView teamb1, teamb2, maxoversb, score1b, wicket1b, over1b, ballsb, runrate1b, overtext, dottext;
    int addr = 0, wkt = 0, ball = 0, completedover = 0, flag = -1, nb = -1, wd = -1, lb = -1, b = -1, pen = -1, counter = 0, i = -1, extravar;
    float rr;
    String textperover[] = new String[30];
    String deleteelement;

    Float runsforrunrate;
    Float oversforrunrate;
    android.support.v4.app.FragmentManager fragmentManager;


    String t1, t2, ovr, temp, runs, wickets, combineballsovers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamb1 = findViewById(R.id.team_1);
        maxoversb = findViewById(R.id.maxovers);
        score1b = findViewById(R.id.score1);
        wicket1b = findViewById(R.id.wicket1);
        over1b = findViewById(R.id.over1);
        ballsb = findViewById(R.id.balls);
        runrate1b = findViewById(R.id.runrate1);
        dottext = findViewById(R.id.dottext);
        overtext = findViewById(R.id.overtext);


        t1 = getIntent().getExtras().getString("team1");
        t2 = getIntent().getExtras().getString("team2");
        ovr = getIntent().getExtras().getString("over");
        score1b.setText("0");
        wicket1b.setText("0");
        over1b.setText("0");
        overtext.setText("");
        ballsb.setText("");
        runrate1b.setText("0");
        teamb1.setText(t1);

        ballsb.setText("0");
        maxoversb.setText("/" + ovr);


    }


    public void zero(View view) {


        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ++ball;
            runs = score1b.getText().toString();
            runsforrunrate = Float.valueOf(runs);
            counter = ball;
            i++;
            textperover[i] = "0";

            ballsb.setText("" + ball);
            over1b.setText("" + completedover);


            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }
            endover();
            runratecalculator();

        }


    }

    public void one(View view) {

        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ++ball;
            runs = score1b.getText().toString();
            addr = Integer.parseInt(runs);
            ++addr;
            counter = ball;
            i++;
            textperover[i] = "1";
            ballsb.setText("" + ball);
            score1b.setText("" + addr);

            runsforrunrate = Float.valueOf(addr);

          /*  if (ball == 6) {
                completedover++;
                ball = 0;

                over1b.setText("" + completedover);

                ballsb.setText("" + ball);
              endover();
            }*/
            over1b.setText("" + completedover);
            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }

            endover();
          /*  combineballsovers=completedover+"."+ballsb.getText().toString();
            oversforrunrate=Float.valueOf(combineballsovers);
            rr=runsforrunrate/oversforrunrate;
            Log.d("float",""+oversforrunrate);
            Log.d("runs",""+runsforrunrate);
            runrate1b.setText(""+String.format("%.02f", rr));*/
            runratecalculator();

        }


    }

    public void two(View view) {
        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ++ball;
            runs = score1b.getText().toString();
            addr = Integer.parseInt(runs);
            addr = addr + 2;
            runsforrunrate = Float.valueOf(addr);
            i++;
            textperover[i] = "2";
            ballsb.setText("" + ball);
            counter = ball;
            score1b.setText("" + addr);

          /*  if (ball == 6) {
                completedover++;
                ball = 0;

                over1b.setText("" + completedover);

                ballsb.setText("" + ball);
               endover();

            }
            */
            over1b.setText("" + completedover);
            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }


            endover();
            combineballsovers = completedover + "." + ballsb.getText().toString();

      /*      oversforrunrate=Float.valueOf(combineballsovers);
            Log.d("float",""+oversforrunrate);
            Log.d("runs",""+runsforrunrate);
            rr=runsforrunrate/oversforrunrate;
            runrate1b.setText(""+String.format("%.02f", rr));*/
            runratecalculator();

        }


    }

    public void three(View view) {
        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ++ball;
            runs = score1b.getText().toString();
            addr = Integer.parseInt(runs);
            addr = addr + 3;
            runsforrunrate = Float.valueOf(addr);
            i++;
            textperover[i] = "3";
            ballsb.setText("" + ball);
            score1b.setText("" + addr);
            counter = ball;
         /*   if (ball == 6) {
                completedover++;
                ball = 0;

                over1b.setText("" + completedover);

                ballsb.setText("" + ball);
             endover();

            }*/
            over1b.setText("" + completedover);

            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }
            endover();

       /*     combineballsovers=completedover+"."+ballsb.getText().toString();
            oversforrunrate=Float.valueOf(combineballsovers);
            Log.d("float",""+oversforrunrate);
            Log.d("runs",""+runsforrunrate);
            rr=runsforrunrate/oversforrunrate;
            runrate1b.setText(""+String.format("%.02f", rr));
*/
            runratecalculator();
        }


    }

    public void four(View view) {

        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ++ball;
            runs = score1b.getText().toString();
            addr = Integer.parseInt(runs);
            addr = addr + 4;
            runsforrunrate = Float.valueOf(addr);
            i++;
            textperover[i] = "4";
            ballsb.setText("" + ball);
            score1b.setText("" + addr);
            counter = ball;

         /*   if (ball == 6) {
                completedover++;
                ball = 0;

                over1b.setText("" + completedover);

                ballsb.setText("" + ball);
               //endover();

            }*/
            over1b.setText("" + completedover);


            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }


            endover();

        /*
            combineballsovers=completedover+"."+ballsb.getText().toString();
            oversforrunrate=Float.valueOf(combineballsovers);
            Log.d("float",""+oversforrunrate);
            Log.d("runs",""+runsforrunrate);
            rr=runsforrunrate/oversforrunrate;
            runrate1b.setText(""+String.format("%.02f", rr));
            */
            runratecalculator();
        }


    }

    public void five(View view) {

        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ++ball;
            runs = score1b.getText().toString();
            addr = Integer.parseInt(runs);
            addr = addr + 5;
            runsforrunrate = Float.valueOf(addr);
            i++;
            textperover[i] = "5";
            ballsb.setText("" + ball);
            score1b.setText("" + addr);
            counter = ball;
           /* if (ball == 6) {
                completedover++;
                ball = 0;

                over1b.setText("" + completedover);

                ballsb.setText("" + ball);
              endover();

            }*/
            over1b.setText("" + completedover);
            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }

            endover();
           /* combineballsovers=completedover+"."+ballsb.getText().toString();
            oversforrunrate=Float.valueOf(combineballsovers);
            Log.d("float",""+oversforrunrate);
            Log.d("runs",""+runsforrunrate);
            rr=runsforrunrate/oversforrunrate;
            runrate1b.setText(""+String.format("%.02f", rr));*/
            runratecalculator();
        }


    }

    public void six(View view) {
        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ball++;

            runs = score1b.getText().toString();
            addr = Integer.parseInt(runs);
            addr = addr + 6;
            runsforrunrate = Float.valueOf(addr);
            i++;
            textperover[i] = "6";
            ballsb.setText("" + ball);
            score1b.setText("" + addr);
            counter = ball;
          /*  if (ball == 6) {
                completedover++;
                ball = 0;

                over1b.setText("" + completedover);

                ballsb.setText("" + ball);
         endover();

            }*/

            over1b.setText("" + completedover);

            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }


            endover();

         /*   combineballsovers=completedover+"."+ballsb.getText().toString();
            oversforrunrate=Float.valueOf(combineballsovers);
            Log.d("float",""+oversforrunrate);
            Log.d("runs",""+runsforrunrate);
            rr=runsforrunrate/oversforrunrate;
            runrate1b.setText(""+String.format("%.02f", rr));
            */
            runratecalculator();

        }


    }

    public void wide(View view) {
        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            wd = 1;
            Numberpicker_fragment numberpicker_fragment = new Numberpicker_fragment();
            fragmentManager = getSupportFragmentManager();

            numberpicker_fragment.show(fragmentManager, "extrasfragment");
        }

    }

    public void noball(View view) {

        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            nb = 1;
            Numberpicker_fragment numberpicker_fragment = new Numberpicker_fragment();
            fragmentManager = getSupportFragmentManager();

            numberpicker_fragment.show(fragmentManager, "extrasfragment");


        }


    }

    public void bye(View view) {
        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            b = 1;
            Numberpicker_fragment numberpicker_fragment = new Numberpicker_fragment();
            fragmentManager = getSupportFragmentManager();

            numberpicker_fragment.show(fragmentManager, "extrasfragment");
        }

    }

    public void legbye(View view) {

        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {

            lb = 1;
            Numberpicker_fragment numberpicker_fragment = new Numberpicker_fragment();
            fragmentManager = getSupportFragmentManager();

            numberpicker_fragment.show(fragmentManager, "extrasfragment");
        }


    }


    public void penalty(View view) {
        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {
            pen = 1;
            Numberpicker_fragment numberpicker_fragment = new Numberpicker_fragment();
            fragmentManager = getSupportFragmentManager();

            numberpicker_fragment.show(fragmentManager, "extrasfragment");
        }

    }


    public void wicket(View view) {
        if ((completedover == Integer.parseInt(ovr)) || (Integer.parseInt(wicket1b.getText().toString()) == 10)) {

            Toast.makeText(this, "all overs completed", Toast.LENGTH_SHORT).show();
        } else {


            temp = String.valueOf(ballsb.getText());
            ball = Integer.parseInt((temp));
            ++ball;
            i++;
            textperover[i] = "W";
            wickets = wicket1b.getText().toString();
            wkt = Integer.parseInt(wickets);
            ++wkt;
            runsforrunrate = Float.valueOf(addr);
            counter = ball;

            if (wkt == 10) {
                Toast.makeText(this, "All out", Toast.LENGTH_SHORT).show();
                wicket1b.setText("" + wkt);

              /*  if (ball == 6) {
                    completedover++;
                    ball = 0;

                    over1b.setText("" + completedover);

                    ballsb.setText("" + ball);


                }*/

            } else if (wkt < 10) {
                wicket1b.setText("" + wkt);
                ballsb.setText("" + ball);

                /*if (ball == 6) {
                    completedover++;
                    ball = 0;

                    over1b.setText("" + completedover);

                    ballsb.setText("" + ball);

                }*/

            }
            over1b.setText("" + completedover);


            if (overtext.getText().toString().isEmpty()) {


                overtext.setText(" " + textperover[i]);

            } else {
                overtext.setText("" + overtext.getText().toString() + "," + textperover[i]);
            }
            endover();
         /*   combineballsovers=completedover+"."+ballsb.getText().toString();
            oversforrunrate=Float.valueOf(combineballsovers);
            rr=runsforrunrate/oversforrunrate;
            Log.d("float",""+oversforrunrate);
            Log.d("runs",""+runsforrunrate);
            runrate1b.setText(""+String.format("%.02f", rr));*/
            runratecalculator();
        }


    }

    public void undo(View view) {


        if (i >= 0) {
            deleteelement = textperover[i];
            --i;

            overtext.setText("");
            for (int j = 0; j <= i; j++) {

                if (overtext.getText().toString().isEmpty()) {


                    overtext.setText(" " + textperover[j]);

                } else {
                    overtext.setText("" + overtext.getText().toString() + "," + textperover[j]);
                }

            }


            if (deleteelement.equals("0")) {
                --ball;
                ballsb.setText("" + ball);
                runratecalculator();

            } else if (deleteelement.equals("1")) {
                --ball;
                addr = addr - 1;
                ballsb.setText("" + ball);
                score1b.setText("" + addr);
                runratecalculator();


            } else if (deleteelement.equals("2"))

            {
                --ball;
                addr = addr - 2;
                ballsb.setText("" + ball);
                score1b.setText("" + addr);
                runratecalculator();


            } else if (deleteelement.equals("3")) {
                --ball;
                addr = addr - 3;
                ballsb.setText("" + ball);
                score1b.setText("" + addr);
                runratecalculator();


            } else if (deleteelement.equals("4")) {
                --ball;
                addr = addr - 4;
                ballsb.setText("" + ball);
                score1b.setText("" + addr);
                runratecalculator();


            } else if (deleteelement.equals("5")) {
                --ball;
                addr = addr - 5;
                ballsb.setText("" + ball);
                score1b.setText("" + addr);
                runratecalculator();


            } else if (deleteelement.equals("6")) {
                --ball;
                addr = addr - 6;
                ballsb.setText("" + ball);
                score1b.setText("" + addr);
                runratecalculator();


            } else if (deleteelement.equals("W")) {
                --ball;
                ballsb.setText("" + ball);
                wkt--;
                wicket1b.setText("" + wkt);
                runratecalculator();


            } else if ((deleteelement.endsWith("WD")) || ((deleteelement.endsWith("NB")))) {

                Toast.makeText(this, "hey from extras", Toast.LENGTH_SHORT).show();
                if (deleteelement.startsWith("0")) {
                    addr = addr - 1;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if ((deleteelement.equals("1WD"))||(deleteelement.equals("1NB"))) {
                    addr = addr - 2;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.equals("2")) {
                    addr = addr - 3;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("3")) {
                    addr = addr - 4;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("4")) {
                    addr = addr - 5;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("5")) {
                    addr = addr - 6;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("6")) {
                    addr = addr - 7;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("7")) {
                    addr = addr - 8;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("8")) {
                    addr = addr - 9;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("9")) {
                    addr = addr - 10;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("10")) {
                    addr = addr - 11;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("11")) {
                    addr = addr - 12;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("12")) {
                    addr = addr - 13;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("13")) {
                    addr = addr - 14;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("14")) {
                    addr = addr - 15;
                    score1b.setText("" + addr);
                    runratecalculator();

                } else if (deleteelement.startsWith("15")) {
                    Toast.makeText(this, "15", Toast.LENGTH_SHORT).show();
                    addr = addr - 16;
                    score1b.setText("" + addr);
                    runratecalculator();

                }


            }

            else if ((deleteelement.endsWith("LB")) || ((deleteelement.endsWith("B"))) || (deleteelement.endsWith("P"))) {

                Toast.makeText(this, "hey from lbbp", Toast.LENGTH_SHORT).show();


              if (deleteelement.equals("1LB") ||(deleteelement.equals("1B")) ||(deleteelement.equals("1P"))) {
                    --ball;
                    addr = addr - 1;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();
                }
                else if (deleteelement.startsWith("2")) {
                    --ball;
                    addr = addr - 2;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }

                else if (deleteelement.startsWith("3")) {
                    --ball;
                    addr = addr - 3;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();
                }
                else if (deleteelement.startsWith("4")) {
                    --ball;
                    addr = addr - 4;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();
                }
                else if (deleteelement.startsWith("5")) {
                    --ball;
                    addr = addr - 5;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();
                }
                else if (deleteelement.startsWith("6")) {
                    --ball;
                    addr = addr - 6;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }

                else if (deleteelement.startsWith("7")) {
                    --ball;
                    addr = addr - 7;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }
                else if (deleteelement.startsWith("8")) {
                    --ball;
                    addr = addr - 8;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }
                else if (deleteelement.startsWith("9")) {
                    --ball;
                    addr = addr - 9;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }
                else if (deleteelement.startsWith("10")) {
                    --ball;
                    addr = addr - 10;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }
                else if (deleteelement.startsWith("11")) {
                    --ball;
                    addr = addr - 11;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }
                else if (deleteelement.startsWith("12")) {
                    --ball;
                    addr = addr - 12;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }
                else if (deleteelement.startsWith("13")) {
                    --ball;
                    addr = addr - 13;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();
                }
                else if (deleteelement.startsWith("14")) {
                    --ball;
                    addr = addr - 14;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();
                    ;

                }
                else if (deleteelement.startsWith("15")) {
                    --ball;
                    addr = addr - 15;
                    ballsb.setText("" + ball);
                    score1b.setText("" + addr);
                    runratecalculator();

                }

            }
        }


    }




    public void stats(View view)
    {



    }


    public void noballaddruns(int no)
    {

        ++addr;
        temp = String.valueOf(ballsb.getText());
        ball = Integer.parseInt((temp));
        i++;


        textperover[i]= ""+no+"NB";
        Log.d("tempchar",""+textperover[i]);
        score1b.setText(""+addr);
        runs=score1b.getText().toString();
        runsforrunrate=Float.valueOf(runs);
        ballsb.setText("" + ball);

        if (overtext.getText().toString().isEmpty()) {


            overtext.setText(" " + textperover[i]);

        }
        else {
            overtext.setText(""+overtext.getText().toString()+ "," +textperover[i]);
        }

     /*   combineballsovers=completedover+"."+ballsb.getText().toString();
        oversforrunrate=Float.valueOf(combineballsovers);
        Log.d("float",""+oversforrunrate);
        Log.d("runs",""+runsforrunrate);
        rr=runsforrunrate/oversforrunrate;
        runrate1b.setText(""+String.format("%.02f", rr));*/
     runratecalculator();


        Toast.makeText(this, "main activity", Toast.LENGTH_SHORT).show();
    }

    public void wideaddruns(int no)
    {


        ++addr;
        temp = String.valueOf(ballsb.getText());
        ball = Integer.parseInt((temp));
        i++;

textperover[i]=""+no+"WD";
        Log.d("tempchar",""+textperover[i]);
        score1b.setText(""+addr);
        runs=score1b.getText().toString();
        runsforrunrate=Float.valueOf(runs);
        ballsb.setText("" + ball);
        if (overtext.getText().toString().isEmpty()) {


            overtext.setText(" " + textperover[i]);

        }
        else {
            overtext.setText(""+overtext.getText().toString()+ "," +textperover[i]);
        }
      /*  combineballsovers=completedover+"."+ballsb.getText().toString();
        oversforrunrate=Float.valueOf(combineballsovers);
        Log.d("float",""+oversforrunrate);
        Log.d("runs",""+runsforrunrate);
        rr=runsforrunrate/oversforrunrate;
        runrate1b.setText(""+String.format("%.02f", rr));*/
runratecalculator();


    }

    public void byeaddruns(int no)
    {



        temp = String.valueOf(ballsb.getText());
        ball = Integer.parseInt((temp));
        ++ball;
        i++;

        textperover[i]=""+no+"B";;
        Log.d("tempchar",""+textperover[i]);
        score1b.setText(""+addr);
        runs=score1b.getText().toString();
        runsforrunrate=Float.valueOf(runs);
        ballsb.setText("" + ball);
        counter=ball;

    /*    if (ball == 6) {
            completedover++;
            ball = 0;

            over1b.setText("" + completedover);

            ballsb.setText("" + ball);
       endover();

        }*/


        if (overtext.getText().toString().isEmpty()) {


            overtext.setText(" " + textperover[i]);

        }
        else {
            overtext.setText(""+overtext.getText().toString()+ "," +textperover[i]);
        }

        endover();
     /*   combineballsovers=completedover+"."+ballsb.getText().toString();
        oversforrunrate=Float.valueOf(combineballsovers);
        Log.d("float",""+oversforrunrate);
        Log.d("runs",""+runsforrunrate);
        rr=runsforrunrate/oversforrunrate;
        runrate1b.setText(""+String.format("%.02f", rr));*/

runratecalculator();

    }



    public void addlegbyeruns(int no)
    {

        temp = String.valueOf(ballsb.getText());
        ball = Integer.parseInt((temp));
        ++ball;
        i++;

        textperover[i]=""+no+"LB";
        Log.d("tempchar",""+textperover[i]);
        score1b.setText(""+addr);
        runs=score1b.getText().toString();
        runsforrunrate=Float.valueOf(runs);
        ballsb.setText("" + ball);

        counter=ball;
    /*    if (ball == 6) {
            completedover++;
            ball = 0;

            over1b.setText("" + completedover);

            ballsb.setText("" + ball);


        }*/


        if (overtext.getText().toString().isEmpty()) {


            overtext.setText(" " + textperover[i]);

        }
        else {
            overtext.setText(""+overtext.getText().toString()+ "," +textperover[i]);
        }
        endover();
       /* combineballsovers=completedover+"."+ballsb.getText().toString();
        oversforrunrate=Float.valueOf(combineballsovers);
        Log.d("float",""+oversforrunrate);
        Log.d("runs",""+runsforrunrate);
        rr=runsforrunrate/oversforrunrate;
        runrate1b.setText(""+String.format("%.02f", rr));*/

runratecalculator();

    }

    public void addpenruns(int no)
    {

        temp = String.valueOf(ballsb.getText());
        ball = Integer.parseInt((temp));
        ++ball;
        i++;
        textperover[i]=""+no+"P";

        Log.d("tempchar",""+textperover[i]);
        score1b.setText(""+addr);
        runs=score1b.getText().toString();
        runsforrunrate=Float.valueOf(runs);
        ballsb.setText("" + ball);
        counter=ball;

   /*     if (ball == 6) {
            completedover++;
            ball = 0;

            over1b.setText("" + completedover);

            ballsb.setText("" + ball);


        }*/


        if (overtext.getText().toString().isEmpty()) {


            overtext.setText(" " + textperover[i]);

        }
        else {
            overtext.setText(""+overtext.getText().toString()+ "," +textperover[i]);
        }
        endover();
      /*  combineballsovers=completedover+"."+ballsb.getText().toString();
        oversforrunrate=Float.valueOf(combineballsovers);
        Log.d("float",""+oversforrunrate);
        Log.d("runs",""+runsforrunrate);
        rr=runsforrunrate/oversforrunrate;
        runrate1b.setText(""+String.format("%.02f", rr));*/
 runratecalculator();



    }


    public void endover()
    {
        if (ball == 6) {
            completedover++;
            ball = 0;

            over1b.setText("" + completedover);

            ballsb.setText("" + ball);
            overtext.setText("");
            i=-1;

        }

    }




    public void runratecalculator()
    {

        runs=score1b.getText().toString();
        runsforrunrate=Float.valueOf(runs);
        combineballsovers=completedover+"."+ballsb.getText().toString();
        oversforrunrate=Float.valueOf(combineballsovers);
        Log.d("float",""+oversforrunrate);
        Log.d("runs",""+runsforrunrate);
        rr=runsforrunrate/oversforrunrate;
        runrate1b.setText(""+String.format("%.02f", rr));

    }

}
