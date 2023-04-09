package com.ninja.mvc;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Model implements Contract.Model{

    private List<String> arrayList = Arrays.asList(
            "Core Java",
            "Android",
            "Swift/iOS",
            "Kotlin"
    );

    @Override
    public void getLanguage(OnFinishedListener onFinishedListener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onFinishedListener.onFinished(getRandomString());
            }
        },500);
    }

    private String getRandomString() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}
