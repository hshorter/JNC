package com.tailf.jnc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class JNCExceptionTest {
    
    public JNCExceptionTest() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void shouldProvideGetMessage() {
        JNCException ex = new JNCException(-1, new Object());
        assertEquals(ex.toString(), ex.getMessage());
    }
}
