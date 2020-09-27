package com.wissensalt.rms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AjaxMessTest {

    @InjectMocks AjaxMess ajaxMess;

    @Test
    public void convert() {
        String actual = ajaxMess.convert("This is Regular Test to Be Converted info mess readable words");
        Assert.assertNotNull(actual);
        Assert.assertEquals(actual.length(), 62);
    }
}
