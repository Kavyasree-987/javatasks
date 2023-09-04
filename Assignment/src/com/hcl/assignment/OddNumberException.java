package com.hcl.assignment;

@SuppressWarnings("serial")
public class OddNumberException extends Exception {

	
	OddNumberException() {
        super(" :Odd Number ");
    }

 

    OddNumberException(String msg) {
        super(msg);
    }
}
