package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;

/**
 * Created by scottyvg on 3/3/17.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(mathTests.class)
public class mathTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testIndexEndpoin() throws Exception {
        RequestBuilder get;
        ResultActions perform = this.mvc.perform(get"/".accept(MediaType.TEXT_PLAIN));
    }
}
