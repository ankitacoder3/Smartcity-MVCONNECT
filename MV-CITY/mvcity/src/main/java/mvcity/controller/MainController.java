package mvcity.controller;

import java.util.List;

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

import mvcity.dao.mvcitydao;
import mvcity.model.Product;
@Controller
public class MainController {
	@Autowired
	private mvcitydao productdao;
	
	
	@RequestMapping("/add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title","Add City Details");
		return "add_product_form";
	}
//handle add product form
	@RequestMapping(value="/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		System.out.println(product);
		productdao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	//handler to delete
	@Transactional
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteCity(@PathVariable("productId")int productId,HttpServletRequest request)
	{
		this.productdao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	//handler to update
	@Transactional 
	@RequestMapping("/update/{productId}")
	public String Updateform(@PathVariable("productId")int pid,Model model)
	{
		Product product=this.productdao.getProduct(pid);
		model.addAttribute("product",product);
		return "updateform";
	}
	
}
