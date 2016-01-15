package com.atran.tipcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calculateTip(View view) {
        TextView tv = (TextView) findViewById(R.id.editText);
        TextView tv2 = (TextView) findViewById(R.id.editText2);
        double total = Double.parseDouble(tv.getText().toString());
        double percentage = Double.parseDouble(tv2.getText().toString())/100;

        TextView tip = (TextView) findViewById(R.id.textView4);
        double result = (double)Math.round(total*percentage * 100) / 100;
        tip.setText("$" + String.valueOf(result));
    }

    public void resetTip(View view) {
        TextView tv = (TextView) findViewById(R.id.editText);
        TextView tv2 = (TextView) findViewById(R.id.editText2);
        TextView tip = (TextView) findViewById(R.id.textView4);

        tv.setText("");
        tv2.setText("");
        tip.setText("$0.00");
    }
}
