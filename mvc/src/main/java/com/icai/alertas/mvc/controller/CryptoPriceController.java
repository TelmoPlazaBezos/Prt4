package com.icai.alertas.mvc.controller;

import com.icai.alertas.mvc.model.CryptoPrice;
import com.icai.alertas.mvc.service.CryptoPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/prices")
public class CryptoPriceController {
///crear un  map /lista
    @Autowired
    private CryptoPriceService cryptoPriceService;

    @GetMapping
    public List<CryptoPrice> getAllPrices() {
        return cryptoPriceService.getAllPrices();
    }

    @GetMapping("/{symbol}")
    public List<CryptoPrice> getPricesBySymbol(@PathVariable String symbol) {
        return cryptoPriceService.getPricesBySymbol(symbol);
    }

    @PostMapping
    public CryptoPrice savePrice(@RequestBody CryptoPrice cryptoPrice) {
        /*if (cryptoPrice.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            return ResponseEntity.badRequest().body("El precio debe ser mayor que 0");
        }*/
        return cryptoPriceService.savePrice(cryptoPrice);

    }

    @PutMapping("/{id}")
    public CryptoPrice updatePrice(@PathVariable Long id, @RequestBody CryptoPrice updatedPrice) {
        return cryptoPriceService.updatePrice(id, updatedPrice);
    }


    @DeleteMapping("/{id}")
    public String deletePrice(@PathVariable Long id){
        boolean deleted = cryptoPriceService.deletePrice(id);
        return deleted ? "Precio eliminado con éxito" : "Precio no encontrado";    }
}
