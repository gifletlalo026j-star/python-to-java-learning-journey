# Part 3: Advanced Prompting Techniques

## Technique 2: Promoting Deep Understanding

### Purpose

I used AI to go beyond simply making the Task Manager work.

The purpose of this exercise was to understand the performance implications of my implementation, consider alternative approaches, and think about how the application might change if it needed to support many more users and tasks.

---

## Prompt Used

I have implemented a Java command-line Task Manager.

The application currently:

* Stores tasks in an `ArrayList`.
* Allows users to add tasks.
* Allows users to view tasks.
* Allows users to mark tasks as completed.
* Allows users to delete tasks.
* Saves tasks to a text file.
* Loads tasks when the application starts.

Could you help me understand:

1. What are the performance implications of using an `ArrayList`?
2. What alternative data structures could I use?
3. How would the application need to change if the number of tasks increased by 10 times?
4. What problems could occur if multiple users used the application?
5. How could I improve the file storage approach?
6. How would the implementation change if I used a database instead of a text file?

Please explain the concepts in a beginner-friendly way.

---

# 1. Performance of `ArrayList`

The Task Manager uses an `ArrayList` to store tasks.

For example:

```java
List<Task> tasks = new ArrayList<>();
```

An `ArrayList` is efficient for storing an ordered collection of objects.

Adding an item to the end of an `ArrayList` is generally efficient.

However, finding a task by its position is based on the index.

Deleting an item from the middle of the list can require other elements to be shifted.

For a small command-line application, this is not a major problem.

---

# 2. Alternative Data Structures

A different data structure could be useful depending on the application's requirements.

For example, a `HashMap` could store tasks using a unique ID:

```java
HashMap<Integer, Task> tasks = new HashMap<>();
```

This would make finding a task by ID more efficient.

For example:

```text
Task ID: 101
Task ID: 102
Task ID: 103
```

The application could find task 102 directly using its ID.

This would be more suitable than relying on the task's position in an `ArrayList`.

---

# 3. Scaling the Application 10 Times

If the application grew from a small personal project to a much larger application, several changes would be necessary.

The application could introduce:

* Unique task IDs
* Better data storage
* Database persistence
* Input validation
* Automated tests
* Logging
* Better error handling
* Separation of application layers

The application could also separate responsibilities into different components.

For example:

```text
User Interface
      ↓
Service Layer
      ↓
Data Access Layer
      ↓
Database
```

This would make the application easier to maintain.

---

# 4. Multiple Users

The current application is designed for one user on one computer.

If multiple users needed to use the application, a simple text file would not be sufficient.

The application would need:

* User accounts
* Authentication
* Authorization
* A database
* A server or API
* Protection against concurrent updates

A database would allow multiple users to store and retrieve their own tasks.

---

# 5. Improving File Storage

The current implementation stores tasks in a text file.

This is simple and easy to understand, but it has limitations.

For example, the application could have problems if task descriptions contain the `|` character because the application uses it as a separator.

A better approach could be to use a structured format such as JSON.

This would make the data easier to read and maintain.

---

# 6. Using a Database

Instead of saving tasks to a text file, a database could be used.

A database could store information such as:

```text
Task ID
Title
Description
Completed
Created Date
Due Date
User ID
```

The application could then use SQL to retrieve and modify tasks.

A larger application could use a database such as PostgreSQL or MySQL.

The Java application could communicate with the database using JDBC or another database framework.

---

# What I Learned

The main lesson from this exercise is that a solution that works for a small project may not be appropriate for a large application.

My current `ArrayList` and text-file approach is suitable for a learning project because it is simple and helps me understand Java fundamentals.

However, if the application grew significantly, I would need to think about:

* Data structures
* Performance
* Persistence
* Security
* Multiple users
* Maintainability

This exercise helped me understand that programming is not only about making code work.

It is also about choosing an appropriate design based on the requirements and expected scale of the application.
