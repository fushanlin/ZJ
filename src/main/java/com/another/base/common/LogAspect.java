package com.another.base.common;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zero on 2016/5/31.
 */
@Aspect
public class LogAspect {

    private Logger logger = null;

    private String requestPath = null ; // 请求地址
    private String userName = null ; // 用户名
    private Map<?,?> inputParamMap = null ; // 传入参数
    private Map<String, Object> outputParamMap = null; // 存放输出结果
    private Object returned;
    private String clasz;               //路径
    private String clientIp;            //客户端IP
    private long startTimeMillis = 0; // 开始时间
    private long endTimeMillis = 0; // 结束时间
    private String macAdress;

    /**
     *
     * @Title：doBeforeInServiceLayer
     * @Description: 方法调用前触发
     *  记录开始时间
     * @param joinPoint
     */
    @Before("execution(* com.another.*.controller..*.*(..))")
    public void doBeforeInServiceLayer(JoinPoint joinPoint) {
        startTimeMillis = System.currentTimeMillis(); // 记录方法开始执行的时间
    }

    /**
     *
     * @Title：doAfterInServiceLayer
     * @Description: 方法调用后触发
     *  记录结束时间
     * @param joinPoint
     */
    @After("execution(* com.another.*.controller..*.*(..))")
    public void doAfterInServiceLayer(JoinPoint joinPoint) {
        endTimeMillis = System.currentTimeMillis(); // 记录方法执行完成的时间
        this.printOptLog();
    }

    /**
     *
     * @Title：doAround
     * @Description: 环绕触发
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.another.*.controller..*.*(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        /**
         * 1.获取request信息
         * 2.根据request获取session
         * 3.从session中取出登录用户信息
         */
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;
        HttpServletRequest request = sra.getRequest();

        // 获取输入参数
        inputParamMap = request.getParameterMap();
        // 获取请求地址
        requestPath = request.getRequestURI();

        clientIp = request.getRemoteHost();

        macAdress = request.getRemoteAddr();

        userName = request.getRemoteUser();

        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        outputParamMap = new HashMap<String, Object>();

        Object result = pjp.proceed();// result的值就是被拦截方法的返回值

        returned = result;

        Signature signature = pjp.getSignature();

        clasz = signature.toString();

        return result;
    }


    /**
     *
     * @Title：printOptLog
     * @Description: 输出日志
     */
    private void printOptLog() {
        String optTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTimeMillis);
        if(StaticResource.devMode) {
            if (clasz != null) {
                logger = Logger.getLogger(clasz);

                logger.info(" user：" + userName
                        + "  URI：" + requestPath + ";" + "\t\t" + " OP_TIME：" + optTime + "\t PRO_TIME：" + (endTimeMillis - startTimeMillis) + "ms ;" + "\t\t"
                        + " ClientIp: " + clientIp + "\t\t"
                        + " Param：" + JSON.toJSONStringWithDateFormat(inputParamMap, "yyyy-MM-dd") + ";" + "\n"
                        + " Result：" + JSON.toJSONStringWithDateFormat(returned, "yyyy-MM-dd"));
            }else {
                logger = Logger.getLogger(this.getClass());
                logger.info("error!");
            }
        }
    }
}
