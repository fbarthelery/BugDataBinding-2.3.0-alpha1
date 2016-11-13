package com.geekorum.databindingbug;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;
import com.geekorum.databindingbug.databinding.ActivityMainBinding;

/**
 * Created by darisk on 11/12/16.
 */

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandler(new Handler());
    }

    public class Handler {
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Hello world", Toast.LENGTH_SHORT).show();
        }
    }
}

