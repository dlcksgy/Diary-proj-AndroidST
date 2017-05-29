package com.apress.gerber.diary_proj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Arduino on 2017-05-30.
 */

public class NormalDiaryViewActivity extends AppCompatActivity{
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_normal_diary_view);
        TextView normalDiaryView = (TextView) findViewById(R.id.normalDiaryView);
        Intent intent = getIntent();
        normalDiaryView.setText(intent.getStringExtra("normalDiaryView").toString());
    }

}
