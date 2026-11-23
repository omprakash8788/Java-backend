### Abstraction and Abstract Classes

### What is Abstraction
```
Abstraction means hiding implementation details and exposing only the essential operations that a user of a class needs.

```
### Interview definition:
```
Abstraction is an OOP principle that hides implementation details and exposes essential functionality through a simplified interface.
```

---

### Part 2 — Abstract classes
### 3. What is an abstract class?

An abstract class is a class declared using the abstract keyword.
```
public abstract class Employee {

    public abstract void work();

}
```

Notice:
```
public abstract void work();
```
There is no method body.

This is called an `abstract method.`

### Important rules
1. An abstract class cannot be instantiated directly.

2. An abstract class can contain abstract methods.

3. An abstract class can contain normal methods.

4. An abstract class can contain fields and constructors.

5. A concrete child class must implement all inherited abstract methods unless it is also abstract.

6. An abstract class can have zero abstract methods.


### You cannot create an object of an abstract class

```
public abstract class Employee {

    public abstract void work();

}
```

This is invalid:

```
Employee employee = new Employee();
```

Why?

Because Employee is abstract.

It represents a general concept, not a complete concrete implementation.

However, this is valid:

```
Employee employee = new Developer();
```

Provided Developer is a concrete class that implements the inherited abstract methods.

---

### Part 3 — Build a practical application

We'll build an employee management system using abstract classes.

### 5. Project structure

```
JavaLesson6/
│
└── src/
    ├── Employee.java
    ├── Developer.java
    ├── Manager.java
    ├── Tester.java
    └── Main.java
```

### Abstract class vs interface — differences

- This is one of the most important Java interview topics.

### 6. What is an interface?

An interface defines a contract that implementing classes agree to provide.

Example:
```
public interface Payment {

    void pay(double amount);

}
```

A class implements an interface using the `implements` keyword.

```
public class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid using UPI: " + amount
        );
    }
}
```

Another implementation:

```
public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid using Card: " + amount
        );
    }
}
```

Now:
```
Payment payment = new UpiPayment();

payment.pay(500);
```

output:
```
Paid using UPI: 500.0
```

We can replace the implementation:

```
Payment payment = new CardPayment();

payment.pay(500);

```

Output:
```
Paid using Card: 500.0
```

### Part 10 — Practical assignment
Build a payment processing system using abstraction and interfaces.

