import java.util.*

val trainees = mutableListOf<trainee?>()
fun main() {
	var T1: trainee? = trainee(1, 20, "Mohamed", 2.2F, "Ain Shams", 2)
	trainees.add(T1)
	var T2: trainee? = trainee(2, 22, "Amr", 2.0F, "Cairo University", 4)
	trainees.add(T2)
	var T3: trainee? = trainee(3, 21, "Hassan", 1.9F, "Banha", 3)
	trainees.add(T3)
	listTrainees(trainees)
	//addTrainee()
	//listTrainees(trainees)
	//edittrainee(3)
	deleteTrainee(3)
	
}
fun listTrainees(trainees:MutableList<trainee?>){
	trainees.forEach {
		if (it != null) {
			println("${it.displayData()}")
		}
	}}
fun addTrainee()
{
	val id:Int = Scanner(System.`in`).nextInt()
	val age:Int = Scanner(System.`in`).nextInt()
	val name = readLine()!!
	val GPA: Float =  Scanner(System.`in`).nextFloat()
	val universityName: String = readLine()!!
	var acadYear: Int = Scanner(System.`in`).nextInt()
	
	trainees.add(trainee(id, age, name, GPA, universityName, acadYear))
}
fun edittrainee(ID: Int){
	for (i in trainees.indices) {
		if(ID == trainees[i]?.ID){
			println("""what to modify:
1- age
2- GPA
3- Academic Year
			""")
			val reader = Scanner(System.`in`).nextInt()
			when(reader){
				1 -> trainees[i]?.age = Scanner(System.`in`).nextInt()
				2 -> trainees[i]?.GPA = Scanner(System.`in`).nextFloat()
				3-> trainees[i]?.acadYear = Scanner(System.`in`).nextInt()
			}
		}}
	listTrainees(trainees)
}
fun deleteTrainee(ID: Int){
	for (i in trainees.indices) {
		if(ID == trainees[i]?.ID){
			trainees[i] = null
		}
	}
	listTrainees(trainees)
}
