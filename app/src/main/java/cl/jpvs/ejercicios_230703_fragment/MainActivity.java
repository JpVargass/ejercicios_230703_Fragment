package cl.jpvs.ejercicios_230703_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.jpvs.ejercicios_230703_fragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}