package jdebu.github.io.toastcustom.Mode2.Utils;

import android.content.Context;
import android.widget.Toast;

import jdebu.github.io.toastcustom.Mode2.ToastCustom;
import jdebu.github.io.toastcustom.Mode2.ToastCustom2;

/**
 * Created by Glup on 21/09/15.
 */
public class MyViewsUtil {
    public static void showToast(Context activityContext, String message) {
        ToastCustom toast = new ToastCustom(activityContext, message, Toast.LENGTH_LONG);
        toast.show();
    }
    public static void showToast2(Context activityContext, String message) {
        ToastCustom2 toast = new ToastCustom2(activityContext, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
