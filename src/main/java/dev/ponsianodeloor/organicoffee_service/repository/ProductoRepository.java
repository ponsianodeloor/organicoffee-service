package dev.ponsianodeloor.organicoffee_service.repository;

import dev.ponsianodeloor.organicoffee_service.model.Producto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar productos por nombre o precio

    Optional<Producto> findByUuid(String uuid);


    Optional<Producto> findByProducto(String producto);
    // List<Producto> findByValorSinIvaBetween(BigDecimal min, BigDecimal max);


}
