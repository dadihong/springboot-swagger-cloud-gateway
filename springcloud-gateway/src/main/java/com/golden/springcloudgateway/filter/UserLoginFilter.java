package com.golden.springcloudgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
public class UserLoginFilter extends ZuulFilter {
    @Override
    public String filterType() {//设置过滤器类型:pre 请求被路由前执行
        return "pre";
    }

    @Override
    public int filterOrder() {

        return 0;//设置执行顺序
    }

    @Override
    public boolean shouldFilter() {
        return true;//该过滤器是否执行
    }

    @Override
    public Object run() throws ZuulException {//编写业务逻辑
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
