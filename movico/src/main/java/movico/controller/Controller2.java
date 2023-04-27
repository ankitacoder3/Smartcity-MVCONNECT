package movico.controller;
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

import movico.dao.hoteldao;
import movico.dao.theatredao;
import movico.model.Hotels;
import movico.model.Theatres;

import java.util.List;


@Controller
public class Controller2 {
	@Autowired
	private hoteldao hdao;
	@RequestMapping("/")
	public String dy()
	{
		return "index";
	}
	@RequestMapping("/hotel")
	public String home(Model m)
	{
		List<Hotels> hotel=hdao.getHotels();
		m.addAttribute("hotel",hotel);
		return "Hotel_index";
	}
	@RequestMapping("/admin")
	public String display()
	{
		return "admin";
	}
	@RequestMapping("/validadmin")
	public String disp()
	{
		return "validadmin";
	}
	@RequestMapping("/admin_operations")
	public String disply()
	{
		return "admin_operations";
	}
	
	@RequestMapping("/add-hotel")
	public String addtheatre(Model m)
	{
		m.addAttribute("title","Add Hotel Details");
		return "add-hotel";
	}
	
	//handle add product form
	@RequestMapping(value="/handle-hotel", method = RequestMethod.POST)
	public RedirectView handlehotel(@ModelAttribute Hotels hotel,HttpServletRequest request)
	{
		System.out.println(hotel);
		hdao.createHotel(hotel);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@Transactional
	@RequestMapping("/deletehotel/{hotelId}")
	public RedirectView deleteHotel(@PathVariable("hotelId")int hotelId,HttpServletRequest request)
	{
		this.hdao.deleteHotel(hotelId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/hotel");
		return redirectView;
	}

	//handler to update
	@Transactional 
	@RequestMapping("/updatehotel/{hotelId}")
	public String Updatehotelform(@PathVariable("hotelId")int hid,Model model)
	{
		Hotels hotel=this.hdao.getHotel(hid);
		model.addAttribute("hotel",hotel);
		return "update_hotel_form";
	}

	

}


