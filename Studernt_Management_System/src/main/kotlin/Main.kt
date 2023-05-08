import java.util.*

fun main() {
	println("Hello World!")
	val studentList = mutableListOf<Student>()
	val scanner = Scanner(System.`in`)
	
	while(true){
		println("1-Add new Student")
		println("2-Delete Student")
		println("3-Update GPA")
		println("4-Search Student")
		println("5-Display Student")
		println("Press any key to exit")
		val choice = scanner.nextInt()
		
		when(choice){
			1 -> addNewStudent(studentList, scanner)
			2 -> deleteStudent(studentList, scanner)
			3 -> updateGPA(studentList, scanner)
			4 -> searchStudent(studentList, scanner)
			5 -> println(displayAllStudents(studentList))
			else -> break
		}
	}
	
	
}



fun addNewStudent(studentList: MutableList<Student>, scanner: Scanner) {
	println("enter id")
	val id = scanner.nextInt()
	println("Enter first name")
	val firstName = scanner.next()
	println("Enter last name")
	val lastName = scanner.next()
	println("enter GPA")
	val GPA = scanner.nextFloat()
	val student = Student(id, firstName, lastName, GPA)
	studentList.add(student)
}

fun deleteStudent(studentList: MutableList<Student>, scanner: Scanner) {
	println("Enter id of student you want to delete")
	val id = scanner.nextInt()
	studentList.removeIf {
		it.id == id
	}
}

fun updateGPA(studentList: MutableList<Student>, scanner: Scanner) {
	val index = searchStudent(studentList, scanner)
	index?.let {
		println("Enter new GPA")
		val GPA = scanner.nextFloat()
		val student = Student(studentList[it].id, studentList[it].firstName, studentList[it].lastName, GPA)
		studentList[it] = student
		println(studentList[it])
	}
}

fun searchStudent(studentList: MutableList<Student>, scanner: Scanner): Int? {
	println("Enter id")
	val id = scanner.nextInt()
	val index: Int?
	for (i in studentList.indices){
		if(studentList[i].id == id){
			index = i
			println("Student found successfully")
			println(studentList[i])
			return index
		}
	}
	println("Student not found")
	return null
}

fun displayAllStudents(studentList: MutableList<Student>) = studentList



