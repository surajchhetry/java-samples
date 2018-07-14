package com.github.surajchhetry.effective.chapter42;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EnumWithLambdasTest {

    @DisplayName(" Testing plus ")
    @Test
    public void enumPlusTest(){
        assertEquals(4,EnumWithLambdas.PLUS.apply(2,2));
    }
}
