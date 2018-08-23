package com.stanislav.patterns.creational.prototype;

public class TshirtFactory {
    Tshirt tshirt;

    public TshirtFactory(Tshirt tshirt) {
        this.tshirt = tshirt;
    }

    public void setTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
    }

    Tshirt cloneTshirt(){
        return (Tshirt) tshirt.copy();
    }
}
