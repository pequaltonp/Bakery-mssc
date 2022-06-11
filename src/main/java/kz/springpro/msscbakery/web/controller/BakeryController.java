package kz.springpro.msscbakery.web.controller;

import kz.springpro.msscbakery.service.BakeryService;
import kz.springpro.msscbakery.service.BakeryServiceImpl;
import kz.springpro.msscbakery.web.model.BakeryDto;
import kz.springpro.msscbakery.web.model.BakeryTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/bakery")
public class BakeryController {

    private final BakeryService bakeryService;

    public BakeryController(BakeryServiceImpl bakeryService) {
        this.bakeryService = bakeryService;
    }

    @GetMapping("/{bakeryId}")
    public ResponseEntity<BakeryDto> getBakery(@PathVariable("bakeryId") UUID bakeryId) {
        return new ResponseEntity<>(BakeryDto.builder()
                .id(UUID.randomUUID())
                .name("bun")
                .calorie(511.12)
                .bakeryType(BakeryTypeEnum.CAKE)
                .upc(Double.doubleToLongBits(Math.random()))
                .build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBakery(@RequestBody BakeryDto bakeryDto) {
        BakeryDto savedBakeryDto = bakeryService.saveBakeryDTO(bakeryDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/bakery/" +
                savedBakeryDto.getId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{bakeryId}")
    public ResponseEntity handleUpdate(@PathVariable("bakeryId") UUID bakeryId,
                                       @RequestBody BakeryDto bakeryDto) {
        bakeryService.updateBakeryDTO(bakeryId, bakeryDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{bakeryId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBakery(@PathVariable("bakeryId") UUID bakeryId) {
        bakeryService.deleteBakeryById(bakeryId);
    }
}
