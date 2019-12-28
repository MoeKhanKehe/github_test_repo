package Epic2;

public class variables {

	public static void main(String[] args) {
		//This is a code block - which is used to define a block of code. Inside a block of code, you will define what this code block does.
		//Imagine a wheel as the Epic in this case. Now in each class we will give details about the wheel that will make up the building blocks of the wheel. 
		
		
		// let's learn about some data types
		
		// int - this is a whole number(any number without a decimal)
		// double - this is a number with a decimal
		// string - this is a variable that can hold numbers or letters inside a single quote or double quote
		// array - this is a list that contains data types. Imagine a list of names, or ages.
		// boolean - this is a data type that can be either TRUE or FALSE
		
		
		
		/*------------NOW-----------*/
		
	
		
		// lets declare the variable
		
		
		
		int first_number = 25;
		double first_double = 2.5;
		
		System.out.println(first_number);
		System.out.println(first_double);
		
		String first_string = "my 1st string";
		System.out.println("first_string");
		System.out.println(first_string);
		
		
		//ind3
		int[] int_array = {23, 39, 4};
		double[] double_array = {2.3, 3.9, 4.0};
		String[] string_array = {"one","two","three"};
		
		System.out.println(int_array[0]);
		
		int_array[0] = 1000000;
		System.out.println(int_array[0]);
		
		
		// WOOOO HOOO!!! Great job you just defined your first few variable!
		
		// lets quickly talk about print vs. println
		System.out.println("one");
		System.out.print("two");
		System.out.println("three");
		System.out.println("four");
		
		
		
		//Sweet you've made it this far lets get the home stretch
		//lets combine some variables and get familiar with OPERATORS. you may have come across these if you've taken a math class before
		
		
		//ADDITIVE : + -
		// lets practice
		
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

		
		//MULTIPLICATIVE : / * %
		// lets practice 
		
        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);
        
		
		
		//ASSIGNMENT : = += -= *= /= %=
		// lets practice 
        
        int result_2 = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result_2);
		
		result_2++; // 3 + 1 = 4
        System.out.println("1 + 2 = " + result_2);
		
        result_2--; // 4 - 1 = 3
        System.out.println("4 - 1 = " + result_2);
        
        
        int result_3 = 10;
        result_3 +=5;
        System.out.println("10 + 5 = " + result_3);
        
        result_3 -=5;
        System.out.println("15 - 5 = " + result_3); 
        
        
		
        /*---- LETS GET INTO SOME FUN STUFF ----*/
        
        
		//EQUALITY : == !==
		// lets practice 
        
        boolean is_true = true;
        if(is_true == true)
        	System.out.println("this boolean is true");
        

        boolean is_false = false;
        if(is_false == true)
        	System.out.println("this boolean is true");
        
        
        // Make sure you are putting the semicolon in the correct spot
        if(is_false == false);
    		System.out.println("this boolean is true");

    	// now lets say we want to account for more than one using an if else statement
		//here's how it works
    		
		int one = 1;
		int uno = 1;
		int two = 2;
		
		if(one == two) {
			System.out.println("this is true");
		}else {
			System.out.println("this is false");
		}
        
        

		
		//RATIONAL : < <= > >=
		// lets practice 
		
		int small_num = 10;
		int big_num = 100;
		int big_num_2 = 100;
		int bigger_num = 101;
		
		//100 = 100
		if(big_num == big_num_2)
			System.out.println("100 is equal to 100");
	
		// 10 < 100 = true
		if(small_num < big_num)
			System.out.println("10 is less than 100");
		
		// 100 <= 100 = true
		if(big_num <= big_num_2)
			System.out.println("100 is less than or equal to 100");
		
		// 101 > 100 = true
		if(bigger_num > big_num)
			System.out.println("101 is greater than 100");
		
		// 101 >= 100 = true
		if(bigger_num >= big_num_2)
			System.out.println("101 is greater than or equal to 100");

		
		
		
		
        /*---LETS ADD SOME COMPLEXITY TO THIS---*/
   
		//CONDITIONAL : && ||
		// lets practice 
        
		//&& = AND
		// 101 > 10 and 101 <= 1000
		if(bigger_num > small_num && bigger_num < 1000) {
			System.out.println("101 is greater than 10 and 101 is less than 1000");
		}
        
		
		//|| = OR
		// 101 > 10 or 101 < 1000
		if(bigger_num > small_num || bigger_num < 1000) {
			System.out.println("101 is greater than 10 and 101 is less than 1000");
		}
       
		// 101 > 10 or 101 >= 1000
		if(bigger_num > small_num || bigger_num >= 1000) {
			System.out.println("101 is greater than 10 and 101 is less than 1000");
		}
		
		
		
		/*----------------STATEMENTS------------------*/
		
		
		//if statement
		int numbz = 10;
		if (numbz > 9) {
			System.out.println("This is true");
		}
		
		//if else statement
		int numb = 100;
		if (numb > 101) {
			System.out.println("This is true");
		}else {
			System.out.println("This is false");
		}
		
		//else if statement
		int Num = 1000;
		if (Num > 1001) {
			System.out.println("this is true 1");
		}else if(Num < 999){
			System.out.println("This is true 2");
		}else if(Num < 1000) {
			System.out.println("This is true 3");
		}else {
			System.out.println("All the above are false");
		}
		
		
		
		
		//switch statement
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			System.out.println("we can do more than just print one thing in a case");
			int number = 32;
			
			if(number == 32) {
				System.out.println("sooooo cool");
			}else {
				System.out.println("cool");
				}
			break;
		case 12:
			System.out.println("August");
			break;
		case 8:
			System.out.println("September");
			break;
		case 9:
			System.out.println("October");
			break;
		case 10:
			System.out.println("November");
			break;
		case 11:
			System.out.println("December");
			break;
		default:
			System.out.println("This is not a valid month");
			break;
			
		}
		// example from practice:

		int months = 10000;
		
		switch (months) {
		case 10000: 
			System.out.println("january");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("false");
			break;
		}
		
		if (months == 10000) {
			System.out.println("january");
		}else if(months == 2) {
			System.out.println("February");
		}else if(months == 3) {
			System.out.println("March");
		}else {
			System.out.println("false");
		}
		
		
		
		
		
		
		//While Loop
		int loop_num = 0;
		while (loop_num < 6){
			System.out.println("while - Hello World!");
			loop_num++;
		}
		
		
		
		//For Loop
		for (int i = 0; i < 6; i++) {
			System.out.println("for - Hello World!");
		}
       
	}

}
