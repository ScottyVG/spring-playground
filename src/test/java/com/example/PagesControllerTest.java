/**
 * Created by scottyvg on 2/16/17.
 */

package com.example;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(PagesController.class)

public class PagesControllerTest {

    @Autowired
    MockMvc mvc;
}
