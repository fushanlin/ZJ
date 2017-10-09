package com.another.upload.util;

import com.aliyun.oss.OSSClient;
import com.zero.tools.PushMessageUtil;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class OSSClientUtil {

    private static Logger logger = Logger.getLogger(OSSClientUtil.class);

    public static String endpoint = "";
    public static String accessKeyId = "";
    public static String accessKeySecret = "";
    public static String urlbase = "";
    private static final String bucketName="wiyarn";


    static {
        try {
            Properties e = new Properties();
            FileInputStream inputStream = new FileInputStream(PushMessageUtil.class.getResource("/oss.properties").getFile());
            e.load(inputStream);
            endpoint = e.getProperty("endpoint");
            accessKeyId = e.getProperty("accessKeyId");
            accessKeySecret = e.getProperty("accessKeySecret");
            urlbase = e.getProperty("urlbase");

        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }


    /**
     * 文件上传
     * @param is
     * @return
     */
    public String uploadImg2Oss(InputStream is, String fileName) {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        String url = "";
        ossClient.putObject(bucketName, fileName, is);
        url = urlbase + fileName;
        ossClient.shutdown();
        try {
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }

    /**
     * 文件上传
     * @param is
     * @return
     */
    public String wizardUploadImg(InputStream is, String fileName) {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        String url = "";
        ossClient.putObject(bucketName, "wizard/"+fileName, is);
        // 设置URL过期时间为10年  3600l* 1000*24*365*10
        Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 10);
        // 生成URL
        URL Url = ossClient.generatePresignedUrl(bucketName, "wizard/"+fileName, expiration);
        url = Url.toString();
        try {
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }

    /**
     * 删除文件
     * @param key
     */
    public void deleteImg2Oss(String key){
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try{
            ossClient.deleteObject(bucketName, key);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("删除OSS文件失败",e);
        }finally {
            ossClient.shutdown();
        }
    }

    public List<String> uploadImg2Oss(List<MultipartFile> files , String folder){
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        List<String> Urls = new ArrayList<String>();
        for(MultipartFile file : files){
            InputStream is = null;
            try {
                is = file.getInputStream();
                String uuid = UUID.randomUUID().toString();
                String newext = FileType.getFileByFile(is); //获取文件扩展名
                if(newext != null){
                    String fileName = folder + uuid +"."+ newext;
                    is = file.getInputStream();
                    ossClient.putObject(bucketName, fileName, is);
                    fileName = urlbase + fileName;
                    Urls.add(fileName);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        ossClient.shutdown();
        return Urls;
    }

}
