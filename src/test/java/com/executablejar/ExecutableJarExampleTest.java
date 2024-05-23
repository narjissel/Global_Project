package com.github.romankh3.executablejar;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link ExecutableJarExample} object.
 */
public class ExecutableJarExampleTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        ExecutableJarExample main = new ExecutableJarExample();
        assertNotNull(main);
    }

    @Test
    public void testGreet() {
        ExecutableJarExample example = new ExecutableJarExample();
        
        assertEquals("Hello, World!", example.greet(null));
        assertEquals("Hello, World!", example.greet(""));
        assertEquals("Hello, nono!", example.greet("nono"));
    }
}
