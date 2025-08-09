package dev.ponsianodeloor.organicoffee_service.service;

import dev.ponsianodeloor.organicoffee_service.model.Producto;
import dev.ponsianodeloor.organicoffee_service.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ProductoService {
  @Autowired
  private ProductoRepository productoRepository;

  public Producto getById(Long id) {
    return productoRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Producto no encontrado con id: " + id
        ));
  }

  public Producto getByUuid(String uuid) {
    return productoRepository.findByUuid(uuid)
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Producto no encontrado con UUID: " + uuid
        ));
  }

}
