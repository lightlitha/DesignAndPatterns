/*
 * The MIT License
 *
 * Copyright 2021 faceless.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package design.patterns.structural.bridge;

import design.patterns.structural.bridge.abstraction.*;
import design.patterns.structural.bridge.implementor.*;

/**
 *
 * @author faceless
 */
public class Program {

    public static void main(String[] args) {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheel(product, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        car = new BigWheel(product2, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        car = new Motoren(product2, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }

}
