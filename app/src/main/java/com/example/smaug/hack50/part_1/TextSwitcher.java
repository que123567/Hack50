package com.example.smaug.hack50.part_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.smaug.hack50.R;


//hack 5Textview变换内容的平滑动画

public class TextSwitcher extends AppCompatActivity {

    android.widget.TextSwitcher mTextSwitcher;
    Button mButton;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_switcher);
        mTextSwitcher = (android.widget.TextSwitcher) findViewById(R.id.switcher);
        mButton = (Button) findViewById(R.id.btn_1);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (count % 2 == 0)
                    mTextSwitcher.setText("我");
                if (count % 3 == 0)
                    mTextSwitcher.setText("你");
                if (count % 5 == 0)
                    mTextSwitcher.setText("他");
            }
        });

        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView mTextView = new TextView(TextSwitcher.this);
                mTextView.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                mTextView.setTextSize(36);
                return mTextView;
            }
        });

        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        mTextSwitcher.setInAnimation(in);
        mTextSwitcher.setOutAnimation(out);


    }


}

