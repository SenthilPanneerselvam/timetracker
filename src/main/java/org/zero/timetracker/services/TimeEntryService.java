package org.zero.timetracker.services;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zero.timetracker.dtos.TimeEntryDTO;
import org.zero.timetracker.entities.TimeEntry;
import org.zero.timetracker.repositories.TimeEntryRepository;

@Service
public class TimeEntryService {
	
	@Autowired
	DozerBeanMapper mapper;
	
	@Autowired
	TimeEntryRepository repo;
	
	/**
	 * Method to save the time entry. The structure of the table can be viewed in {@code TimeEntry}.
	 * The only business logic is to calculate the duration if not provided by the client.
	 * The duration is assumed to be in integer as we assume entries for individual days.
	 * 
	 * @param entry
	 * @return true if success, false in case of exception
	 */
	public boolean saveTimeEntry(TimeEntryDTO entry) {
		if(entry.getDuration() == null) {
			entry.setDuration(entry.getEndMillis().intValue() - entry.getStartMillis().intValue());
		}
		TimeEntry entity = mapper.map(entry, TimeEntry.class);
		repo.save(entity);
		return true;
	}
	
	public List<TimeEntryDTO> getEntries() {
		List<TimeEntry> entities = repo.findAll();
		List<TimeEntryDTO> results = new ArrayList<>();
		entities.forEach(entry -> results.add(mapper.map(entry, TimeEntryDTO.class)));
		return results;
	}

}
