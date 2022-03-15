package kz.springpro.msscbakery.web.controller;

import kz.springpro.msscbakery.service.BakeryService;
import kz.springpro.msscbakery.web.model.BakeryDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/bakery")
public class BakeryController {

    private final BakeryService bakeryService;

    public BakeryController(BakeryService bakeryService) {
        this.bakeryService = bakeryService;
    }

    @GetMapping("/{bakeryId}")
    public ResponseEntity<BakeryDto> getBakery(@PathVariable("bakeryId") UUID bakeryId) {
        return new ResponseEntity<>(bakeryService.getBakeryById(bakeryId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handleBakery(@RequestBody BakeryDto bakeryDto) {
        BakeryDto savedBakeryDto = bakeryService.saveBakeryDTO(bakeryDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/bakery/" +
                bakeryDto.getId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{bakeryId}")
    public ResponseEntity handleUpdate(@PathVariable("bakeryId") UUID bakeryId,@RequestBody BakeryDto bakeryDto) {
        bakeryService.updateBakeryDTO(bakeryId, bakeryDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
