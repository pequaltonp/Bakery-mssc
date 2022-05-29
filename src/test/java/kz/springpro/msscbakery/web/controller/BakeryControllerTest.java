package kz.springpro.msscbakery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import kz.springpro.msscbakery.web.model.BakeryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@WebMvcTest(BakeryController.class)
class BakeryControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBakery() throws Exception {
        mockMvc.perform(get("/api/bakery/"
                + UUID.randomUUID()).accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewBakery() throws Exception {
        BakeryDto bakeryDto = BakeryDto.builder().build();
        String bakeryDtoJson = objectMapper.writeValueAsString(bakeryDto);

        mockMvc.perform(post("/api/bakery")
                .contentType(MediaType.APPLICATION_JSON)
                .content(bakeryDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void handleUpdate() throws Exception {
        BakeryDto bakeryDto = BakeryDto.builder().build();
        String bakeryDtoJson = objectMapper.writeValueAsString(bakeryDto);

        mockMvc.perform(put("/api/bakery/" + UUID.randomUUID())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(bakeryDtoJson))
                .andExpect(status().isNoContent());
    }
}