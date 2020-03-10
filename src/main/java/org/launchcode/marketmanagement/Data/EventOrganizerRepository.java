package org.launchcode.marketmanagement.Data;

import org.launchcode.marketmanagement.models.EventOrganizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventOrganizerRepository extends CrudRepository<EventOrganizer, Integer> {
}
