package com.icai.alertas.mvc.service;

import com.icai.alertas.mvc.model.CryptoPrice;
import com.icai.alertas.mvc.repository.CryptoPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CryptoPriceService {

    @Autowired
    private CryptoPriceRepository cryptoPriceRepository;

    public List<CryptoPrice> getAllPrices() {

        return cryptoPriceRepository.findAll();
    }

    public List<CryptoPrice> getPricesBySymbol(String symbol) {

        return cryptoPriceRepository.findBySymbol(symbol);
    }

    public CryptoPrice savePrice(CryptoPrice cryptoPrice) {

        return cryptoPriceRepository.save(cryptoPrice);
    }
    public CryptoPrice updatePrice(Long id, CryptoPrice updatedPrice) {
        return cryptoPriceRepository.findById(id).map(existingPrice -> {
            existingPrice.setPrice(updatedPrice.getPrice());
            existingPrice.setTimestamp(updatedPrice.getTimestamp()); // Actualiza la fecha
            return cryptoPriceRepository.save(existingPrice);
        }).orElseThrow(() -> new RuntimeException("CryptoPrice no encontrado con id: " + id));
    }



    public boolean deletePrice(Long id) {
        if(cryptoPriceRepository.existsById(id)){
            cryptoPriceRepository.deleteById(id);
            return true;
        }
        return false; //SI NO EXISTE EL ID
    }
}
