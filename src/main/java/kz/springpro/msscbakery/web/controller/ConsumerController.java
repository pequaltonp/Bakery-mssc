package kz.springpro.msscbakery.web.controller;

import kz.springpro.msscbakery.service.ConsumerService;
import kz.springpro.msscbakery.web.model.BakeryDto;
import kz.springpro.msscbakery.web.model.ConsumerDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity handleConsumer(@RequestBody ConsumerDTO consumerDTO) {
        ConsumerDTO savedConsumerDTO = consumerService.saveConsumer(consumerDTO);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/consumer"
                        + savedConsumerDTO.getId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);

    }

    @PutMapping("/{consumerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("consumerId") UUID consumerId, @RequestBody ConsumerDTO consumerDTO) {
        consumerService.updateConsumerDTO(consumerId, consumerDTO);

    }

    @DeleteMapping("/{consumerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("consumerId") UUID consumerId) {
        consumerService.deleteConsumerById(consumerId);
    }
}
