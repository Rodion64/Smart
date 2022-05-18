package Cursach;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("/application-test.properties")
@Sql(value = {"/create-user-before.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@Sql(value = { "/create-user-after.sql"}, executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
public class RegisterTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void contextLoads() throws Exception {
        this.mockMvc.perform(get("/login"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Регистрация")));
    }
    @Test
    public void correctRegistrationTest() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("username","testRegUser");
        params.add("email","testmail@gmail.com");
        params.add("phone","88005553535");
        params.add("password","password");
        this.mockMvc.perform(post("/registration").params(params))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/login"));
    }

    @Test
    public void badCredentials() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("username","testUser");
        params.add("email","testmail@gmail.com");
        params.add("phone","88005553535");
        params.add("password","password");
        this.mockMvc.perform(post("/registration").params(params))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
