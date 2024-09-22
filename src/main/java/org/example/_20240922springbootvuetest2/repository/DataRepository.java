package org.example._20240922springbootvuetest2.repository;

import org.example._20240922springbootvuetest2.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
