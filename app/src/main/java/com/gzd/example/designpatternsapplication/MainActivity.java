package com.gzd.example.designpatternsapplication;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.gzd.example.designpatternsapplication.adapter.Client;
import com.gzd.example.designpatternsapplication.adapter.ForTargetInterfaceAdapter;
import com.gzd.example.designpatternsapplication.adapter.ResClass;
import com.gzd.example.designpatternsapplication.observer.Observale;
import com.gzd.example.designpatternsapplication.observer.Observer;
import com.gzd.example.designpatternsapplication.observer.RealObserver;
import com.gzd.example.designpatternsapplication.wrapper.NewWebTool;
import com.gzd.example.designpatternsapplication.wrapper.OldWebTool;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Observale observale;
    private RecyclerView mRecyclerView;
    private List<String> testData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        textView = findViewById(R.id.text_activity);

        observale = new Observale();
        observale.addObserver(new RealObserver());

        Client client = new Client();
        ForTargetInterfaceAdapter adapter = new ForTargetInterfaceAdapter(new ResClass());
        client.setAdatper(adapter);
        client.doSomething();


        testData = new ArrayList<>();
        for (int i = 0;i<5;i++){
            testData.add("test " + i);
        }
        mRecyclerView = findViewById(R.id.rv_main);
        RVAdatper adatper = new RVAdatper(testData);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setAdapter(adatper);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        OldWebTool oldWebTool = new OldWebTool();
        oldWebTool.connection();

        NewWebTool newWebTool = new NewWebTool(oldWebTool);
        newWebTool.connection();
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
