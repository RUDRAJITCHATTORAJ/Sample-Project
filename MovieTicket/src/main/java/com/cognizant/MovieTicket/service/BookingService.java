package com.cognizant.MovieTicket.service;

import com.cognizant.MovieTicket.model.Booking;
import com.cognizant.MovieTicket.model.Customer;

public interface BookingService {

	public boolean getTicketBook(Booking book);
	
	public boolean checkPostReg(Customer customer);
}
