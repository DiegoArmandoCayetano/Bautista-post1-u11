package com.proweb.catalogo.factory;

import com.proweb.catalogo.dto.ProductoRequestDTO;
import com.proweb.catalogo.dto.ProductoResponseDTO;
import com.proweb.catalogo.entity.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoFactory {
    public Producto toEntity(ProductoRequestDTO dto) {
        Producto p = new Producto();
        p.setNombre(dto.getNombre());
        p.setPrecio(dto.getPrecio());
        p.setCategoria(dto.getCategoria());
        return p;
    }

    public ProductoResponseDTO toResponseDTO(Producto p) {
        ProductoResponseDTO dto = new ProductoResponseDTO();
        dto.setId(p.getId());
        dto.setNombre(p.getNombre());
        dto.setPrecio(p.getPrecio());
        dto.setCategoria(p.getCategoria());
        return dto;
    }
}
