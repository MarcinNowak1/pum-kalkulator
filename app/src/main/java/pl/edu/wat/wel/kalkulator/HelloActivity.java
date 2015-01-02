package pl.edu.wat.wel.kalkulator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HelloActivity extends ActionBarActivity {

    private static final String TAG = "HelloActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello, menu);
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

    public void dodaj(View view) {
        String a = ((EditText) findViewById(R.id.editTextA)).getText().toString();
        String b = ((EditText) findViewById(R.id.editTextB)).getText().toString();
        int c = Integer.valueOf(a) + Integer.valueOf(b);
        Log.d(TAG, "a = " + a + ", b = " + b + ", c = " + c);
        ((TextView) findViewById(R.id.wynik)).setText(String.valueOf(c));
    }

    public void odejmij(View view) {
        String a = ((EditText) findViewById(R.id.editTextA)).getText().toString();
        String b = ((EditText) findViewById(R.id.editTextB)).getText().toString();
        int c = Integer.valueOf(a) - Integer.valueOf(b);
        Log.d(TAG, "a = " + a + ", b = " + b + ", c = " + c);
        ((TextView) findViewById(R.id.wynik)).setText(String.valueOf(c));
    }
}
