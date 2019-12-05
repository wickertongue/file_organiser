package com.hayden.file_organiser.repositories;

import com.hayden.file_organiser.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
