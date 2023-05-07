class Calculator {
	companion object{
		fun sum(num1: Int, num2: Int) = num1+num2
		fun sum(num1: Double, num2: Double) = num1+num2
		fun sum(num1: Float, num2: Float) = num1+num2
		
		fun sub(num1: Int, num2: Int) = num1-num2
		fun sub(num1: Double, num2: Double) = num1-num2
		fun sub(num1: Float, num2: Float) = num1-num2
		
		fun mul(num1: Int, num2: Int) = num1*num2
		fun mul(num1: Double, num2: Double) = num1*num2
		fun mul(num1: Float, num2: Float) = num1*num2
		
		fun div(num1: Int, num2: Int) = num1/num2
		fun div(num1: Double, num2: Double) = num1/num2
		fun div(num1: Float, num2: Float) = num1/num2
	}
}