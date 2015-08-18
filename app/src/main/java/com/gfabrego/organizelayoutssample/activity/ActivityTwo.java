package com.gfabrego.organizelayoutssample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gfabrego.organizelayoutssample.R;

/**
 * Created by gfabrego on 17/08/2015.
 */
public class ActivityTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);
        findViewById(R.id.go_activity_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
                startActivity(intent);
            }
        });
    }
}
