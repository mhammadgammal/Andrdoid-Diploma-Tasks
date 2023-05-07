import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
	val list = mutableListOf("Java", "Kotlin", "Dart", "C++", "C#", "HTML", "CSS", "Java Script")
	val selectedItem = list[Random.nextInt(list.size)]
	var guessed = false
	println("Enter Your Guess")
	val scanner = Scanner(System.`in`)
	for(i in 1..5){
		val guess = scanner.next()
		if(selectedItem.equals(guess)){
			println("Congratulations, your guess is true")
			println("It took you $i chances")
			guessed = true
			break
		}
		println("Try again")
	}
	if (!guessed){
		println("Game Over")
		println("The correct word $selectedItem")
	}
	
	
	
}
