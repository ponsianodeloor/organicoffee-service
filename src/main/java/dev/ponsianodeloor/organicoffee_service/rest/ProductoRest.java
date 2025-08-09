package dev.ponsianodeloor.organicoffee_service.rest;

import dev.ponsianodeloor.organicoffee_service.model.Producto;
import dev.ponsianodeloor.organicoffee_service.service.ProductoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Producto", description = "API para gestionar productos")
@RestController
@RequestMapping("/api/v1.0/productos")
@CrossOrigin(origins = {"*"})
@RequiredArgsConstructor
public class ProductoRest {
  @Autowired
  private ProductoService productoService;

  @GetMapping("/{id}")
  public ResponseEntity<Producto> getById(@PathVariable("id") Long id) {
    Producto producto = productoService.getById(id);
    return ResponseEntity.ok(producto);
  }

  @GetMapping("/uuid/{uuid}")
  public ResponseEntity<Producto> getByUuid(@PathVariable("uuid") String uuid) {
    Producto producto = productoService.getByUuid(uuid);
    return ResponseEntity.ok(producto);
  }

}
