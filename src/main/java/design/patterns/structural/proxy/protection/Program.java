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
package design.patterns.structural.proxy.protection;

import design.patterns.structural.proxy.protection.interfaced.ReportGeneratorProxy;

/**
 *
 * @author faceless
 */
public class Program {

    public static void main(String[] args) {
        Owner owner = new Owner();
        ReportGeneratorProxy reportGenerator = (ReportGeneratorProxy) new ReportGeneratorProtectionProxy(owner);
        owner.setReportGenerator(reportGenerator);
        Employee employee = new Employee();
        reportGenerator = (ReportGeneratorProxy) new ReportGeneratorProtectionProxy(employee);
        employee.setReportGenerator(reportGenerator);
        System.out.println("For owner:");
        System.out.println(owner.generateDailyReport());
        System.out.println("For employee:");
        System.out.println(employee.generateDailyReport());
    }
}
