package com.comall.bdd.domain;

/**
 * Created by lgx on 17/5/4.
 */
public class Belly {

    private int cukes;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public String getSound(int waitingTime) {
        if (cukes > 41 && waitingTime >= 1) {
            return "growl";
        } else {
            return "silent";
        }
    }
}
