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
package design.patterns.structural.proxy.virtual;

import java.util.List;
import design.patterns.structural.proxy.virtual.interfaced.ContactList;

/**
 * ContactListProxyImpl is the proxy class which also implements ContactList and
 * holds a reference to the real ContactList object. On the implementation of
 * the method getEmployeeList() it will check if the contactList reference is
 * null, then it will create a real ContactList object and then will invoke the
 * getEmployeeList() method on it to get the list of the employees
 *
 * @author faceless
 */
public class ContactListProxyImpl implements ContactList {

    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if (contactList == null) {
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}
