package com.example.smaug.hack50.part_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.smaug.hack50.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Create By smuag 2017年4月29日09:38:05
 * 若使用代码实现，代码如下。
 *  若使用xml实现，直接在anim资源文件下创建<layoutAnimation />文件，再在其中引入另一个要实现的anim资源的id。最后在XML下，listview属性中设置
  android:layoutAnimation="@anim/layout_animation" 属性即可
 */
public class LayoutAnimationActivity extends AppCompatActivity {

    @BindView(R.id.lv_layout_anima)
    ListView mLvLayoutAnima;
    List<String> mStringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_animation);
        ButterKnife.bind(this);
        initDate();

        ArrayAdapter arrayAdaptet = new ArrayAdapter(this, R.layout.items_layout_animation,
                mStringList);
        mLvLayoutAnima.setAdapter(arrayAdaptet);

        // 代码实现
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_right);
        //得到一个LayoutAnimationController对象；
        LayoutAnimationController controller = new LayoutAnimationController(animation);
        controller.setOrder(LayoutAnimationController.ORDER_REVERSE);  //设置控件显示的顺序；
        mLvLayoutAnima.setLayoutAnimation(controller);
        mLvLayoutAnima.startLayoutAnimation();
    }

    public void initDate() {
        for (int i = 0; i < 50; i++) {
            mStringList.add("Head" + i);
        }
    }
}
