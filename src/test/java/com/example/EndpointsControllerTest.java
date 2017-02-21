package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by scottyvg on 2/20/17.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(EndpointsController.class)

public class EndpointsControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testEndpoints() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/app/");

        this.mvc.perform(request)
                .andExpect(status().isOk());
    }

    @Test
    public void testPostEndpoint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/app/tasks");

        this.mvc.perform(request)
                .andExpect(status().isOk());
    }

}
