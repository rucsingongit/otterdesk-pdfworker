package com.otterdesk.messagebus.pdfpngworker.model;


public class PdfData {

    private String blueprintId;
    //'5d5f044f-ea3b-4533-9f55-2e1a45b02aab'

    private String currentProcessingPhase;
    //'pdf_to_image',

    private String fileLocation;
    //'https://s3.us-east-2.amazonaws.com/someco.com/uploads/pdfs/74efe087-7949-46db-8a8d-ee06776eb2b0.pdf',

    private Long createTime;
    //'1544404634',

    private int pageNumber;


    public PdfData() {
    }

    public PdfData(String blueprintId, String currentProcessingPhase, String fileLocation, Long createTime, int pageNumber) {
        this.blueprintId = blueprintId;
        this.currentProcessingPhase = currentProcessingPhase;
        this.fileLocation = fileLocation;
        this.createTime = createTime;
        this.pageNumber = pageNumber;
    }

    public String getBlueprintId() {
        return blueprintId;
    }

    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    public String getCurrentProcessingPhase() {
        return currentProcessingPhase;
    }

    public void setCurrentProcessingPhase(String currentProcessingPhase) {
        this.currentProcessingPhase = currentProcessingPhase;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "PdfData{" +
                "blueprintId='" + blueprintId + '\'' +
                ", currentProcessingPhase='" + currentProcessingPhase + '\'' +
                ", fileLocation='" + fileLocation + '\'' +
                ", createTime=" + createTime +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
