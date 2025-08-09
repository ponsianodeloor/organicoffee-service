package dev.ponsianodeloor.organicoffee_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "ventas")
public class Producto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50)
  private String uuid;

  @Column(length = 50)
  private String producto;

  @Column(name = "valor_sin_iva", precision = 12, scale = 4)
  private BigDecimal valorSinIva;

  @Column(precision = 12, scale = 4)
  private BigDecimal iva;

  @Column(name = "valor_incl_iva")
  private BigDecimal valorInclIva;

  @Column(name = "iva_porcentaje")
  private Integer ivaPorcentaje;

  public Producto() {}

  public Producto(Long id, String uuid, String producto, BigDecimal valorSinIva, BigDecimal iva, BigDecimal valorInclIva, Integer ivaPorcentaje) {
    this.id = id;
    this.uuid = uuid;
    this.producto = producto;
    this.valorSinIva = valorSinIva;
    this.iva = iva;
    this.valorInclIva = valorInclIva;
    this.ivaPorcentaje = ivaPorcentaje;
  }



}
