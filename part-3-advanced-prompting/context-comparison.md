# Part 3: Advanced Prompting Techniques

## Technique 1: Using Context Effectively

### Purpose

I used my existing knowledge of Python as context when learning Java.

Instead of learning Java concepts without any connection to my existing knowledge, I asked AI to explain Java concepts by comparing them with Python concepts I already understand.

This made it easier to identify similarities and differences between the two languages.

---

## Prompt Used

I am learning Java after becoming comfortable with Python.

I am currently learning Java classes, objects, methods, and collections.

Could you explain these Java concepts by comparing them to concepts I already know from the Python ecosystem?

Please compare:

1. Java classes with Python classes.
2. Java constructors with Python `__init__`.
3. Java methods with Python methods.
4. Java `ArrayList` with Python lists.
5. Java `HashMap` with Python dictionaries.
6. Java interfaces with Python protocols or abstract base classes.
7. Java exception handling with Python exception handling.

For each comparison, explain:

* What is similar?
* What is different?
* What Python habits should I avoid when writing Java?
* When would I use each concept?

Use examples where helpful.

---

# Java Classes vs Python Classes

Both Java and Python support classes and objects.

In Python:

```python
class Task:
    def __init__(self, title):
        self.title = title
```

In Java:

```java
public class Task {
    private String title;

    public Task(String title) {
        this.title = title;
    }
}
```

The main difference is that Java requires more explicit structure.

Java requires:

* Data types
* Access modifiers
* Explicit constructors
* Explicit method return types

Python is more flexible and allows developers to write classes with less syntax.

---

# Java Constructors vs Python `__init__`

Python uses:

```python
def __init__(self, title):
    self.title = title
```

Java uses:

```java
public Task(String title) {
    this.title = title;
}
```

Both are used to initialize objects.

The main difference is that Java constructors have the same name as the class.

Python always uses the special `__init__` method.

---

# Java Methods vs Python Methods

Python:

```python
def mark_as_completed(self):
    self.completed = True
```

Java:

```java
public void markAsCompleted() {
    completed = true;
}
```

Java methods require a return type.

For example:

```java
public String getTitle()
```

means that the method returns a `String`.

Python does not require the return type to be declared.

Java also uses camelCase naming conventions, while Python normally uses snake_case.

---

# Java `ArrayList` vs Python List

A Python list can be created like this:

```python
tasks = []
```

Items can be added with:

```python
tasks.append(task)
```

In Java, an `ArrayList` can be created like this:

```java
ArrayList<Task> tasks = new ArrayList<>();
```

An item can be added with:

```java
tasks.add(task);
```

The important difference is that Java's `ArrayList` uses generics to specify the type of objects it stores.

For example:

```java
ArrayList<Task>
```

means the list is designed to contain `Task` objects.

Python lists can contain different types of objects, although good Python code often uses type hints to improve clarity.

---

# Java `HashMap` vs Python Dictionary

Python dictionaries store key-value pairs:

```python
tasks = {
    1: "Learn Java",
    2: "Build project"
}
```

Java provides `HashMap`:

```java
HashMap<Integer, String> tasks = new HashMap<>();
```

Both are useful when data needs to be accessed using a key.

Java requires the types of the keys and values to be declared.

In this example:

```java
HashMap<Integer, String>
```

the key must be an `Integer` and the value must be a `String`.

---

# Java Interfaces vs Python Protocols

Java interfaces define a contract that classes can implement.

For example:

```java
public interface Printable {
    void print();
}
```

A class can implement the interface:

```java
public class Task implements Printable {

    @Override
    public void print() {
        System.out.println("Printing task");
    }
}
```

Python has a more flexible approach.

Python developers may use protocols or abstract base classes when they want to define expected behavior.

Java interfaces are more explicit and are an important part of Java's object-oriented design.

---

# Java Exception Handling vs Python

Python:

```python
try:
    number = int(input("Enter a number: "))
except ValueError:
    print("Invalid number")
```

Java:

```java
try {
    int number = Integer.parseInt(input);
} catch (NumberFormatException e) {
    System.out.println("Invalid number");
}
```

The concepts are very similar.

Both languages use:

* `try`
* `catch` or `except`

The main difference is syntax and Java's more explicit type system.

---

# What I Learned

Using Python as context helped me understand Java more quickly.

I realized that many programming concepts are shared between the two languages.

The biggest differences are often in how the languages express those concepts.

Python generally prioritizes simplicity and flexibility.

Java generally prioritizes explicit structure, strong typing, and maintainability for larger applications.

Using concepts I already understand from Python gives me a foundation for learning Java while helping me identify where I need to change my programming habits.

The most important lesson is that I should not simply translate Python code directly into Java.

Instead, I should understand the problem first and then use Java's own patterns and best practices to solve it.
