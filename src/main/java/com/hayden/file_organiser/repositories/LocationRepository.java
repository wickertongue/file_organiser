package com.hayden.file_organiser.repositories;

import com.hayden.file_organiser.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
