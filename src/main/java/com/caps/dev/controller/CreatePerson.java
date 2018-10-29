package com.caps.dev.controller;

import java.util.Scanner;

import com.caps.dev.beans.Person;
import com.caps.dev.dao.DAOimpl;
import com.caps.dev.dao.HibernateImpl;

public class CreatePerson 
{
    public static void main( String[] args )
    {
    	System.out.println("Enter Person Details");
		System.out.println("-------------------");
		Person person = new Person();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Person id: ");
		person.setPersonId(Integer.parseInt(in.nextLine()));

		System.out.println("Enter Person name: ");
		person.setPersonName(in.nextLine());

		System.out.println("Enter Person age: ");
		person.setPersonAge(Integer.parseInt(in.nextLine()));

		System.out.println("Enter Person emailId: ");
		person.setPersonEmail(in.nextLine());
		
		System.out.println("Enter Person Address: ");
		person.setPersonAddress(in.nextLine());
		
		DAOimpl impl=new HibernateImpl();
		//DAOimpl impl=new JDBCimpl();
		
		impl.Create(person);
		
		System.out.println("Person Details Saved..!!!!!!!!");
    	   }
}