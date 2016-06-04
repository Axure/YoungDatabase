package com.zjuqsc.youngdatabase;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lluvi on 2016/6/3.
 */
public class MainTest {
    @Test
    public void newArrayListsHaveNoElements() {
        assertThat(new ArrayList().size(), is(0));
    }
}
