package com.example.databindingsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupBinding(savedInstanceState);
    }
    private void setupBinding(Bundle savedInstanceState){
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(MainActivityViewModel.class);

        if (savedInstanceState == null) {
            viewModel = new MainActivityViewModel(getApplication());
        }

        binding.setViewmodel(viewModel);
        binding.setLifecycleOwner(this);
    }
}