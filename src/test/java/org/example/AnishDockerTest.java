package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class AnishDockerTest extends TestCase {

    public void testDisplayName() {
        AnishDocker user = new AnishDocker("David");
        assertEquals("David", user.getName());
    }

}