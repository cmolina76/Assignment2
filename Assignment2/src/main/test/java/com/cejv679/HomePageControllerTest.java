package com.cejv679;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import com.cejv679.web.HomePageController;

/**
 * Created by carlos molina
 */
public class HomePageControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomePageController controller = new HomePageController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/"))
                .andExpect(view().name("homePage"));
    }
}





