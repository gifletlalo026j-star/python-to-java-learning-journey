# Part 2: Four-Step Prompting Strategy

## Step 4: Understanding Verification

### Topic: Verifying the Java Task Class

## Purpose

After completing the guided implementation of the `Task` class, I reviewed the code and used AI to verify my understanding.

The goal was to check whether I had followed Java best practices, identify possible improvements, and recognize any Python habits that might affect the way I write Java.

---

## Prompt Used

I have created this Java implementation for my Task Manager:

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

Could you:

1. Verify if I have followed Java best practices.
2. Explain any improvements I should make.
3. Suggest what I should learn next.
4. Point out any Python habits that might be showing in my code.
5. Explain whether the class follows the principles of encapsulation and object-oriented programming.

---

# Verification Results

## 1. Java Best Practices

The implementation follows several basic Java best practices.

### Private Fields

The fields are declared as private:

```java
private String title;
private String description;
private boolean completed;
```

This protects the internal state of the object.

Other classes cannot directly modify these fields.

This supports encapsulation.

---

### Constructor

The constructor requires the title and description when creating a new task:

```java
public Task(String title, String description)
```

This ensures that a task is created with the basic information it needs.

The completion status is automatically initialized to `false`.

---

### Getter Methods

Getter methods provide controlled access to the private fields.

For example:

```java
public String getTitle() {
    return title;
}
```

This allows other classes to read the title without directly accessing the private field.

---

### Method for Changing State

The method:

```java
public void markAsCompleted() {
    completed = true;
}
```

controls how the completion status changes.

This is better than allowing external classes to directly modify the field.

---

### `toString()` Method

The `toString()` method provides a readable representation of the object.

This makes it easier to display tasks in the command-line application.

---

# 2. Possible Improvements

Although the class is suitable for a beginner Task Manager, there are improvements that could be made.

### Validation

The constructor could validate the title and description.

For example, it could prevent empty task titles.

A future version could check that:

* The title is not empty.
* The description is not empty.
* The title does not contain invalid data.

---

### Setters

Currently, the task title and description cannot be changed after the object is created.

If the application needs an edit feature, setter methods or specific update methods could be added.

For example:

```java
public void updateTitle(String title) {
    this.title = title;
}
```

However, setters should only be added when they are actually needed.

---

### Unique Task IDs

A future version could give every task a unique ID.

This would make it easier to identify tasks instead of relying only on their position in an `ArrayList`.

For example:

```text
Task ID: 101
Title: Learn Java
```

This could be useful when the application becomes larger.

---

# 3. What I Should Learn Next

Based on this implementation, the next concepts I should learn are:

1. `ArrayList` and Java collections.
2. How to create and manage multiple `Task` objects.
3. Exception handling using `try` and `catch`.
4. File input and output.
5. Reading user input with `Scanner`.
6. Organizing code across multiple classes.
7. Packages and imports.
8. Interfaces and inheritance.
9. Unit testing in Java.

These concepts will help me continue building the Task Manager.

---

# 4. Python Habits I Need to Watch

Coming from Python, there are several habits I need to adjust.

### Habit 1: Expecting Dynamic Typing

In Python, I might write:

```python
title = "Learn Java"
```

In Java, I need to explicitly define the type:

```java
String title = "Learn Java";
```

I need to become comfortable thinking about types before using variables.

---

### Habit 2: Direct Attribute Access

In Python, I might access:

```python
task.title
```

In Java, the field is private, so I use:

```java
task.getTitle()
```

This reinforces the concept of encapsulation.

---

### Habit 3: Using Snake Case

Python commonly uses:

```python
mark_as_completed()
```

Java commonly uses camelCase:

```java
markAsCompleted()
```

I need to follow Java naming conventions when writing Java code.

---

### Habit 4: Expecting Shorter Code

Python often allows me to solve problems with fewer lines of code.

Java is more explicit and structured.

I should not try to force Python-style code into Java. Instead, I should learn to use Java's structure effectively.

---

# 5. Encapsulation

The `Task` class demonstrates encapsulation.

The fields are private:

```java
private String title;
private String description;
private boolean completed;
```

The class controls access to its data through methods.

For example:

```java
public String getTitle()
```

allows other classes to retrieve the title.

The method:

```java
public void markAsCompleted()
```

controls how the completion status changes.

This means that the internal state of the object is protected from uncontrolled modification.

---

# 6. Object-Oriented Programming

The `Task` class demonstrates several object-oriented programming concepts.

### Class

`Task` is the blueprint for creating task objects.

### Object

An actual task created using:

```java
Task task = new Task(
    "Learn Java",
    "Study classes and objects"
);
```

is an object.

### Encapsulation

Private fields and public methods control access to the object's state.

### Abstraction

The user of the class does not need to know exactly how the task stores its completion status.

They can simply call:

```java
task.markAsCompleted();
```

This hides implementation details.

---

# My Understanding

After completing the verification process, I understand that the `Task` class is responsible for representing one task in the application.

The class stores the task's data and provides methods that define what can be done with that task.

I understand that:

* A class is a blueprint.
* An object is an instance of a class.
* A constructor initializes an object.
* Private fields protect internal data.
* Public methods provide controlled access.
* Encapsulation helps protect an object's state.
* Java requires more explicit type information than Python.
* Java naming conventions differ from Python conventions.

I also understand that the `Task` class should focus mainly on representing a task, while another class, such as `TaskManager`, should be responsible for managing multiple tasks.

This separation of responsibilities will help me create a cleaner and more maintainable application.

---

# Conclusion

The verification process helped me confirm that I understand the basic structure of my Java `Task` class.

It also helped me identify areas where my Python experience influences the way I think about Java.

The next step is to create the `TaskManager` class, which will manage multiple `Task` objects using an `ArrayList`.

This will allow me to apply the concepts I have learned and continue building the Java Task Manager project.
