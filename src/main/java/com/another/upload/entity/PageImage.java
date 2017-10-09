package com.another.upload.entity;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class PageImage {
    private List<MultipartFile> images;
    private MultipartFile image;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public List<MultipartFile> getImages() {
        return images;
    }

    public void setImages(List<MultipartFile> images) {
        this.images = images;
    }
}
