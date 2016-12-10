/*
When SUBMIT button was clicked, submit_onClick method will be executed.
Put name string on the Intent Object.
And then, move on to Activity2 class.
Mariko Noguchi
8/24/2016
 */

package edu.mnstate.cw3967me.a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.etName);
    }

    public void submit_onClick(View v){
        Intent myIntent = new Intent(this,Activity2.class);
        Editable name = etName.getText();
        String strName = name.toString();
        myIntent.putExtra("name",strName);
        startActivity(myIntent);
    }
}
