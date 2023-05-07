class trainee(ID: Int, age: Int, name: String,var GPA: Float, val universityName: String, var acadYear: Int)
	:Employee(ID, age, name) {
	override val name: String
	override val ID: Int
	init {
		this.name = name
		this.ID = ID
	}
	val salary: Int = 1500
	fun displayData() { println("ID: $ID,  name: $name,  GPA: $GPA,  University name: $universityName,   Academic year: $acadYear") }
	
}