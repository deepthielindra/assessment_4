package com.lab_assignment_4;
import java.io.*;

class ExceptionEg {
	
	public void throwException() throws InputException, IOException {
		
	}

}

public class Q7 {
public static void main(String[] args) {
	ExceptionEg exceptionExample = new ExceptionEg();
	try {
		exceptionExample.throwException();
	} catch (InputException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
