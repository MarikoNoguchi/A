/*
Get Intent object from MainActivity class.
Set text on TextView.
Mariko Noguchi
8/24/2016
 */


package edu.mnstate.cw3967me.a;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent myIntent = getIntent();
        String name = myIntent.getStringExtra("name");
        System.out.println(name);
        tvName = (TextView)findViewById(R.id.tvName);

        tvName.setText(" "+name+" ");
    }
}
