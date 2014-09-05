package com.example.tracikamp.test_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {

    private Button clickButton;
    private TextView onlyText;
    private EditText edits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        clickButton = (Button) findViewById(R.id.button);
        onlyText = (TextView) findViewById(R.id.onlyText);
        edits = (EditText) findViewById(R.id.editable1);



        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void buttonDoThis(View view) {
        onlyText.setText("It works!");
        setTitle("It worked!");
        String uName = String.valueOf(edits.getText());
        String youDid = "You did it " + uName + "!";
        Toast.makeText(MyActivity.this, youDid,Toast.LENGTH_LONG).show();
    }
}
