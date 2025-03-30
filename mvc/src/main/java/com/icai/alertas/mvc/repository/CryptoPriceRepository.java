package com.icai.alertas.mvc.repository;

import com.icai.alertas.mvc.model.CryptoPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
//lo he mantenido para hacer un get más específico por simbolo
@Repository
public interface CryptoPriceRepository extends JpaRepository<CryptoPrice, Long> {
    List<CryptoPrice> findBySymbol(String symbol);
}
