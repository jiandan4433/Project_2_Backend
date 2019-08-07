package dev.hogue.mocks;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.google.gson.Gson;

import dev.hogue.app.Project2Application;
import dev.hogue.entities.Ingredient;
import dev.hogue.service.IngredientService;
import dev.hogue.service.InstructionService;
import dev.hogue.service.RecipeService;
import dev.hogue.service.UserService;

@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = dev.hogue.app.Project2Application.class)
class OtherTest {

	@Autowired
    MockMvc mockmvc;
    
    @MockBean
    @Qualifier("RecipeServiceSpring")
    RecipeService rs;
    @MockBean
    @Qualifier("IngredientServiceSpring")
    IngredientService ingred;
    @MockBean
    @Qualifier("InstructionServiceSpring")
    InstructionService instru;
    @MockBean
    @Qualifier("UserServiceSpring")
    UserService us;
    
    @Test
    public void getAllIngredient() throws Exception {
        Ingredient fake1 = new Ingredient();
        fake1.setName("rice");
        fake1.setUsedIn(null);
        Ingredient fake2 = new Ingredient();
        fake2.setName("rice2");
        fake2.setUsedIn(null);
        Set<Ingredient> ingredients = new HashSet<Ingredient>();
        ingredients.add(fake1);
        ingredients.add(fake2);
        Gson gson = new Gson();
        String json = gson.toJson(ingredients);
        System.out.println(json);
        System.out.println(ingredients.toString());
        
        Mockito.when(
        		ingred.getAllIngredient()
        		).thenReturn(ingredients);
        ResultActions rs = mockmvc.perform(get("/ingredients"));
        rs.andExpect(status().isOk());
        rs.andExpect(content().json(json));
    }

}
