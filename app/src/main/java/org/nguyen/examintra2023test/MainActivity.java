package org.nguyen.examintra2023test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import org.nguyen.examintra2023test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        NumberPicker numberPicker = findViewById(R.id.numberpicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);

        int selectedNumber = numberPicker.getValue();

                binding.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("SELECTED_NUMBER", selectedNumber);
                startActivity(i);

            }
        });
    }
}