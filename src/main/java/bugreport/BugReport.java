/* 
 * BugReport.java 
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

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public abstract class BugReport {

    abstract public                                      String nameNonNull();
    abstract public @javax.annotation.Nullable           String nameJavaxNullable();
    abstract public @org.eclipse.jdt.annotation.Nullable String nameEclipseNullable();

    abstract public List<                                     String> emailsNonNull();
  //abstract public List<          @javax.annotation.Nullable String> emailsJavaxNullable();
    abstract public List<@org.eclipse.jdt.annotation.Nullable String> emailsEclipseNullable();

}
