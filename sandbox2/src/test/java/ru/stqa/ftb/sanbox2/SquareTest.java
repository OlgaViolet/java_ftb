package ru.stqa.ftb.sanbox2;

import org.testng.annotations.Test;
import ru.stqa.ftb.sandbox2.Square;

public class SquareTests {

    @Test

    public void testArea() {
        Square s = new Square(5);
        assert s.area() == 25;
    }