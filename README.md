# QAP3 - Problem Solutions

##  Overview
This project contains Java solutions for multiple **Object-Oriented Programming** problems.  
Each problem demonstrates key **OOP concepts** such as **inheritance, polymorphism, abstraction, interfaces, and packages**.

---

##  Project Structure
QAP3/ │── Problem1/  
      ├── problem1/ # Java package for Problem 1 
      │ │ ├── Person.java 
      │ │ ├── Student.java 
      │ │ ├── Teacher.java 
      │ │ ├── CollegeStudent.java 
      │ │ ├── Demo.java 
      │ ├── Screenshot_Problem1.png │ 
      │── Problem2/ 
      │ ├── problem2/ 
      │ │ ├── Point.java 
      │ │ ├── MovablePoint.java 
      │ │ ├── Demo.java 
      │ ├── Screenshot_Problem2.png 
      │── Problem3/  
      │ ├── problem3/ 
      │ │ ├── Shape.java 
      │ │ ├── Circle.java 
      │ │ ├── Ellipse.java 
      │ │ ├── Triangle.java 
      │ │ ├── EquilateralTriangle.java 
      │ │ ├── Demo.java 
      │── Problem4/ 
      │ ├── problem4/ 
      │ │ ├── Shape.java 
      │ │ ├── Circle.java 
      │ │ ├── Ellipse.java 
      │ │ ├── Triangle.java 
      │ │ ├── EquilateralTriangle.java 
      │ │ ├── Scalable.java 
      │ │ ├── Demo.java 
      │ ├── Screenshot_Problem4.png

---

## **Problem Descriptions**


### ** Problem 1: Person-Student-Teacher-CollegeStudent**
This problem demonstrates **inheritance and polymorphism** by creating a **hierarchy of people in a school**.

**Key Classes:**
- **`Person`** → The base class containing attributes like `name`, `age`, and `gender`.
- **`Student`** → Inherits from `Person`, adding attributes like `studentID` and `GPA`.
- **`Teacher`** → Inherits from `Person`, adding attributes like `subject` and `salary`.
- **`CollegeStudent`** → Inherits from `Student`, adding attributes like `year` and `major`.

 **Screenshot Available:** `Screenshot_Problem1.png`

---

### ** Problem 2: Point & MovablePoint**
This problem demonstrates **object movement** using **getter and setter methods**.

**Key Classes:**
- **`Point`** → Represents a **fixed coordinate (x, y)**.
- **`MovablePoint`** → Inherits from `Point` and adds speed attributes (`xSpeed`, `ySpeed`) along with a `move()` method.

**Screenshot Available:** `Screenshot_Problem2.png`

---

### ** Problem 3: Shape Hierarchy (Abstract Classes)**
This problem defines a **Shape hierarchy** using `abstract` methods.

**Key Classes:**
- **`Shape`** → Abstract class defining `getArea()` and `getPerimeter()`.
- **`Circle`** → Implements `getArea()` and `getPerimeter()` using a radius.
- **`Ellipse`** → Implements `getArea()` and `getPerimeter()` using major and minor axes.
- **`Triangle`** → Implements `getArea()` and `getPerimeter()` for a general triangle.
- **`EquilateralTriangle`** → Inherits from `Triangle` with equal sides.

**Screenshot Available:** `Screenshot_Problem3.png`

**Extends to Problem 4 by Adding Scaling (See Next Problem).**

---

### **Problem 4: Scalable Interface Implementation**
This problem **extends Problem 3** by adding a **Scalable interface** to allow scaling of shapes.

**Key Changes from Problem 3:**
- **Added `Scalable` Interface** → Defines `scale(double factor)`.
- **`Shape` Implements `Scalable`** → Forces all shapes to support scaling.
- **`Circle`, `Ellipse`, and `Triangle` Override `scale()`** → Multiplies dimensions accordingly.

**Screenshot Available:** `Screenshot_Problem4.png`



