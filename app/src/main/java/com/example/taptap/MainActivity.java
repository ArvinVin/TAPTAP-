package com.example.taptap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countertxt;
    private Button tap;
    private Button reset;
    private int countint;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.countBTN :
                    tap();
                    break;
                case R.id.resetBTN :
                    reset();
                    break;
            }


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countertxt = (TextView) findViewById(R.id.countTV);
        tap = (Button) findViewById(R.id.countBTN);
        tap.setOnClickListener(clickListener);
        reset = (Button) findViewById(R.id.resetBTN);
        reset.setOnClickListener(clickListener);

        startcount();
    }

    private void startcount()
    {
        countint =0;
        countertxt.setText("" + String.valueOf(countint));

    }

    private void tap()
    {
        countint++;
        countertxt.setText("" + String.valueOf(countint));
    }

    private void reset()
    {
        countint=0;
        countertxt.setText("" + String.valueOf(countint));
    }
}
