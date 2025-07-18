package org.example;

public class DishStack {
    private Dish[] stack;
    private int top;

    public DishStack() {
        stack = new Dish[10];
        top = 0;
    }

    public void push(Dish dish) {
        if (top == stack.length) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stack[top++] = dish;
    }

    public Dish pop() {
        if (top == 0) {
            return null;
        }
        return stack[--top];
    }

    public Dish peek() {
        if (top == 0) {
            return null;
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }
}
