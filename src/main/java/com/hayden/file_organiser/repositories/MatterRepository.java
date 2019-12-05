package com.hayden.file_organiser.repositories;

import com.hayden.file_organiser.models.Matter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatterRepository extends JpaRepository<Matter, Long> {
}
