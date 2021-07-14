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

import java.util.ArrayList;
import java.util.List;
import design.patterns.structural.proxy.virtual.interfaced.ContactList;

/**
 * Class will create a real ContactList object which will return the list of
 * employees of the company. The object will be loaded on demand, only when
 * required
 *
 * @author faceless
 */
public class ContactListImpl implements ContactList {

    @Override
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }

    private static List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<Employee>(5);
        empList.add(new Employee("Employee A", 2565.55, "SE"));
        empList.add(new Employee("Employee B", 22574, "Manager"));
        empList.add(new Employee("Employee C", 3256.77, "SSE"));
        empList.add(new Employee("Employee D", 4875.54, "SSE"));
        empList.add(new Employee("Employee E", 2847.01, "SE"));
        return empList;
    }
}
