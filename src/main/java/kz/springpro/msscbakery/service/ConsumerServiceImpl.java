package kz.springpro.msscbakery.service;

import kz.springpro.msscbakery.web.model.BakeryDto;
import kz.springpro.msscbakery.web.model.ConsumerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsumerServiceImpl implements ConsumerService{
    @Override
    public ConsumerDTO getConsumerById(UUID id) {
        return ConsumerDTO.builder().id(UUID.randomUUID())
                .fullName("Alexey Smirnov")
                .companyName("Kulikovsky")
                .build();
    }
}
