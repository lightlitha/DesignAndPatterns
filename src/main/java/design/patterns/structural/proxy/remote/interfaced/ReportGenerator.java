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
package design.patterns.structural.proxy.remote.interfaced;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * We have an interface ReportGenerator and its concrete implementation
 * ReportGeneratorImpl already running at JVMs of different locations. First to
 * create a remote service we need to change the codes
 * This is a remote interface which defines the methods that a client can call remotely. 
 * It’s what the client will use as the class type for your service.
 * Both the Stub and actual service will implement this.
 * The method in the interface returns a String object. You can return any object from the method;
 * this object is going to be shipped over the wire from the server back to the client,
 * so it must be Serializable.
 * Please note that all the methods in this interface should throw RemoteException
 *
 * @author faceless
 */
public interface ReportGenerator extends Remote {

    public String generateDailyReport() throws RemoteException;
}
