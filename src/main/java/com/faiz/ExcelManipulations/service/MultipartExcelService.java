package com.faiz.ExcelManipulations.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.faiz.ExcelManipulations.models.ReorgModel;
import com.faiz.ExcelManipulations.responseModels.ReadResponse;

@Service
public class MultipartExcelService {

	public int parseCsv(MultipartFile file) throws IOException {

		List<ReorgModel> dataList = new ArrayList<ReorgModel>();

		BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()));

		ReorgModel reorgModel = null;

		String line;
		while ((line = br.readLine()) != null) {

			String[] data = line.split(",");
			if (data != null) {

				reorgModel = new ReorgModel(String.valueOf(data[0]), String.valueOf(data[1]), String.valueOf(data[2]),
						String.valueOf(data[3]), String.valueOf(data[4]), String.valueOf(data[5]),
						String.valueOf(data[6]), String.valueOf(data[7]), String.valueOf(data[8]),
						String.valueOf(data[9]), String.valueOf(data[10]), String.valueOf(data[11]),
						String.valueOf(data[12]), String.valueOf(data[13]), String.valueOf(data[14]),
						String.valueOf(data[15]));

				dataList.add(reorgModel);

				reorgModel = null;
			}
		}

		br.close();

		return dataList.size();
	}

	public ReadResponse readFromMultipleExcels(MultipartFile[] files) throws IOException {

		long begin = System.currentTimeMillis();

		int totalRecords = 0;
		for (MultipartFile multipartFile : files) {
			totalRecords = totalRecords + parseCsv(multipartFile);
		}

		return new ReadResponse(totalRecords, (System.currentTimeMillis() - begin) / 1000);

	}

}
