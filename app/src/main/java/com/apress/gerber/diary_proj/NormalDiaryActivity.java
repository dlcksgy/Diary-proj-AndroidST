package com.apress.gerber.diary_proj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Arduino on 2017-05-30.
 */

public class NormalDiaryActivity extends AppCompatActivity {
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_normal_diary);

        final EditText diaryEditText = (EditText) findViewById(R.id.diaryEditText);
        Button saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String txt = diaryEditText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), NormalDiaryViewActivity.class);
                intent.putExtra("normalDiaryView", txt);
                startActivity(intent);



            }
        });
    }
}
