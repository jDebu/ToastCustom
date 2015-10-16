package jdebu.github.io.toastcustom.Mode2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

import jdebu.github.io.toastcustom.R;

/**
 * Created by Glup on 21/09/15.
 */
public class ToastCustom extends Toast {

    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public ToastCustom(Context context,String msg, int duration) {
        super(context);
        this.setDuration(duration);
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        try{
            View view = inflater.inflate(R.layout.toast, (ViewGroup) ((AppCompatActivity) context).findViewById(R.id.toast));
            this.setView(view);
            TextView textView = (TextView) view.findViewById(R.id.tv_message);
            textView.setText(msg);
        }catch (ClassCastException c){
            Log.e(null,c.toString());
        }




    }

}
