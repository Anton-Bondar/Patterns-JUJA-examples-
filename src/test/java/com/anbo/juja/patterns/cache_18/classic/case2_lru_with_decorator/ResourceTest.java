package com.anbo.juja.patterns.cache_18.classic.case2_lru_with_decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 11.01.2016.
 */
public class ResourceTest {

    @Test
    public void test() throws Exception {
        // given
        Resource resource = new Resource(13);

        // when then
        assertEquals("Resource:13", resource.toString());
        assertEquals(13, resource.getId());
    }
}