class Engineer(ID: Int, age: Int, name: String, _position: String) : Employee(ID, age, name) {
	override val ID: Int
	override var age: Int = 0
	override val name: String
	lateinit var position: String
	init {
		 this.ID = ID
		 this.age = age
		 this.name = name
		 this.position = _position
	}
	var workingHours: Int = 0
	var payRate: Int = 0
	var taxRate: Int = 0
	var salary=
		when (position) {
			"manager", "Manager" -> {
				payRate = 5000
				workingHours = 25
				taxRate = 35
				(payRate/workingHours) - taxRate
			}
			"team leader" -> {
				payRate = 3000
				workingHours = 25
				taxRate = 25
				(payRate/workingHours) - taxRate
			}
			"Member", "member" -> {
				payRate = 1000
				workingHours = 25
				taxRate =  15
				(payRate/workingHours) - taxRate
			}
			else -> {
				println("Wrong choice")
				0
			}
		}
		
	
	
	 fun displayData() {
		println("ID: $ID\tName: $name\tage: $age \tpostion: $position \tsalary: $salary")
	}
	
}