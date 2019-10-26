package com.mashibing.visitor;

public interface ComputerPart {
    abstract void accept(Visitor visitor);
    abstract double getPrice();
}
