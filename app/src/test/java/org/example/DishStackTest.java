package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DishStackTest {

    @Test
    public void testPushAndSize() {
        DishStack stack = new DishStack();
        assertEquals(0, stack.size());
        stack.push(new Dish("Plate 1"));
        stack.push(new Dish("Plate 2"));
        assertEquals(2, stack.size());
    }

    @Test
    public void testPeek() {
        DishStack stack = new DishStack();
        Dish top = new Dish("Top Plate");
        stack.push(new Dish("Bottom Plate"));
        stack.push(top);
        assertEquals("Top Plate", stack.peek().description);
        assertEquals(2, stack.size()); // Should not remove it
    }

    @Test
    public void testPop() {
        DishStack stack = new DishStack();
        Dish last = new Dish("Last Plate");
        stack.push(new Dish("First Plate"));
        stack.push(last);
        assertEquals("Last Plate", stack.pop().description);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopFromEmpty() {
        DishStack stack = new DishStack();
        assertNull(stack.pop());
    }

    @Test
    public void testPushToFullStack() {
        DishStack stack = new DishStack();
        for (int i = 0; i < 10; i++) {
            stack.push(new Dish("Plate " + i));
        }
        assertEquals(10, stack.size());
        stack.push(new Dish("Overflow Plate")); // Should not be added
        assertEquals(10, stack.size());
    }
}
