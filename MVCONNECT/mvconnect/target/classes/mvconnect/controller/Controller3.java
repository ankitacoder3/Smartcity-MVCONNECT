package mvcity.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import mvcity.dao.atmdao;
import mvcity.dao.hoteldao;
import mvcity.dao.malldao;
import mvcity.dao.theatredao;
import mvcity.model.Atm;
import mvcity.model.Hotels;
import mvcity.model.Malls;
import mvcity.model.Theatres;

import java.util.List;


@Controller
public class Controller3 {
	@RequestMapping("/Essential")
	public String dply()
	{
		return "Essential";
	}
	
	@RequestMapping("/Leisure")
	public String dsply()
	{
		return "Leisure";
	}

	
	@Autowired
	private atmdao adao;
	
	@RequestMapping("/atm")
	public String hme(Model m)
	{
		List<Atm> atm=adao.getAtms();
		m.addAttribute("atm",atm);
		return "Atm_index";
	}
	@RequestMapping("/add-atm")
	public String addatm(Model m)
	{
		m.addAttribute("title","Add Atm Details");
		return "add-atm";
	}
	//handle add atm form
	@RequestMapping(value="/handle-atm", method = RequestMethod.POST)
	public RedirectView handleatm(@ModelAttribute Atm atm,HttpServletRequest request)
	{
		System.out.println(atm);
		adao.createAtm(atm);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/atm");
		return redirectView;
	}
	
	@Transactional
	@RequestMapping("/deleteatm/{atmId}")
	public RedirectView deleteAtm(@PathVariable("atmId")int atmId,HttpServletRequest request)
	{
		this.adao.deleteAtm(atmId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/atm");
		return redirectView;
	}

	//handler to update atm
	@Transactional 
	@RequestMapping("/updateatm/{atmId}")
	public String Updateatmform(@PathVariable("atmId")int aid,Model model)
	{
		Atm atm=this.adao.getAtm(aid);
		model.addAttribute("atm",atm);
		return "update_atm";
	}
	
	@Autowired
	private theatredao tdao;
	
	@RequestMapping("/theatre")
	public String home(Model m)
	{
		List<Theatres> theatre=tdao.getTheatres();
		m.addAttribute("theatre",theatre);
		return "Theatre_index";
	}
	@RequestMapping("/add-theatre")
	public String addtheatre(Model m)
	{
		m.addAttribute("title","Add Theatre Details");
		return "add-theatre";
	}
	//handle add theatre form
	@RequestMapping(value="/handle-theatre", method = RequestMethod.POST)
	public RedirectView handlehotel(@ModelAttribute Theatres theatre,HttpServletRequest request)
	{
		System.out.println(theatre);
		tdao.createTheatre(theatre);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/theatre");
		return redirectView;
	}
	
	@Transactional
	@RequestMapping("/deletetheatre/{theatreId}")
	public RedirectView deleteTheatre(@PathVariable("theatreId")int theatreId,HttpServletRequest request)
	{
		this.tdao.deleteTheatre(theatreId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/theatre");
		return redirectView;
	}

	//handler to update theatre
	@Transactional 
	@RequestMapping("/updatetheatre/{theatreId}")
	public String Updatetheatreform(@PathVariable("theatreId")int tid,Model model)
	{
		Theatres theatre=this.tdao.getTheatre(tid);
		model.addAttribute("theatre",theatre);
		return "update_theatre_form";
	}
	
	@Autowired
	private malldao mdao;
	
	@RequestMapping("/mall")
	public String hm(Model m)
	{
		List<Malls> mall=mdao.getMalls();
		m.addAttribute("mall",mall);
		return "Malls_index";
	}
	@RequestMapping("/add-mall")
	public String addmall(Model m)
	{
		m.addAttribute("title","Add Mall Details");
		return "add-mall";
	}
	//handle add mall form
	@RequestMapping(value="/handle-mall", method = RequestMethod.POST)
	public RedirectView handleatm(@ModelAttribute Malls mall,HttpServletRequest request)
	{
		System.out.println(mall);
		mdao.createMall(mall);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/mall");
		return redirectView;
	}
	
	@Transactional
	@RequestMapping("/deletemall/{mallId}")
	public RedirectView deleteMall(@PathVariable("mallId")int mallId,HttpServletRequest request)
	{
		this.mdao.deleteMall(mallId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/mall");
		return redirectView;
	}

	//handler to update mall
	@Transactional 
	@RequestMapping("/updatemall/{mallId}")
	public String Updatemallform(@PathVariable("mallId")int mid,Model model)
	{
		Malls mall=this.mdao.getMall(mid);
		model.addAttribute("mall",mall);
		return "update_mall";
	}

	

}


