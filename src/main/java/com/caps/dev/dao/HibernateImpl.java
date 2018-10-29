package com.caps.dev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.dev.beans.Person;

public class HibernateImpl implements DAOimpl {
	public  void Create(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(person);
		tx.commit();
	}

	public  void Delete(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		person=em.find(Person.class,person.getPersonId());
		em.remove(person);
		tx.commit();
	}

	public  void Search(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		person=em.find(Person.class,person.getPersonId());
		System.out.println("*********************");
		System.out.println("Id : "+person.getPersonId());
		System.out.println("Name : "+person.getPersonName());
		System.out.println("Age : "+person.getPersonAge());
		System.out.println("EmailId : "+person.getPersonEmail());
		System.out.println("Address : "+person.getPersonAddress());
		System.out.println("*********************");
		tx.commit();
	}

	public  void Update(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		person=em.find(Person.class,person.getPersonId());
		person=em.find(Person.class,person.getPersonEmail());
		person.setPersonAddress(person.getPersonEmail());
		tx.commit();
	}
}