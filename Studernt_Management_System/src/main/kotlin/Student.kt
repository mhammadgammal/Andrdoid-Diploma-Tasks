
data class Student(
	val id: Int,
	val firstName: String,
	val lastName: String,
	val GPA: Float
){
	fun getGrade(): String{
		return when(GPA){
			in 1.0f..1.9f -> "D"
			in 2.0f..2.9f -> "C"
			in 3.0f..3.9f -> "B"
			4.0f -> "C"
			else -> "Failed"
		}
	}
}
