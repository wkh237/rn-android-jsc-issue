package com.sample;

import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.liquidplayer.webkit.javascriptcore.JSContext;

/**
 * Created by wkh237 on 2016/6/13.
 */
public class AndroidJSCModule extends ReactContextBaseJavaModule {
    ReactApplicationContext mctx;
    public AndroidJSCModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mctx = reactContext;
    }

    @Override
    public String getName() {
        return "AndroidJSC";
    }

    @ReactMethod
    public void createContext() {
        JSContext ctx = new JSContext();
        // Usually it hangs here
        Toast.makeText(mctx.getBaseContext(),"toast 1", Toast.LENGTH_LONG);
        // never reach this line
        Toast.makeText(mctx.getBaseContext(),"toast 2", Toast.LENGTH_LONG);
    }


}
