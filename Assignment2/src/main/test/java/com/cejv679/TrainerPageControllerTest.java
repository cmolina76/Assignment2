package com.cejv679;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import com.cejv679.web.TrainerPageController;

/**
 * Created by Carlos Molina.
 */
public class TrainerPageControllerTest {

    @Test
    public void shouldShowCreateTrainer() throws Exception {
        TrainerPageController controller = new TrainerPageController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/trainer/create"))
                .andExpect(view().name("createTrainer"));
    }
}
