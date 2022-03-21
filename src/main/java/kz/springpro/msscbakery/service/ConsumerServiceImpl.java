package kz.springpro.msscbakery.service;

import kz.springpro.msscbakery.web.model.BakeryDto;
import kz.springpro.msscbakery.web.model.ConsumerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void deleteConsumerById(UUID consumerId) {
    }

    @Override
    public ConsumerDTO getConsumerById(UUID id) {
        return ConsumerDTO.builder().id(UUID.randomUUID()).fullName("Alexey Smirnov").companyName("Kulikovsky").build();
    }

    @Override
    public ConsumerDTO saveConsumer(ConsumerDTO consumerDTO) {
        return ConsumerDTO.builder().id(UUID.randomUUID()).fullName(consumerDTO.getFullName()).build();
    }

    @Override
    public void updateConsumerDTO(UUID consumerId, ConsumerDTO consumerDTO) {
        log.debug("Delete consumer by " + consumerId);
    }
}
