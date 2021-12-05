package com.tchokonthe.ssia.service;

import com.tchokonthe.ssia.entities.Product;
import com.tchokonthe.ssia.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author martin
 * @created on 23/11/2021 at 01:03
 * @project com.tchokonthe.ssia.service
 * @email (martin.aurele12 @ gmail.com)
 */


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

}
