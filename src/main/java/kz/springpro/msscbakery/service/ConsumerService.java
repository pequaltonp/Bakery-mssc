package kz.springpro.msscbakery.service;

import kz.springpro.msscbakery.web.model.BakeryDto;
import kz.springpro.msscbakery.web.model.ConsumerDTO;

import java.util.UUID;

public interface ConsumerService {
    ConsumerDTO getConsumerById(UUID id);

}
