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
package design.patterns.structural.proxy.remote;

import design.patterns.structural.proxy.remote.interfaced.ReportGenerator;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * This class is a remote implementation which does the real work. It’s the
 * object that the client wants to call methods on. The class extends
 * UnicastRemoteObject, in order to work as a remote service object, your object
 * needs some functionality related to being remote. The simplest way is to
 * extend UnicastRemoteObject from the java.rmi.server package and let that
 * class do the work for you. The UnicastRemoteObject class constructor throws a
 * RemoteException, so you need to write a no-arg constructor that declares a
 * RemoteException. To make the remote service available to the clients you need
 * to register the service with the RMI registry. You do this by instantiating
 * it and putting it into the RMI registry. When you register the implementation
 * object, the RMI system actually puts the stub in the registry, since that’s
 * what a client needs. The Naming.rebind method is used to register the object.
 * It has two parameters, first a string to name the service and the other
 * parameter takes object which will be fetched by the clients to use the
 * service Now, to create the stub you need to run rmic on the remote
 * implementation class. The rmic tool comes with the Java software development
 * kid, takes a service implementation and creates a new stub. You should open
 * your command prompt (cmd) and run rmic from the directory where your remote
 * implementation is located. The next step is to run the rmiregistry, bring up
 * a terminal and start the registry, just type the command rmiregistry. But be
 * sure you start it from a directory that has access to your classes. The final
 * step is to start the service that is, run your concrete implementation of
 * remote class, in this case the class is ReportG eneratorImpl.
 *
 * @author faceless
 */
public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {

    private static final long serialVersionUID = 3107413009881629428L;

    protected ReportGeneratorImpl() throws RemoteException {
    }

    @Override
    public String generateDailyReport() throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("********************Location X Daily Report********************");
        sb.append("\\n Location ID: 012");
        sb.append("\\n Today’s Date: " + new Date());
        sb.append("\\n Total Pizza’s Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Net Profit: $1985");
        sb.append("\\n ***************************************************************");
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            ReportGenerator reportGenerator = new ReportGeneratorImpl();
            Naming.rebind("PizzaCoRemoteGenerator", reportGenerator);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
