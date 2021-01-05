package com.faiz.ExcelManipulations.models;

public class ReorgModel {

	private String oldMD;
	private String oldDept;
	private String oldRegion;
	private String oldDiv;
	private String oldSubDiv;
	private String oldCluster;
	private String oldSubCluster;
	private String oldBook;
	private String newMD;
	private String newDept;
	private String newRegion;
	private String newDiv;
	private String newSubDiv;
	private String newCluster;
	private String newSubCluster;
	private String newBook;

	public ReorgModel() {
	}

	public ReorgModel(String oldMD, String oldDept, String oldRegion, String oldDiv, String oldSubDiv,
			String oldCluster, String oldSubCluster, String oldBook, String newMD, String newDept, String newRegion,
			String newDiv, String newSubDiv, String newCluster, String newSubCluster, String newBook) {
		super();
		this.oldMD = oldMD;
		this.oldDept = oldDept;
		this.oldRegion = oldRegion;
		this.oldDiv = oldDiv;
		this.oldSubDiv = oldSubDiv;
		this.oldCluster = oldCluster;
		this.oldSubCluster = oldSubCluster;
		this.oldBook = oldBook;
		this.newMD = newMD;
		this.newDept = newDept;
		this.newRegion = newRegion;
		this.newDiv = newDiv;
		this.newSubDiv = newSubDiv;
		this.newCluster = newCluster;
		this.newSubCluster = newSubCluster;
		this.newBook = newBook;
	}

	public String getOldMD() {
		return oldMD;
	}

	public void setOldMD(String oldMD) {
		this.oldMD = oldMD;
	}

	public String getOldDept() {
		return oldDept;
	}

	public void setOldDept(String oldDept) {
		this.oldDept = oldDept;
	}

	public String getOldRegion() {
		return oldRegion;
	}

	public void setOldRegion(String oldRegion) {
		this.oldRegion = oldRegion;
	}

	public String getOldDiv() {
		return oldDiv;
	}

	public void setOldDiv(String oldDiv) {
		this.oldDiv = oldDiv;
	}

	public String getOldSubDiv() {
		return oldSubDiv;
	}

	public void setOldSubDiv(String oldSubDiv) {
		this.oldSubDiv = oldSubDiv;
	}

	public String getOldCluster() {
		return oldCluster;
	}

	public void setOldCluster(String oldCluster) {
		this.oldCluster = oldCluster;
	}

	public String getOldSubCluster() {
		return oldSubCluster;
	}

	public void setOldSubCluster(String oldSubCluster) {
		this.oldSubCluster = oldSubCluster;
	}

	public String getOldBook() {
		return oldBook;
	}

	public void setOldBook(String oldBook) {
		this.oldBook = oldBook;
	}

	public String getNewMD() {
		return newMD;
	}

	public void setNewMD(String newMD) {
		this.newMD = newMD;
	}

	public String getNewDept() {
		return newDept;
	}

	public void setNewDept(String newDept) {
		this.newDept = newDept;
	}

	public String getNewRegion() {
		return newRegion;
	}

	public void setNewRegion(String newRegion) {
		this.newRegion = newRegion;
	}

	public String getNewDiv() {
		return newDiv;
	}

	public void setNewDiv(String newDiv) {
		this.newDiv = newDiv;
	}

	public String getNewSubDiv() {
		return newSubDiv;
	}

	public void setNewSubDiv(String newSubDiv) {
		this.newSubDiv = newSubDiv;
	}

	public String getNewCluster() {
		return newCluster;
	}

	public void setNewCluster(String newCluster) {
		this.newCluster = newCluster;
	}

	public String getNewSubCluster() {
		return newSubCluster;
	}

	public void setNewSubCluster(String newSubCluster) {
		this.newSubCluster = newSubCluster;
	}

	public String getNewBook() {
		return newBook;
	}

	public void setNewBook(String newBook) {
		this.newBook = newBook;
	}

	@Override
	public String toString() {
		return "ReorgModel [oldMD=" + oldMD + ", oldDept=" + oldDept + ", oldRegion=" + oldRegion + ", oldDiv=" + oldDiv
				+ ", oldSubDiv=" + oldSubDiv + ", oldCluster=" + oldCluster + ", oldSubCluster=" + oldSubCluster
				+ ", oldBook=" + oldBook + ", newMD=" + newMD + ", newDept=" + newDept + ", newRegion=" + newRegion
				+ ", newDiv=" + newDiv + ", newSubDiv=" + newSubDiv + ", newCluster=" + newCluster + ", newSubCluster="
				+ newSubCluster + ", newBook=" + newBook + "]";
	}

}
