package org.zero.timetracker.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zero.timetracker.dtos.TimeEntryDTO;
import org.zero.timetracker.services.TimeEntryService;

@RestController
@RequestMapping("timeentry")
public class TimeEntryController {
	
	@Autowired
	private TimeEntryService service;

	@PostMapping()
	public void saveTimeEntry(@RequestBody TimeEntryDTO entry) {
		service.saveTimeEntry(entry);
	}
	
	@GetMapping
	public List<TimeEntryDTO> getEntries() {
		return service.getEntries();
	}
	
}
