package com.example.smaug.hack50.part_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smaug.hack50.R;

/**
 * 包含hack10/12/13/16等小hack
 */
public class TextviewActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        mTextView = (TextView) findViewById(R.id.tv_part3);

        //        String text = "Visit <a href=\"https://www.baidu.com/\"> Manning home page</a>";
        //        mTextView.setText(Html.fromHtml(text));
        //        mTextView.setMovementMethod(LinkMovementMethod.getInstance()); //文本超链接显示


        //        Spannable sTextSpan = new SpannableString("Hello World, MainActivity!");
        //        sTextSpan.setSpan(new BackgroundColorSpan(getResources().getColor(R.color.red))
        // , 1, 4, 0);
        //        mTextView.setText(sTextSpan);// 文本颜色

        Toast toast = Toast.makeText(this, "北京天安门", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
        toast.show();

    }
}
