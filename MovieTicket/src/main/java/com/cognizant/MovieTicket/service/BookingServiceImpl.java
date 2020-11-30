package com.cognizant.MovieTicket.service;

import org.springframework.stereotype.Service;

import com.cognizant.MovieTicket.model.Booking;
import com.cognizant.MovieTicket.model.Customer;


@Service
public class BookingServiceImpl implements BookingService {

	@Override
	public boolean getTicketBook(Booking book) {
		
		int tncost=0;
		
		
		try {
		if(book.getCircle().equals("King")) {
			tncost=150*(Integer.parseInt(book.getNoft()));
		}
		else
		{
			tncost=250*(Integer.parseInt(book.getNoft()));
		}
		
		book.setCost(tncost);
		
		return true;
		
		}
		catch (Exception e) {
		
			return false;
		}
	}

	@Override
	public boolean checkPostReg(Customer customer) {
		
		if(customer.getPassword().length()>4 && customer.getPassword().contains("R")) {
		
			return true;
		}
		else {
		return false;
		}
		
		}
	
	
	
	

}
