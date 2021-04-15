## Bugreport: javac build ignores eclipse @Nullable annotation

_Example project to reproduce immutables/immutables#1228_

We use the `@Nullable` annotation from `org.eclipse.jdt.annotation` like so:
```
abstract public @org.eclipse.jdt.annotation.Nullable String name();
```

or even
```
@Value.Default
@org.eclipse.jdt.annotation.Nullable
public String name() {
    return null;
}
```

We had some problem with this (which now I cannot reproduce), where this worked fine during _Eclipse_ incremental compilation, but when we triggered a Clean Build, the generated source code would ignore the annotation and include an `Objects.nonNull()` check. Doing any tiny change to the java file caused the null check to disappear.

This was quite annoying, but we quickly found a workaround, we also added the `@javax.annotation.Nullable`, and the problem went away, and so I never got around to report this.

But now we have a similar problem **without any workaround**. This time we have the annotation on the generic type of a _List_:

```
abstract public List<@org.eclipse.jdt.annotation.Nullable String> emails();
```
So we have a List, which can contain `null` values. _Immutables_ immediately warned us, that Guava Collections do not support `null`, so we switched on `jdkOnly = true`.

This works perfectly fine in _Eclipse_, but when doing a CI build using _javac_, it **ignores the annotation**, and generates a `null`-check, causing everything to fail.

Unfortunately, we cannot use the `javax.annotation.Nullable` here, as it isn't allowed in this location.

I compared the two generated files, and they look quite different. The most notable difference is of course the null check.

This is more or less a blocker for us. I guess we could try to find yet another `@Nullable` annotation, and see if that works?

---
I created an example project, which shows the problem:
[immutables-bugreport-1288](https://github.com/marc-guenther/immutables-bugreport-1288)

To reproduce:
```
mvn clean package
...
[ERROR] Tests run: 4, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.033 s <<< FAILURE! - in bugreport.BugReportTest
[ERROR] testGenericEclipseNullable(bugreport.BugReportTest)  Time elapsed: 0.005 s  <<< ERROR!
java.lang.NullPointerException: emailsEclipseNullable element
	at bugreport.BugReportTest.testGenericEclipseNullable(BugReportTest.java:66)
...
```

Where as, when you open the project in Eclipse, do a Clean Build and run the unit test, it works fine.

I have attached the generated Java files in `generated-by-Eclipse` and `generated-by-javac`.
