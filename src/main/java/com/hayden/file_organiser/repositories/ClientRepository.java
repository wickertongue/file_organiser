package com.hayden.file_organiser.repositories;

import com.hayden.file_organiser.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
