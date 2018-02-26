package com.myproject.StudentAdmissionController;

import java.util.Calendar;
//import java.util.Calender;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	//private static final Calendar Calender = null;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		Calendar cal=Calendar.getInstance();
		int dayOfWeek=cal.get(cal.DAY_OF_WEEK);// getting the day  which request is made.
		System.out.println(dayOfWeek);
		if(dayOfWeek==1)//5 means =friday
		{
			response.getWriter().write("This website is closed on Friday" +  "Please try accessing it on any other week day");       
			return false;
		}
		return true;
		}
	}

