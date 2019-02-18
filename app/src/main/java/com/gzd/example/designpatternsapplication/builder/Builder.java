package com.gzd.example.designpatternsapplication.builder;

/**
 * Created by gzd on 2019/2/19 0019
 */
public abstract class Builder {
    public abstract Builder buildBoard(String board);
    public abstract Builder buildDisplay(String display);
    public abstract Builder buildOS(String os);
    public abstract Computer create();
}
