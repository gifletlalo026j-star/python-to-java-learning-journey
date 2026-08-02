# Part 2: Four-Step Prompting Strategy

## Step 3: Guided Implementation

### Topic: Creating a Task Class in Java

## Purpose

After learning about classes and objects in Java, I was ready to implement a simple example.

I decided to create the `Task` class that will be used in my Java Task Manager project.

The `Task` class represents an individual task and contains information about the task as well as behavior for marking the task as completed.

---

## Prompt Used

I am ready to implement my first class in Java.

I am coming from a Python background and want to create a simple `Task` class for a command-line Task Manager.

Could you guide me through creating a simple `Task` class in Java?

The class should have:

* A title
* A description
* A completion status

It should also have:

* A constructor to initialize the task
* Getter methods to access the task information
* A method to mark the task as completed
* A `toString()` method to display the task

Please explain each part of the Java syntax, especially the parts that differ from Python.

Do not just give me the final answer. Explain how the class works and why each part is needed.

---

# Guided Implementation

## Step 1: Define the Class

The first step is to create a class called `Task`.

```java
public class Task {
}
```

The `public` keyword means that the class can be accessed from other classes.

The class name is `Task`.

In Java, class names normally use PascalCase.

In Python, the equivalent would be:

```python
class Task:
    pass
```

The main difference is that Java explicitly uses the `public class` structure.

---

## Step 2: Add Fields

Next, the class needs to store information about each task.

We need:

* A title
* A description
* A completion status

The Java fields are:

```java
private String title;
private String description;
private boolean completed;
```

The `String` type is used for text.

The `boolean` type stores either `true` or `false`.

The `private` keyword is used to protect the fields from direct access outside the class.

In Python, I could simply write:

```python
self.title = title
self.description = description
self.completed = False
```

Java requires me to explicitly define the data types.

---

## Step 3: Create the Constructor

The constructor initializes a new task.

```java
public Task(String title, String description) {
    this.title = title;
    this.description = description;
    this.completed = false;
}
```

The constructor has the same name as the class: `Task`.

The `this` keyword refers to the current object.

For example:

```java
this.title = title;
```

The first `title` refers to the object's field.

The second `title` refers to the constructor parameter.

In Python, this would be similar to:

```python
def __init__(self, title, description):
    self.title = title
    self.description = description
    self.completed = False
```

The main difference is that Java uses a constructor with the same name as the class, while Python uses `__init__`.

---

## Step 4: Create Getter Methods

Because the fields are private, other classes need methods to access their values.

The getter for the title is:

```java
public String getTitle() {
    return title;
}
```

The getter for the description is:

```java
public String getDescription() {
    return description;
}
```

The getter for the completion status is:

```java
public boolean isCompleted() {
    return completed;
}
```

The return type is written before the method name.

For example:

```java
public String getTitle()
```

means that the method returns a `String`.

In Python, I could access the attribute directly:

```python
task.title
```

Java's approach encourages encapsulation by controlling how data is accessed.

---

## Step 5: Add the Completion Method

The task needs a method that changes its status to completed.

```java
public void markAsCompleted() {
    completed = true;
}
```

The `void` keyword means the method does not return a value.

The method changes the `completed` field from:

```text
false
```

to:

```text
true
```

In Python, this could be:

```python
def mark_as_completed(self):
    self.completed = True
```

The main difference is that Java explicitly requires a return type.

---

## Step 6: Override `toString()`

We want the task to display useful information when printed.

Java provides a `toString()` method that can be overridden.

```java
@Override
public String toString() {
    String status = completed ? "[Completed]" : "[Pending]";

    return status + " " + title + " - " + description;
}
```

The `@Override` annotation indicates that we are providing our own implementation of a method inherited from the parent class.

The `? :` syntax is called the ternary operator.

It works like a short version of an `if` statement.

The code:

```java
String status = completed ? "[Completed]" : "[Pending]";
```

means:

* If `completed` is `true`, use `[Completed]`.
* Otherwise, use `[Pending]`.

This is similar to:

```python
status = "[Completed]" if completed else "[Pending]"
```

in Python.

---

# Final Task Class

After working through each step, the completed class is:

```java
public class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        String status = completed ? "[Completed]" : "[Pending]";

        return status + " " + title + " - " + description;
    }
}
```

---

# What I Learned

Through this guided implementation, I learned how to create a Java class and how it differs from creating a class in Python.

The main differences I noticed are:

1. Java requires explicit data types.
2. Java uses access modifiers such as `private` and `public`.
3. Java constructors have the same name as the class.
4. Java methods require a return type.
5. Java uses `this` to refer to the current object.
6. Java encourages encapsulation through private fields and public methods.
7. Java uses `toString()` to define how an object is represented as text.

This exercise helped me understand how Java's stronger structure and type system affect the way I design classes.

The `Task` class will now be used as the foundation of my Java Task Manager project.
