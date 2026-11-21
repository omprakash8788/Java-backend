### Encapsulation, Getters, Setters and Access Modifiers

`In this lesson, we'll learn how to protect an object's internal state using encapsulation.`

### What is encapsulation?
Encapsulation means:
 1. Keeping an object's data and the methods that operate on it together.
 2. Restricting direct access to its internal data.
 3. Providing controlled ways to read or modify that data.

 ```
 Think about a bank account.

You can deposit money and withdraw money, but you cannot directly reach into the bank's database and change your balance.
```
```
BankAccount

Private internal data
- accountNumber
- balance
- accountHolder


Public methods
- deposit()
- withdraw()
- getBalance()

Other classes interact with the account through its controlled public methods.

```


### 2. Access modifiers in Java
Access modifiers control where classes, fields, constructors and methods can be accessed.

Java has four access levels:
```
Modifier	Access
public -	From anywhere, subject to class/module visibility
private -	Only inside the declaring class
protected - 	Same package, and subclasses in other packages under Java's protected-access rules
No modifier (package-private) - 	Only within the same package

```

### 3. Getters and setters
If a field is private, how can another class read or update it?

We provide methods.
- Getter: Reads and returns a field's value.
- Setter: Changes a field's value, potentially after validation.

Example :

```
public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
```

Using it:

```
Employee employee = new Employee();

employee.setName("Rahul");

System.out.println(employee.getName());
```

### Understand the difference

```
public void setName(String name) {
    this.name = name;
}
```

- `name` on the right side is the method parameter.
- `this.name` refers to the field belonging to the current object.
- The assignment updates that object's field.
This is the same this keyword you learned in Lesson 3.

---

### 4. Setters should protect data
A setter does not have to accept every value.

Consider this weak implementation:

```
public void setSalary(double salary) {
    this.salary = salary;
}
```

It allows negative salaries.

A better implementation:

```
public void setSalary(double salary) {

    if (salary < 0) {
        throw new IllegalArgumentException(
            "Salary cannot be negative"
        );
    }

    this.salary = salary;
}
```

Now:

```
employee.setSalary(50000);  // Valid

employee.setSalary(-5000);  // Throws exception
```

### Why throw an exception?

Because the caller supplied an invalid value. Silently accepting it or ignoring it could hide a bug.

Also remember: a getter does not automatically make a field safe. The class must validate all ways that field can be initialized or changed, including constructors.

---

### 5. Practical implementation — Employee Management

Now we'll improve your Lesson 3 Employee class.

### Project structure

Create this structure in VS code:

```
Lesson4/
│
├── src/
│   ├── Employee.java
│   └── Main.java
│
└── out/
```

### File 1: src/Employee.java

```

public class Employee {

    // Private fields: cannot be accessed directly from Main
    private final int employeeId;
    private String name;
    private double salary;

    private static final String COMPANY_NAME = "TechCorp";

    // Constructor
    public Employee(String name, int employeeId, double salary) {

        if (employeeId <= 0) {
            throw new IllegalArgumentException(
                "Employee ID must be positive"
            );
        }

        this.employeeId = employeeId;
        this.name = validateName(name);
        this.salary = validateSalary(salary);
    }

    // Getter for employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = validateName(name);
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = validateSalary(salary);
    }

    // Static getter for company name
    public static String getCompanyName() {
        return COMPANY_NAME;
    }

    // Business operation
    public void giveRaise(double amount) {

        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                "Raise amount must be a positive finite number"
            );
        }

        this.salary = this.salary + amount;
    }

    // Private validation methods
    private static String validateName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Employee name cannot be empty"
            );
        }

        return name.trim();
    }

    private static double validateSalary(double salary) {

        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException(
                "Salary must be a non-negative finite number"
            );
        }

        return salary;
    }

    public void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + COMPANY_NAME);
    }
}


```