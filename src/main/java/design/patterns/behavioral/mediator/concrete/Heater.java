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
package design.patterns.behavioral.mediator.concrete;

import design.patterns.behavioral.mediator.interfaced.MachineMediator;
import design.patterns.behavioral.mediator.interfaced.Colleague;

/**
 * The heater’s on() method switch on the heater and set the temperature as required.
 * It also checks if temperature is reached as required, it turns off() the method.
 * The checking of the temperature and switching off the heater is done through the mediator.
 * After switching off, it calls the wash() method of the Machine class through the mediator to start washing.
 * @author faceless
 */
public class Heater implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void on(int temp) {
        System.out.println("Heater is on...");
        if (mediator.checkTemperature(temp)) {
            System.out.println("Temperature is set to " + temp);
            mediator.off();
        }
    }

    public void off() {
        System.out.println("Heater is off...");
        mediator.wash();
    }
}
