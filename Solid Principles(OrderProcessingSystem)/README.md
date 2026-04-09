## Overview

This project demonstrates the application of **SOLID Principles** in Object-Oriented Programming through an Order Processing System. The code has been refactored from a monolithic, tightly-coupled implementation to a clean, maintainable, and extensible architecture.

## Problem Statement

The original code violated multiple SOLID principles:

- **ISP Violation**: A fat `Order` interface forced classes to implement unnecessary methods
- **SRP Violation**: `OrderAction` class handled 4 unrelated responsibilities
- **OCP Violation**: Adding new features required modifying existing code
- **DIP Violation**: Direct dependencies on concrete implementations

## UML Class Diagram
