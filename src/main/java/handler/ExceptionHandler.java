package handler;

import com.alibaba.fastjson.JSON;
import com.another.base.entity.Json;
import com.another.base.common.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Zero on 2016/6/29.
 */
public class ExceptionHandler implements HandlerExceptionResolver {

    Logger logger = Logger.getLogger(this.getClass());

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o, Exception e) {
        Json json = new Json();
        json.setCode(ResultCode.FAILURE_CODE).setMsg(e.getMessage());
        try {
            logger.error(JSON.toJSONString(json));
            response.getWriter().write(JSON.toJSONString(json));
            response.getWriter().flush();
        }catch (Exception ex){
            logger.error(ex);
        }
        return null;
    }
}
