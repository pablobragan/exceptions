package org.pbragan.exceptions.examples.model;

import java.util.Date;
import java.util.Objects;

public class Posting {

    private Integer postingId;
    private String title;
    private Price price;
    private RealestateTypeEnum realestateType;
    private OperationTypeEnum operationType;
    private PostingType postingType;
    private Publisher publisher;
    private Double quality;
    private StatusEnum status;
    private Date creationDate;
    private Date updateDate;

    public Posting(Integer postingId, String title, Price price, RealestateTypeEnum realestateType, OperationTypeEnum operationType, PostingType postingType, Publisher publisher, Double quality, StatusEnum status) {
        this.postingId = postingId;
        this.title = title;
        this.price = price;
        this.realestateType = realestateType;
        this.operationType = operationType;
        this.postingType = postingType;
        this.publisher = publisher;
        this.quality = quality;
        this.status = status;
    }

    public Posting(Integer postingId, String title, Price price, RealestateTypeEnum realestateType, OperationTypeEnum operationType, PostingType postingType, Double quality, StatusEnum status, Date creationDate) {
        this.postingId = postingId;
        this.title = title;
        this.price = price;
        this.realestateType = realestateType;
        this.operationType = operationType;
        this.postingType = postingType;
        this.quality = quality;
        this.status = status;
        this.creationDate = creationDate;
    }

    public Integer getPostingId() {
        return postingId;
    }

    public void setPostingId(Integer postingId) {
        this.postingId = postingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public RealestateTypeEnum getRealestateType() {
        return realestateType;
    }

    public void setRealestateType(RealestateTypeEnum realestateType) {
        this.realestateType = realestateType;
    }

    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public PostingType getPostingType() {
        return postingType;
    }

    public void setPostingType(PostingType postingType) {
        this.postingType = postingType;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posting posting = (Posting) o;
        return postingId.equals(posting.postingId) && title.equals(posting.title) && price.equals(posting.price) && realestateType == posting.realestateType && operationType == posting.operationType && postingType == posting.postingType && publisher.equals(posting.publisher) && quality.equals(posting.quality) && status == posting.status && creationDate.equals(posting.creationDate) && Objects.equals(updateDate, posting.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postingId, title, price, realestateType, operationType, postingType, publisher, quality, status, creationDate, updateDate);
    }

    @Override
    public String toString() {
        return "Posting{" +
                "postingId=" + postingId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", realestateType=" + realestateType +
                ", operationType=" + operationType +
                ", postingType=" + postingType +
                ", publisher=" + publisher +
                ", quality=" + quality +
                ", status=" + status +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
