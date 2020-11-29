package com.cognizant.MovieTicket.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.MovieTicket.model.Booking;
import com.cognizant.MovieTicket.model.Customer;
import com.cognizant.MovieTicket.service.BookingService;


@Controller
public class MyController {

	@Autowired
	BookingService bsimpl;

	@RequestMapping(path = "/ticketbook", method = RequestMethod.GET)
	public String getTBookPage() {
		return "ticketbook";
	}

	@RequestMapping(path = "/ticketbook", method = RequestMethod.POST)
	public String postTicket(@ModelAttribute Booking book, ModelMap map) {

		boolean flag = bsimpl.getTicketBook(book);

		if (flag) {

			/*
			 * model.addAttribute("mname", book.getMname()); model.addAttribute("circle",
			 * book.getCircle()); model.addAttribute("noft",book.getNoft());
			 * model.addAttribute("cost",book.getCost());
			 */

			map.addAttribute("circle", book.getCircle());
			map.addAttribute("cost", book.getCost());
			return "success";
		} else {
			return "ticketbook";
		}

	}

	List<String> list1 = Arrays.asList(new String[] { "Kolkata", "Delhi", "Mumbai", "Pune", "Jaipur" });

	@RequestMapping(path = "/custreg", method = RequestMethod.GET)
	public String getRegPage(Model model) {

		//model.addAttribute("gender", getList());
		model.addAttribute("locationlist", list1);
		//model.addAttribute("hobbies", getCheckbox());
		model.addAttribute("customer", new Customer());
		return "custreg";
	}

	@RequestMapping(path = "/custreg", method = RequestMethod.POST)
	public String postRegPage( @ModelAttribute @Valid Customer customer, BindingResult br, Model model) {

		System.out.println(br.hasErrors());
		if (br.hasErrors()) {
			model.addAttribute("locationlist", list1);
			return "custreg";
		}

		
//			boolean flag = bsimpl.checkPostReg(customer);
//		
		else {		model.addAttribute("customer", customer);
				return "reg_success";
		}

		

	}

//	public static List<String> getList() {
//		List<String> jobItem = new ArrayList<String>();
//		jobItem.add("male");
//		jobItem.add("female");
//		jobItem.add("Transgender");
//		jobItem.add("Others");
//		return jobItem;
//	}
//
//	public static Map<String, String> getCheckbox() {
//		Map<String, String> map = new HashMap<>();
//		map.put("CR", "Cricket");
//		map.put("FT", "Football");
//		map.put("SW", "Swimming");
//
//		return map;
//
//	}

}
