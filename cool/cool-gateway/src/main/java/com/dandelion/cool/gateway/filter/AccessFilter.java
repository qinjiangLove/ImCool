package com.dandelion.cool.gateway.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Mr.QinJiang
 * @create: 2019-03-08 17:28
 * @description: 访问跨域设置
 **/
public class AccessFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletRequest;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, client_id, uuid, Authorization");
        /** 支持HTTP 1.1.  **/
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        /** 支持HTTP 1.0. response.setHeader("Expires", "0");**/
        response.setHeader("Pragma", "no-cache");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
