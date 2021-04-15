/* 
 * BugReportTest.java 
 * created by mgu on 14 Apr 2021
 * 
 * Copyright (C) iAS interActive Systems
 * Gesellschaft fuer interaktive Medien mbH
 * Glogauer Str. 19
 * 10999 Berlin
 * Germany
 * http://www.interActive-Systems.de
 */

package bugreport;

import org.junit.Test;


public class BugReportTest {

    @Test
    public void testAllGood() {
        BugReport x = ImmutableBugReport.builder()
                .nameNonNull("Marc")
                .nameJavaxNullable("Marc")
                .nameEclipseNullable("Marc")
                .addEmailsNonNull("marc@example.com")
                .addEmailsEclipseNullable("marc@example.com")
                .build();
        System.out.println("testAllGood:" + x);
    }

    // this works in Eclipse and javac
    @Test
    public void testParameterJavaxNullable() {
        BugReport x = ImmutableBugReport.builder()
                .nameNonNull("Marc")
                .nameJavaxNullable(null)
                .nameEclipseNullable("Marc")
                .addEmailsNonNull("marc@example.com")
                .addEmailsEclipseNullable("marc@example.com")
                .build();
        System.out.println("testParameterJavaxNullable:" + x);
    }

    // this works in Eclipse and javac
    @Test
    public void testParameterEclipseNullable() {
        BugReport x = ImmutableBugReport.builder()
                .nameNonNull("Marc")
                .nameJavaxNullable("Marc")
                .nameEclipseNullable(null)
                .addEmailsNonNull("marc@example.com")
                .addEmailsEclipseNullable("marc@example.com")
                .build();
        System.out.println("testParameterEclipseNullable:" + x);
    }

    // this works in Eclipse, but not in javac
    @Test
    public void testGenericEclipseNullable() {
        BugReport x = ImmutableBugReport.builder()
                .nameNonNull("Marc")
                .nameJavaxNullable("Marc")
                .nameEclipseNullable("Marc")
                .addEmailsNonNull("marc@example.com")
                .addEmailsEclipseNullable((String)null)
                .build();
        System.out.println("testGenericEclipseNullable:" + x);
    }

}
