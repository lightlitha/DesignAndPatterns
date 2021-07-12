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
package design.patterns.structural.facade;

/**
 *
 * @author faceless
 */
public class ScheduleServer {

    public static void startBooting() {
        System.out.println("Booting Started");
    }

    public static void readSystemConfigFile() {
        System.out.println("Reading System Configurations");
    }

    public static void init() {
        System.out.println("Initializing");
    }

    public static void initializeContext() {
        System.out.println("Initializing Context");
    }

    public static void initializeListeners() {
        System.out.println("Initializing Listeners");
    }

    public static void createSystemObjects() {
        System.out.println("Creating System Objects");
    }

    public static void releaseProcesses() {
        System.out.println("Releasing Processes");
    }

    public static void destory() {
        System.out.println("Destroying");
    }

    public static void destroySystemObjects() {
        System.out.println("Destroying System Objects");
    }

    public static void destoryListeners() {
        System.out.println("Destroying Listeners");
    }

    public static void destoryContext() {
        System.out.println("Destroying Context");
    }

    public static void shutdown() {
        System.out.println("Shutting Down");
    }

}
