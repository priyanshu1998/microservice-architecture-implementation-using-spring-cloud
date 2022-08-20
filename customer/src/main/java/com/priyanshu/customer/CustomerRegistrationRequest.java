package com.priyanshu.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email){
}
