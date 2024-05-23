package com.github.romankh3.executablejar;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit-level testing for {@link ExecutableJarExample} object.
 */
public class ExecutableJarExampleTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        ExecutableJarExample main = new ExecutableJarExample();
        assertNotNull(main);
                // Ajout de tests supplémentaires pour valider le comportement
        String expected = "executable-jar-example";
        String actual = ExecutableJarExample.JAVA_REPOSITORY_TEMPLATE;
        assertEquals(expected, actual);

        
    }

    @Test
    public void testGreet() {
        ExecutableJarExample example = new ExecutableJarExample();
        
        assertEquals("Hello, World!", example.greet(null));
        assertEquals("Hello, World!", example.greet(""));
        assertEquals("Hello, nono!", example.greet("nono"));
    }

     @Test
    public void testConcatenateStrings() {
        ExecutableJarExample example = new ExecutableJarExample();
        assertEquals("HelloWorld", example.concatenateStrings("Hello", "World"));
        assertEquals("OpenAIisAwesome", example.concatenateStrings("OpenAI", "isAwesome"));
        assertEquals("", example.concatenateStrings("", ""));
    }
}
