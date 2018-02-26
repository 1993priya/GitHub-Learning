package com.myproject.StudentAdmissionController;    

import java.sql.Date;
import java.text.SimpleDateFormat;
//import java.util.Map;



import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd");
		binder.registerCustomEditor(Date.class,"myDob",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class,"name",new StudentNameEditor());
	}
	
	@RequestMapping(value="Welcome.HTML",  method=RequestMethod.GET)
	public ModelAndView getAdmissionForm( )
	{
	ModelAndView model =new ModelAndView("AdmissionForm");
	
	return model;
	
	}
	
	@ModelAttribute 
	public void addingCommonObjects(Model model1)
	{
		model1.addAttribute("msg","Welcome to my world");
		
	}

	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam (value="Studentname", defaultValue="abcd") String name,@RequestParam ("Studentcrush") String crush,@RequestParam ("Studenthobby") String hobby)
	//{
	//public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar)
	//{
//String name=reqPar.get("Studentname");
//String crush=reqPar.get("Studentcrush");
//String hobby=reqPar.get("Studenthobby");
	
	public ModelAndView submitAdmissionForm( @ModelAttribute("student1") Student student1, BindingResult result)
	
	{
		if(result.hasErrors())
		{
			ModelAndView model=new ModelAndView("AdmissionForm");
			return model;
		}
			 ModelAndView model=new ModelAndView("AdmissionSuccess");
			 //model.addObject("msg","My Name is    " +name+  ", N i have big Crush on  " +crush+",My hobby is  :" +hobby);
			// model.addObject("msg","HI");
			 return model;
			}
	

}
