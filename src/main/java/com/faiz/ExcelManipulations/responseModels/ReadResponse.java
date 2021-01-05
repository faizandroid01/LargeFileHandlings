package com.faiz.ExcelManipulations.responseModels;

public class ReadResponse {

	int rowCount;
	long timeInSec;

	public ReadResponse(int totalRecords, long timeInSec) {
		this.rowCount = totalRecords;
		this.timeInSec = timeInSec;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public long getTimeInSec() {
		return timeInSec;
	}

	public void setTimeInSec(long timeInSec) {
		this.timeInSec = timeInSec;
	}


}
