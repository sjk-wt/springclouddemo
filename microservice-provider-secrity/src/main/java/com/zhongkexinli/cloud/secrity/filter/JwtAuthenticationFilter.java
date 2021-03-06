package com.zhongkexinli.cloud.secrity.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;


public class JwtAuthenticationFilter extends OncePerRequestFilter {


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		 filterChain.doFilter(request, response);
	}
	
	
   /* private static final PathMatcher pathMatcher = new AntPathMatcher();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            if(isProtectedUrl(request)) {
                String token = request.getHeader("Authorization");
                //检查jwt令牌, 如果令牌不合法或者过期, 里面会直接抛出异常, 下面的catch部分会直接返回
                JwtUtil.validateToken(token);
            }
        } catch (Exception e) {
           // response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
            
        	response.setCharacterEncoding("UTF-8");
        	request.setCharacterEncoding("UTF-8");
            RestAPIResult2 restAPIResult = new RestAPIResult2();
    		restAPIResult.setRespCode(0);
    		restAPIResult.setRespMsg("token校验失败");
    				
    		ObjectMapper mapper = new ObjectMapper();  
            String json = mapper.writeValueAsString(restAPIResult);  
    		
            response.getWriter().write(json);
    		
            return;
        }
        //如果jwt令牌通过了检测, 那么就把request传递给后面的RESTful api
        filterChain.doFilter(request, response);
    }


    //我们只对地址 /api 开头的api检查jwt. 不然的话登录/login也需要jwt
    private boolean isProtectedUrl(HttpServletRequest request) {
    	if(request.getServletPath().contains("/api/SecAdminUser/doLogin")){//登陆不校验
    		return false;
    	}
    	
        return pathMatcher.match("/api/**", request.getServletPath());
    }
*/
}