package com.muditasoft.springbootsecuritybasics.repository;

import com.muditasoft.springbootsecuritybasics.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
