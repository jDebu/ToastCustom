package jdebu.github.io.toastcustom;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import jdebu.github.io.toastcustom.Mode2.Utils.MyViewsUtil;

public class MainActivity extends AppCompatActivity {
    AlertDialog dialog;
    static CountDownTimer timer=null;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = new Toast(this);
        TextView textView = new TextView(this);
        textView.setTextColor(Color.BLUE);
        textView.setBackgroundColor(Color.TRANSPARENT);
        textView.setTextSize(20);
        textView.setText("this display x 5 seconds");
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(textView);

        timer = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                toast.show();
            }

            @Override
            public void onFinish() {
                toast.cancel();
                MyViewsUtil.showToast(MainActivity.this,"toast modo2");

            }
        }.start();
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
            MyViewsUtil.showToast2(this,"toast2 from settings");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
