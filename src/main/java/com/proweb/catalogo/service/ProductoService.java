package com.proweb.catalogo.service;

import com.proweb.catalogo.dto.ProductoRequestDTO;
import com.proweb.catalogo.dto.ProductoResponseDTO;
import java.util.List;

public interface ProductoService {
    ProductoResponseDTO crear(ProductoRequestDTO dto);

    ProductoResponseDTO buscarPorId(Long id);

    List<ProductoResponseDTO> listarActivos();

    void eliminar(Long id);
}
