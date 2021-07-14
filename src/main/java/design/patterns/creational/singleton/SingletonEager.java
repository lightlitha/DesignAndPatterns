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
package design.patterns.creational.singleton;

/**
 *
 * @author faceless
 */
public class SingletonEager {

    // we provide a global variable that makes an object accessible
    public static SingletonEager sc = new SingletonEager();

    /*
     * As we know, there is only one copy of the static variables of a class,
     * we can apply this. As far as, the client code is using this sc static variable its fine. 
     * But, if the client uses a new operator there would be a new instance of this class.
     * To stop the class to get instantiated outside the class, let’s make the constructor of the class as private.
     */
    private SingletonEager() {
    }

    /*
     * By keeping the constructor private, no other class can instantiate this class.
     * The only way to get the object of this class is using the sc static variable which ensures only one object is there.
     * But as we know, providing a direct access to a class member is not a good idea.
     * We will provide a method through which the sc variable will get access, not directly.
     */
    public static SingletonEager getInstance() {
        return sc;
    }
}
