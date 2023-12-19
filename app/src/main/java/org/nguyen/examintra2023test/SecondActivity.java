package org.nguyen.examintra2023test;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import org.nguyen.examintra2023test.databinding.ActivityMainBinding;
import org.nguyen.examintra2023test.databinding.ActivitySecondactivityBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        binding = ActivitySecondactivityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        int selectedNumber = getIntent().getIntExtra("SELECTED_NUMBER", 0);
        binding.number.setText("J'ai " + selectedNumber + "$");

    }
}
