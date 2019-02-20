package com.gzd.example.designpatternsapplication;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.gzd.example.designpatternsapplication.observer.Observale;
import com.gzd.example.designpatternsapplication.observer.Observer;
import com.gzd.example.designpatternsapplication.observer.RealObserver;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Observale observale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        textView = findViewById(R.id.text_activity);

        observale = new Observale();
        observale.addObserver(new RealObserver());
    }
    @Subscribe
    public void onEventMainThread(TestMessage testMessage){
        textView.setText(testMessage.getText());
        observale.notifyAllObserver();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
