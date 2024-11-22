# Ticket Booking System

A simple ticket booking platform built using **Spring Boot**, **MongoDB**, and **Java multithreading** concepts. This project demonstrates industry-standard practices, including asynchronous programming, concurrency management, and real-time data processing.

---

## **Features**
1. **User Registration and Login**: Secure user authentication and registration.
2. **View Available Shows**: Fetch movie shows asynchronously.
3. **Book Tickets**: Multithreaded seat booking with concurrency handling.
4. **Payment Processing**: Simulated payment system using async tasks.
5. **Asynchronous Notifications**: Email/SMS notification simulation.

---

## **Technologies Used**
- **Java 17**
- **Spring Boot**
- **MongoDB**
- **Java CompletableFuture**
- **ExecutorService**

---

## **How to Run**
1. Clone the repository:  
   ```bash
   git clone https://github.com/your-repo/ticket-booking-system.git
    mvn clean install
    mvn spring-boot:run

## **Project Structure**
controller: REST API controllers
service: Business logic
repository: MongoDB interaction
model: Data entities
config: Configuration files   

## **Future Enhancements**
Integration with a real payment gateway.
Add user analytics dashboard.
