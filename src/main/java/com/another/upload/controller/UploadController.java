package com.another.upload.controller;  //创建并命名一个包

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.upload.entity.PageImage;
import com.another.upload.util.FileType;
import com.another.upload.util.OSSClientUtil;
import com.another.user.common.UserKey;
import com.another.user.common.UserMessage;
import com.another.user.entity.User;
import com.another.user.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * Created by Zero on 2016/5/30.
 */
@RestController            //注解控制器
@RequestMapping("/upload")//注解接口路劲
public class UploadController {

    @Autowired
    UserService userService;

    private Logger logger = Logger.getLogger(this.getClass());


    @RequestMapping(value = "/uploadImg",method = RequestMethod.POST)
    @ResponseBody
    public Json uploadImage(PageImage pageImage){
        Json json=new Json();
        OSSClientUtil ossClientUtil = new OSSClientUtil();
        String key = "";
        try{
            MultipartFile file = pageImage.getImage();
            if (file == null || file.getSize() <= 0) {
                throw new Exception("Image is null");
            }else {
                InputStream is = file.getInputStream();
                String uuid = UUID.randomUUID().toString();
                String newext = FileType.getFileByFile(is); //获取文件扩展名
                if(newext == null){
                    throw new RuntimeException("newext_error");
                }
                String fileName ="ZSImage/"+uuid +"."+ newext;
                key = fileName;
                is = file.getInputStream();
                String url = ossClientUtil.uploadImg2Oss(is, fileName);
                json.setCode(ResultCode.SUCCESS_CODE).setData(url);
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e);
            if(e.toString().contains("Image is null")){
                json.setMsg("图片不能为空");
            }else if(e.toString().contains("newext_error")){
                json.setMsg("文件不正确");
            }else {
                ossClientUtil.deleteImg2Oss(key);
                json.setMsg("上传失败");
            }
        }
        return json;
    }
}
