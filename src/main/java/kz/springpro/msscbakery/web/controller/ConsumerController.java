package kz.springpro.msscbakery.web.controller;

import kz.springpro.msscbakery.service.ConsumerService;
import kz.springpro.msscbakery.web.model.BakeryDto;
import kz.springpro.msscbakery.web.model.ConsumerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/consumer")
public class ConsumerController {

    private final ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/{consumerId}")
    public ResponseEntity<ConsumerDTO> getBakery(@PathVariable("consumerId") UUID bakeryId) {
        return new ResponseEntity<>(consumerService.getConsumerById(bakeryId), HttpStatus.OK);
    }
}
