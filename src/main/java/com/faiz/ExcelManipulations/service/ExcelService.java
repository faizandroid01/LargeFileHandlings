package com.faiz.ExcelManipulations.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.faiz.ExcelManipulations.models.ReorgModel;
import com.faiz.ExcelManipulations.responseModels.ReadResponse;
import com.faiz.ExcelManipulations.utilities.Utility;

@Service
public class ExcelService {

	private int parseCsv(String filePath) throws IOException {

		List<ReorgModel> dataList = new ArrayList<ReorgModel>();

		ReorgModel reorgModel = null;
		String line;

		//String basepath = System.getProperty("user.dir");
//		System.out.println(basepath);

		// File file = new File(basepath+"\\"+filePath);
		File file = new File(filePath);

//		System.out.println("exists :"+file.exists());
//		System.out.println("isReadbale :"+file.canRead());
//		System.out.println("FileName :"+file.getName());
//		System.out.println("Absolute Path :"+file.getAbsolutePath());
//		System.out.println("Path :"+file.getPath());
//		System.out.println("length :"+filePath.getBytes());

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
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
		
		ReorgModel r = dataList.get(1);
		
		System.out.println(r.toString());

		return dataList.size();
	}

	public ReadResponse readBigFileFromPath(int inLakh) throws IOException {

		String filePath = null;
		if (1 == inLakh) {
			filePath = Utility.read1LakhData();
		} else {
			filePath = Utility.read10LakhData();
		}

		long begin = System.currentTimeMillis();

		int totalRecords = parseCsv(filePath);

		return new ReadResponse(totalRecords, (System.currentTimeMillis() - begin) / 1000);
	}

}
