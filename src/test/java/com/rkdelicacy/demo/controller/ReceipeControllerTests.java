package com.rkdelicacy.demo.controller;

import com.rkdelicacy.demo.model.Recipes;
import com.rkdelicacy.demo.repository.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@WebMvcTest(ReceipeController.class)
public class ReceipeControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private RecipeRepository recipeRepository;

    @MockBean
    private ReceipeController receipeController;

    // write test cases here
    @Test
    public void givenReceipes_whenGetReceipes_thenReturnJsonArray()
            throws Exception {

                Recipes recipes = new Recipes();
                recipes.setName("cake");

                List<Recipes> allReceipes = Arrays.asList(recipes);

                given(receipeController.getAll()).willReturn(allReceipes);

                mvc.perform(get("/api/recipes/all")
                        .contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk())
                        .andExpect(jsonPath("$", hasSize(1)))
                        .andExpect(jsonPath("$[0].name", is(recipes.getName())));
            }
}
