package com.another.base.common;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Another on 2016/9/26.
 * 接口Util
 */
public class HttpUtil {

    public static Properties properties = new Properties();

     static {
        InputStream is = HttpUtil.class.getResourceAsStream("/gps.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> void display(T t) {
        System.out.println(t.getClass());
    }

    public static String doGet(String path, Map<String, Object> map) throws IllegalStateException, IOException {
        // ====================GET方式调用======================================
        StringBuffer param = new StringBuffer("");
        if (map != null) {
            param.append("?");
            for (String key : map.keySet()) {
                param.append(key+"="+map.get(key)+"&");
            }
        }
        HttpClient httpclient = HttpClients.createDefault();
        HttpGet httpgets = new HttpGet(path + param);
        String result = null;
        HttpResponse response = httpclient.execute(httpgets);
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                InputStream instreams = entity.getContent();
                result = convertStreamToString(instreams);
                System.out.println(result);
                httpgets.abort();
            }
        }
        return result;
    }

    public static String doPost(String path, Object param) throws IllegalStateException, IOException {
        // ====================POST方式调用=====================
        String result = "";
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(path);//目标地址

        // 设置值： username=admin&password=1234567
        List<NameValuePair> postParameters = new ArrayList<NameValuePair>();
        //这里使用map来存储请求的数据，因为fastjson可以使对象转换为json字符串
        /*Map<String, String> map = new HashMap<String, String>();
        map.put("username", "admin");
        map.put("userpwd", "1234567");*/

        //params的值就是对应用户名和密码，也就是map,而在服端则需要根据params来获取值
        postParameters.add(new BasicNameValuePair("params", JSON.toJSONString(param)));
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(postParameters, "utf-8");
        httpPost.setEntity(formEntity);
        HttpResponse response = httpclient.execute(httpPost);//执行请求

        if (response.getStatusLine().getStatusCode() == 200) {//如果返回200状态代表成功
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instreams = entity.getContent();
                result = convertStreamToString(instreams);//服务端返回字符流，值需要解析它就获取字符串
                System.out.println(result);//如果返回的字符串是json格式的，就需要用解析json的方法解析
                httpPost.abort();
            }
        }
        return result;
    }

    /**
     * 流文件转换成String
     *
     * @param inputStream
     * @return String
     */
    public static String convertStreamToString(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int len = 0;
        StringBuffer result = new StringBuffer();
        if (inputStream != null) {
            try {
                while ((len = inputStream.read(data)) != -1) {
                    outputStream.write(data, 0, len);
                }
                result = result.append(new String(outputStream.toByteArray(), "UTF-8"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result.toString();
    }
}
