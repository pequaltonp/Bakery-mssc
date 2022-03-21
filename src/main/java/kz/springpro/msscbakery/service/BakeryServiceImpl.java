package kz.springpro.msscbakery.service;

import kz.springpro.msscbakery.web.model.BakeryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Slf4j
@Service
public class BakeryServiceImpl implements BakeryService {

    @Override
    public BakeryDto getBakeryById(UUID id) {
        return BakeryDto.builder().id(UUID.randomUUID()).name("bun").calorie(511.12).typeOfProduct("BakeryProduct").build();
    }

    @Override
    public BakeryDto saveBakeryDTO(BakeryDto bakeryDto) {
        return BakeryDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void deleteBakeryById(UUID bakeryId) {
        log.debug("Delete bakery by id " + bakeryId);
    }

    @Override
    public void updateBakeryDTO(UUID id, BakeryDto bakeryDto) {
        //todo
    }
}
