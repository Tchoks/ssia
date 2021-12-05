package com.tchokonthe.ssia.repository;

import com.tchokonthe.ssia.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author martin
 * @created on 23/11/2021 at 01:02
 * @project com.tchokonthe.ssia.repository
 * @email (martin.aurele12 @ gmail.com)
 */

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
