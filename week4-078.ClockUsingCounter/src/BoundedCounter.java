/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author playgrnd
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        value = 0;
        this.upperLimit = upperLimit;

    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public void setValue(int value) {
        if (value > 0 && value <= this.upperLimit) {
            this.value = value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }

}
