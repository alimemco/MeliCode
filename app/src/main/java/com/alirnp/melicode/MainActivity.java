package com.alirnp.melicode;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView generateTextView , validateTextView , aboutMeTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setFont();

    }

    private void setFont() {
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/IRANSansMobile.ttf");
        generateTextView.setTypeface(typeface);
        validateTextView.setTypeface(typeface);
        aboutMeTextView.setTypeface(typeface);
    }

    private void initViews() {
        generateTextView = findViewById(R.id.activity_main_textView_generate);
        validateTextView = findViewById(R.id.activity_main_textView_validate);
        aboutMeTextView = findViewById(R.id.activity_main_textView_aboutMe);
    }

}
