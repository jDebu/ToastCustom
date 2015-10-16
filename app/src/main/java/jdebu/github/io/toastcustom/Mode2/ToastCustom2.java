package jdebu.github.io.toastcustom.Mode2;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import jdebu.github.io.toastcustom.R;

/**
 * Created by Glup on 21/09/15.
 */
public class ToastCustom2  extends Toast{
    public ToastCustom2(Context context,String msg, int duration) {
        super(context);
        this.setDuration(duration);
        TextView textView = new TextView(context);
        textView.setTextColor(context.getResources().getColor(R.color.toast_text2));
        textView.setBackgroundColor(Color.TRANSPARENT);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(18);
        textView.setText(msg);
        this.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        this.setView(textView);

    }
}
