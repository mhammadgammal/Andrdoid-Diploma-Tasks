import java.util.Scanner
val engineers = mutableListOf<Engineer?>()
fun main() {
	
	var E1: Engineer? = Engineer(1, 20, "Mohamed", "Manager")
	engineers.add(E1)
	var E2: Engineer? = Engineer(2, 25, "Amr", "team leader")
	engineers.add(E2)
	var E3: Engineer? = Engineer(3, 23, "Hassan", "member")
	engineers.add(E3)
	deleteEngineer(3)
	
}
fun listEngineers(engineers:MutableList<Engineer?>){
engineers.forEach {
	if (it != null) {
		println("${it.displayData()}")
	}
}}
fun addEngineer()
{
	var id:Int = Scanner(System.`in`).nextInt()
	var age:Int = Scanner(System.`in`).nextInt()
	var name = readLine()!!
	var position: String = readLine()!!
	
	engineers.add(Engineer(id, age, name, position))
}
fun editEngineer(ID: Int){
	for (i in engineers.indices) {
		if(ID == engineers[i]?.ID){
			println("""what to modify:
1- age
2- position
			""")
		val reader = Scanner(System.`in`).nextInt()
		when(reader){
			1 -> engineers[i]?.age = Scanner(System.`in`).nextInt()
			2 -> engineers[i]?.position = readLine()!!
		}
		}}
	listEngineers(engineers)
	}
fun deleteEngineer(ID: Int){
for (i in engineers.indices) {
	if(ID == engineers[i]?.ID){
		engineers[i] = null
	}
}
	listEngineers(engineers)
}
