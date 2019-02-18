package com.gzd.example.designpatternsapplication.builder;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class IOSBuilder extends Builder {
    private IOSComputer mIOSComputer = new IOSComputer();
    @Override
    public Builder buildBoard(String board) {
        mIOSComputer.setBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mIOSComputer.setDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS(String os) {
        mIOSComputer.setOS(os);
        return this;
    }

    @Override
    public Computer create() {
        return mIOSComputer;
    }
}
