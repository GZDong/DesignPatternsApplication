package com.gzd.example.designpatternsapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gzd.example.designpatternsapplication.proxy.Client1;
import com.gzd.example.designpatternsapplication.proxy.Client2;
import com.gzd.example.designpatternsapplication.proxy.ClientProxy;
import com.gzd.example.designpatternsapplication.proxy.DynamicProxy;
import com.gzd.example.designpatternsapplication.proxy.ISubject;
import com.gzd.example.designpatternsapplication.proxy.Subject;
import com.gzd.example.designpatternsapplication.proxy.trainning.ConxObject;
import com.gzd.example.designpatternsapplication.proxy.trainning.DynamicPROXY;
import com.gzd.example.designpatternsapplication.proxy.trainning.IAction;

import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.Proxy;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class TestFragment extends Fragment {
    private TestMessage mTestMessage;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ClientProxy proxy = new ClientProxy(new Client1());
        proxy.doAction();
        proxy.finish();

        Client2 client2 =  new Client2();
        DynamicProxy proxy1 = new DynamicProxy(client2);
        ClassLoader loader = client2.getClass().getClassLoader();

        ISubject dynamicProxy = (ISubject) Proxy.newProxyInstance(loader,new Class[]{ISubject.class},proxy1 );
        dynamicProxy.doAction();
        dynamicProxy.finish();

        ConxObject object = new ConxObject();
        DynamicPROXY proxy2 = new DynamicPROXY(object);
        ClassLoader loader1 = object.getClass().getClassLoader();   //加载进内存
        IAction proxyWithIAction = (IAction) Proxy.newProxyInstance(loader1,new Class[]{IAction.class},proxy2);
        proxyWithIAction.doAction();
        proxyWithIAction.removeAction();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_test,container,false);
        Button button = view.findViewById(R.id.send_message_to_activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTestMessage = new TestMessage();
                mTestMessage.setText("message from fragment");
                EventBus.getDefault().post(mTestMessage);
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
