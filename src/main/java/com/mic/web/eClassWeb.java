/**
 * lei
 * com.mic.web
 * eClassWeb.java
 * 创建人:lei
 * 时间：2018年9月28日-下午21:03:04 
 * 2018雷-版权所有
 */

package com.mic.web;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mic.core.FileUp1;
import com.mic.service.eClassDo;


/**
 * 
 * eClassWeb
 * 创建人:lei
 * 时间：2018年9月28日-下午21:03:04  
 * @version 1.0.0
 * 
 */
@Controller
public class eClassWeb {
	@Autowired
	private eClassDo eclassdo;
	
	@Autowired
	private HttpSession se;
	/**
	 * 老师添加学校的页面
	 * 方法名：eClassDo
	 * 创建人：lei
	 * 时间：2018年9月28日-下午21:03:04 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * @exception 
	 * @since  1.0.0
	 */
	
	@RequestMapping(value="/eClassWeb", method = RequestMethod.POST)
	public ModelAndView eClassDo(@RequestParam MultipartFile file, HttpServletRequest re) throws IllegalStateException, IOException{
		ModelAndView modelandview = new ModelAndView();
		String path = se.getServletContext().getRealPath("/ppt");
        FileUp1 fileup1 = new FileUp1();
        String Path = fileup1.fileUp(file, path);
		eclassdo.eClassDo(Integer.parseInt(re.getSession().getAttribute("C_id").toString()),
				            re.getParameter("className"),
							re.getParameter("Introduction"), 
							re.getParameter("begintime"), 
							re.getParameter("endtime"), Path);
		modelandview.setViewName("student/pVacation");
		return modelandview;
	}
}