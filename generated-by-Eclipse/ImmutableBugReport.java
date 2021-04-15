package bugreport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link BugReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBugReport.builder()}.
 */
@Generated(from = "BugReport", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableBugReport extends BugReport {
  private final String nameNonNull;
  private final @Nullable String nameJavaxNullable;
  private final java.lang.@org.eclipse.jdt.annotation.Nullable String nameEclipseNullable;
  private final List<String> emailsNonNull;
  private final List<String> emailsEclipseNullable;

  private ImmutableBugReport(
      String nameNonNull,
      @Nullable String nameJavaxNullable,
      java.lang.@org.eclipse.jdt.annotation.Nullable String nameEclipseNullable,
      List<String> emailsNonNull,
      List<String> emailsEclipseNullable) {
    this.nameNonNull = nameNonNull;
    this.nameJavaxNullable = nameJavaxNullable;
    this.nameEclipseNullable = nameEclipseNullable;
    this.emailsNonNull = emailsNonNull;
    this.emailsEclipseNullable = emailsEclipseNullable;
  }

  /**
   * @return The value of the {@code nameNonNull} attribute
   */
  @Override
  public String nameNonNull() {
    return nameNonNull;
  }

  /**
   * @return The value of the {@code nameJavaxNullable} attribute
   */
  @Override
  public @Nullable String nameJavaxNullable() {
    return nameJavaxNullable;
  }

  /**
   * @return The value of the {@code nameEclipseNullable} attribute
   */
  @Override
  public java.lang.@org.eclipse.jdt.annotation.Nullable String nameEclipseNullable() {
    return nameEclipseNullable;
  }

  /**
   * @return The value of the {@code emailsNonNull} attribute
   */
  @Override
  public List<String> emailsNonNull() {
    return emailsNonNull;
  }

  /**
   * @return The value of the {@code emailsEclipseNullable} attribute
   */
  @Override
  public List<String> emailsEclipseNullable() {
    return emailsEclipseNullable;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BugReport#nameNonNull() nameNonNull} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nameNonNull
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBugReport withNameNonNull(String value) {
    String newValue = Objects.requireNonNull(value, "nameNonNull");
    if (this.nameNonNull.equals(newValue)) return this;
    return new ImmutableBugReport(
        newValue,
        this.nameJavaxNullable,
        this.nameEclipseNullable,
        this.emailsNonNull,
        this.emailsEclipseNullable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BugReport#nameJavaxNullable() nameJavaxNullable} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nameJavaxNullable (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBugReport withNameJavaxNullable(@Nullable String value) {
    if (Objects.equals(this.nameJavaxNullable, value)) return this;
    return new ImmutableBugReport(
        this.nameNonNull,
        value,
        this.nameEclipseNullable,
        this.emailsNonNull,
        this.emailsEclipseNullable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BugReport#nameEclipseNullable() nameEclipseNullable} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nameEclipseNullable (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBugReport withNameEclipseNullable(java.lang.@org.eclipse.jdt.annotation.Nullable String value) {
    if (Objects.equals(this.nameEclipseNullable, value)) return this;
    return new ImmutableBugReport(this.nameNonNull, this.nameJavaxNullable, value, this.emailsNonNull, this.emailsEclipseNullable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BugReport#emailsNonNull() emailsNonNull}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBugReport withEmailsNonNull(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableBugReport(
        this.nameNonNull,
        this.nameJavaxNullable,
        this.nameEclipseNullable,
        newValue,
        this.emailsEclipseNullable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BugReport#emailsNonNull() emailsNonNull}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of emailsNonNull elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBugReport withEmailsNonNull(Iterable<String> elements) {
    if (this.emailsNonNull == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableBugReport(
        this.nameNonNull,
        this.nameJavaxNullable,
        this.nameEclipseNullable,
        newValue,
        this.emailsEclipseNullable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BugReport#emailsEclipseNullable() emailsEclipseNullable}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBugReport withEmailsEclipseNullable(String... elements) {
    if (elements == null) {
      return new ImmutableBugReport(this.nameNonNull, this.nameJavaxNullable, this.nameEclipseNullable, this.emailsNonNull, null);
    }
    List<String> newValue = Arrays.asList(elements) == null ? null : createUnmodifiableList(false, createSafeList(Arrays.asList(elements), false, false));
    return new ImmutableBugReport(
        this.nameNonNull,
        this.nameJavaxNullable,
        this.nameEclipseNullable,
        this.emailsNonNull,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BugReport#emailsEclipseNullable() emailsEclipseNullable}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of emailsEclipseNullable elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBugReport withEmailsEclipseNullable(Iterable<String> elements) {
    if (this.emailsEclipseNullable == elements) return this;
    List<String> newValue = elements == null ? null : createUnmodifiableList(false, createSafeList(elements, false, false));
    return new ImmutableBugReport(
        this.nameNonNull,
        this.nameJavaxNullable,
        this.nameEclipseNullable,
        this.emailsNonNull,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBugReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBugReport
        && equalTo((ImmutableBugReport) another);
  }

  private boolean equalTo(ImmutableBugReport another) {
    return nameNonNull.equals(another.nameNonNull)
        && Objects.equals(nameJavaxNullable, another.nameJavaxNullable)
        && Objects.equals(nameEclipseNullable, another.nameEclipseNullable)
        && emailsNonNull.equals(another.emailsNonNull)
        && Objects.equals(emailsEclipseNullable, another.emailsEclipseNullable);
  }

  /**
   * Computes a hash code from attributes: {@code nameNonNull}, {@code nameJavaxNullable}, {@code nameEclipseNullable}, {@code emailsNonNull}, {@code emailsEclipseNullable}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + nameNonNull.hashCode();
    h += (h << 5) + Objects.hashCode(nameJavaxNullable);
    h += (h << 5) + Objects.hashCode(nameEclipseNullable);
    h += (h << 5) + emailsNonNull.hashCode();
    h += (h << 5) + Objects.hashCode(emailsEclipseNullable);
    return h;
  }

  /**
   * Prints the immutable value {@code BugReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "BugReport{"
        + "nameNonNull=" + nameNonNull
        + ", nameJavaxNullable=" + nameJavaxNullable
        + ", nameEclipseNullable=" + nameEclipseNullable
        + ", emailsNonNull=" + emailsNonNull
        + ", emailsEclipseNullable=" + emailsEclipseNullable
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link BugReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BugReport instance
   */
  public static ImmutableBugReport copyOf(BugReport instance) {
    if (instance instanceof ImmutableBugReport) {
      return (ImmutableBugReport) instance;
    }
    return ImmutableBugReport.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBugReport ImmutableBugReport}.
   * <pre>
   * ImmutableBugReport.builder()
   *    .nameNonNull(String) // required {@link BugReport#nameNonNull() nameNonNull}
   *    .nameJavaxNullable(String | null) // nullable {@link BugReport#nameJavaxNullable() nameJavaxNullable}
   *    .nameEclipseNullable(@org.eclipse.jdt.annotation.Nullable String | null) // nullable {@link BugReport#nameEclipseNullable() nameEclipseNullable}
   *    .addEmailsNonNull|addAllEmailsNonNull(String) // {@link BugReport#emailsNonNull() emailsNonNull} elements
   *    .emailsEclipseNullable(List&amp;lt;String&amp;gt; | null) // nullable {@link BugReport#emailsEclipseNullable() emailsEclipseNullable}
   *    .build();
   * </pre>
   * @return A new ImmutableBugReport builder
   */
  public static ImmutableBugReport.Builder builder() {
    return new ImmutableBugReport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBugReport ImmutableBugReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BugReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME_NON_NULL = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String nameNonNull;
    private @Nullable String nameJavaxNullable;
    private @Nullable java.lang.@org.eclipse.jdt.annotation.Nullable String nameEclipseNullable;
    private List<String> emailsNonNull = new ArrayList<String>();
    private List<String> emailsEclipseNullable = null;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BugReport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BugReport instance) {
      Objects.requireNonNull(instance, "instance");
      nameNonNull(instance.nameNonNull());
      @Nullable String nameJavaxNullableValue = instance.nameJavaxNullable();
      if (nameJavaxNullableValue != null) {
        nameJavaxNullable(nameJavaxNullableValue);
      }
      java.lang.@org.eclipse.jdt.annotation.Nullable String nameEclipseNullableValue = instance.nameEclipseNullable();
      if (nameEclipseNullableValue != null) {
        nameEclipseNullable(nameEclipseNullableValue);
      }
      addAllEmailsNonNull(instance.emailsNonNull());
      List<String> emailsEclipseNullableValue = instance.emailsEclipseNullable();
      if (emailsEclipseNullableValue != null) {
        addAllEmailsEclipseNullable(emailsEclipseNullableValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link BugReport#nameNonNull() nameNonNull} attribute.
     * @param nameNonNull The value for nameNonNull 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nameNonNull(String nameNonNull) {
      this.nameNonNull = Objects.requireNonNull(nameNonNull, "nameNonNull");
      initBits &= ~INIT_BIT_NAME_NON_NULL;
      return this;
    }

    /**
     * Initializes the value for the {@link BugReport#nameJavaxNullable() nameJavaxNullable} attribute.
     * @param nameJavaxNullable The value for nameJavaxNullable (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nameJavaxNullable(@Nullable String nameJavaxNullable) {
      this.nameJavaxNullable = nameJavaxNullable;
      return this;
    }

    /**
     * Initializes the value for the {@link BugReport#nameEclipseNullable() nameEclipseNullable} attribute.
     * @param nameEclipseNullable The value for nameEclipseNullable (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nameEclipseNullable(java.lang.@org.eclipse.jdt.annotation.Nullable String nameEclipseNullable) {
      this.nameEclipseNullable = nameEclipseNullable;
      return this;
    }

    /**
     * Adds one element to {@link BugReport#emailsNonNull() emailsNonNull} list.
     * @param element A emailsNonNull element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmailsNonNull(String element) {
      this.emailsNonNull.add(Objects.requireNonNull(element, "emailsNonNull element"));
      return this;
    }

    /**
     * Adds elements to {@link BugReport#emailsNonNull() emailsNonNull} list.
     * @param elements An array of emailsNonNull elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmailsNonNull(String... elements) {
      for (String element : elements) {
        this.emailsNonNull.add(Objects.requireNonNull(element, "emailsNonNull element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link BugReport#emailsNonNull() emailsNonNull} list.
     * @param elements An iterable of emailsNonNull elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder emailsNonNull(Iterable<String> elements) {
      this.emailsNonNull.clear();
      return addAllEmailsNonNull(elements);
    }

    /**
     * Adds elements to {@link BugReport#emailsNonNull() emailsNonNull} list.
     * @param elements An iterable of emailsNonNull elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEmailsNonNull(Iterable<String> elements) {
      for (String element : elements) {
        this.emailsNonNull.add(Objects.requireNonNull(element, "emailsNonNull element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link BugReport#emailsEclipseNullable() emailsEclipseNullable} list.
     * @param element A emailsEclipseNullable element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmailsEclipseNullable(@Nullable String element) {
      if (this.emailsEclipseNullable == null) {
        this.emailsEclipseNullable = new ArrayList<String>();
      }
      this.emailsEclipseNullable.add(element);
      return this;
    }

    /**
     * Adds elements to {@link BugReport#emailsEclipseNullable() emailsEclipseNullable} list.
     * @param elements An array of emailsEclipseNullable elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmailsEclipseNullable(String... elements) {
      if (this.emailsEclipseNullable == null) {
        this.emailsEclipseNullable = new ArrayList<String>();
      }
      for (String element : elements) {
        this.emailsEclipseNullable.add(element);
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link BugReport#emailsEclipseNullable() emailsEclipseNullable} list.
     * @param elements An iterable of emailsEclipseNullable elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder emailsEclipseNullable(Iterable<String> elements) {
      if (elements == null) {
        this.emailsEclipseNullable = null;
        return this;
      }
      this.emailsEclipseNullable = new ArrayList<String>();
      return addAllEmailsEclipseNullable(elements);
    }

    /**
     * Adds elements to {@link BugReport#emailsEclipseNullable() emailsEclipseNullable} list.
     * @param elements An iterable of emailsEclipseNullable elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEmailsEclipseNullable(Iterable<String> elements) {
      Objects.requireNonNull(elements, "emailsEclipseNullable element");
      if (this.emailsEclipseNullable == null) {
        this.emailsEclipseNullable = new ArrayList<String>();
      }
      for (String element : elements) {
        this.emailsEclipseNullable.add(element);
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableBugReport ImmutableBugReport}.
     * @return An immutable instance of BugReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBugReport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBugReport(
          nameNonNull,
          nameJavaxNullable,
          nameEclipseNullable,
          createUnmodifiableList(true, emailsNonNull),
          emailsEclipseNullable == null ? null : createUnmodifiableList(true, emailsEclipseNullable));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME_NON_NULL) != 0) attributes.add("nameNonNull");
      return "Cannot build BugReport, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
