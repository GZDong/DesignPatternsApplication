package com.gzd.example.designpatternsapplication.observer;

import java.util.ArrayList;

/**
 * Created by gzd on 2019/2/21 0021
 */
public abstract class Subject {
    public Subject(){}
    protected ArrayList<Observer> mObservers = new ArrayList<>();
    public abstract void addObserver(Observer observer);
    public abstract void deleteObserver(Observer observer);
    public abstract void notifyAllObserver();
}
