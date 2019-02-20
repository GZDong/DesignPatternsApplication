package com.gzd.example.designpatternsapplication.observer;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class Observale extends Subject {

    @Override
    public void addObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : mObservers){
            observer.update("data has been update");
        }
    }
}
