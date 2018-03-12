package com.joshua.voice.demo.old;

import com.joshua.voice.wafer.ConfigurationException;
import com.joshua.voice.wafer.authorization.LoginService;
import com.joshua.voice.wafer.authorization.LoginServiceException;
import com.joshua.voice.wafer.authorization.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
       
	private static final long serialVersionUID = 6585319986631669934L;

	/**
	 * 处理登录请求
	 * */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 通过 ServletRequest 和 ServletResponse 初始化登录服务
		LoginService service = new LoginService(request, response);
		try {
			// 调用登录接口，如果登录成功可以获得登录信息
			UserInfo userInfo = service.login();
			System.out.println("========= LoginSuccess, UserInfo: ==========");
			System.out.println(userInfo.toString());
		} catch (LoginServiceException e) {
			// 登录失败会抛出登录失败异常
			e.printStackTrace();
		} catch (ConfigurationException e) {
			// SDK 如果还没有配置会抛出配置异常
			e.printStackTrace();
		}
	}

}
