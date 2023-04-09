package com.ninja.mvc;

import static android.view.View.GONE;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Contract.View {

    // creating object of TextView class
    private TextView textView;

    // creating object of Button class
    private Button button;

    // creating object of Presenter interface in Contract
    Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        // instantiating object of Presenter Interface
        presenter = new Presenter(this, new Model());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.showLanguageOnButtonClick();
            }
        });
    }


    @Override
    public void setString(String string) {
        textView.setText(string);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}