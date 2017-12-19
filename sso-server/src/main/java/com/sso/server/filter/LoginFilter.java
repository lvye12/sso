package com.sso.server.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by BISHUILANTIAN on 2017/12/19.
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {


        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession();

        // 已经登录，放行
        if (session.getAttribute("isLogin") != null) {
            chain.doFilter(req, res);
            return;
        }

        // TODO: 2017/12/19  拦截具体接口

    }

    @Override
    public void destroy() {

    }
}
