package com.faiz.ExcelManipulations.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.faiz.ExcelManipulations.responseModels.ReadResponse;
import com.faiz.ExcelManipulations.service.ExcelService;
import com.faiz.ExcelManipulations.service.MultipartExcelService;

@RestController
public class ExcelController {

	@GetMapping(value = "/")
	public String applicationStartup() {
		return "Hello World";
	}

	@Autowired
	private MultipartExcelService multipartExcelService;

	@Autowired
	private ExcelService excelService;

	/**
	 * Used to read data from ui.
	 */
	@PostMapping(value = "/readDataFromExcels", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE }, produces = "application/json")
	public ReadResponse readLargeExcel(@RequestParam(value = "files") MultipartFile[] files) throws IOException {
		return multipartExcelService.readFromMultipleExcels(files);
	}

	@GetMapping(value = "/readData/{inLakh}", produces = "application/json")
	public ReadResponse readData(@PathVariable("inLakh") int inLakh) throws IOException {
		return excelService.readBigFileFromPath(inLakh);
	}

	

}
