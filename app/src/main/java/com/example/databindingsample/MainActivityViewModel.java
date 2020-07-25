package com.example.databindingsample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainActivityViewModel extends AndroidViewModel {

    MutableLiveData<String> disaplayString = new MutableLiveData<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<String> getDisaplayString() {
        return disaplayString;
    }

    public void setDisaplayString(MutableLiveData<String> disaplayString) {
        this.disaplayString = disaplayString;
    }
}
