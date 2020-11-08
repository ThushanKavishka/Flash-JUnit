package org.thushan;

public class Calculater {
    private int i;
    private int j;
    CalculatorService service;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int add(int i, int j) {
        return service.add(i, j);
    }

}
