package com.cejv679;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import com.cejv679.web.PlayerPageController;

/**
 * Created by Carlos Molina.
 */
public class PlayerPageControllerTest {

    @Test
    public void shouldShowCreatePlayer() throws Exception {
        PlayerPageController controller = new PlayerPageController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/player/create"))
                .andExpect(view().name("createPlayer"));
    }
}
