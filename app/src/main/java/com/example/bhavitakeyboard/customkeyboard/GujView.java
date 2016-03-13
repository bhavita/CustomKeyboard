package com.example.bhavitakeyboard.customkeyboard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class GujView extends TextView {
    Context context;
    String ttfName;
    String TAG = getClass().getName();

    public GujView(Context context, AttributeSet atribSet) {
        super(context, atribSet);
        this.context = context;
        Typeface font = Typeface.createFromAsset(context.getAssets(),
                "fonts/Saumil_guj2.ttf");
        setTypeface(font);
    }

    public void setTypeface(Typeface tf) {
        super.setTypeface(tf);
    }

}