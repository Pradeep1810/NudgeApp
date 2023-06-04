package com.nudgeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nudgeapp.entities.Nudge;
import com.nudgeapp.payloads.NudgeDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/v")
@Tag(name = "Nudge API", description = "Endpoints for managing nudges")
public class NudgeController {

	@Autowired
	ObjectMapper objectMap;

	@PostMapping("/nudge")
	@Operation(summary = "Add a new nudge")
    @ApiResponse(
            responseCode = "200",
            description = "Nudge added successfully",
            content = @Content(schema = @Schema(implementation = NudgeDto.class)))
	public ResponseEntity<NudgeDto> addNudge(@RequestParam("nudgeImage") MultipartFile file,
			@RequestParam("nudgeDto") String nudgeDto, @RequestParam("nudgeIcon") MultipartFile file2)
			throws JsonMappingException, JsonProcessingException {

		NudgeDto event = this.objectMap.readValue(nudgeDto, NudgeDto.class);

		if (!file.isEmpty() && !file2.isEmpty()) {

			//String imgName = this.fileService.uploadFile(path, file);

		}
		
		return null;
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get a nudge by ID")
    @ApiResponse(
            responseCode = "200",
            description = "Nudge retrieved successfully",
            content = @Content(schema = @Schema(implementation = NudgeDto.class))
    )
	public ResponseEntity<NudgeDto> getNudge(@PathVariable("id") Integer id) {
		// Implementation omitted

		return null;
	}

	@PutMapping("/{id}")
    @Operation(summary = "Update a nudge by ID")
    @ApiResponse(
            responseCode = "200",
            description = "Nudge updated successfully",
            content = @Content(schema = @Schema(implementation = NudgeDto.class))
    )
	public ResponseEntity<NudgeDto> updateNudge(@PathVariable("id") String id, @RequestBody Nudge nudge) {
		return null;
		// Implementation omitted
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Delete a nudge by ID")
    @ApiResponse(
            responseCode = "200",
            description = "Nudge deleted successfully"
    )
	public ResponseEntity<String> deleteNudge(@PathVariable("id") Integer id) {
		return null;
		// Implementation omitted
	}

}
