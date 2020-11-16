package com.atlanticprogrammers.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atlanticprogrammers.bankapplication.model.Details;
import com.atlanticprogrammers.bankapplication.model.DetailsId;

public interface DetailsRepository extends JpaRepository<Details, DetailsId> {

}
