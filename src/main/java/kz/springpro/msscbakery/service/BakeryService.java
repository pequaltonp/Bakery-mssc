package kz.springpro.msscbakery.service;

import kz.springpro.msscbakery.web.model.BakeryDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BakeryService {

    BakeryDto getBakeryById(UUID id);

    BakeryDto saveBakeryDTO(BakeryDto bakeryDto);

    void updateBakeryDTO(UUID id, BakeryDto bakeryDto);
}
