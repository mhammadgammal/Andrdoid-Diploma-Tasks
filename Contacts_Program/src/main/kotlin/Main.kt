import org.w3c.dom.html.HTMLIsIndexElement
import java.util.*

fun main() {
	val contactList = mutableListOf<Contact>()
	val scanner = Scanner(System.`in`)
	while (true) {
		println(
			"""1-add Contact
2-get all contacts
3-delete contact
		"""
		)
		val choice = scanner.nextInt()
		when (choice) {
			1 -> {
				println("Enter first name")
				val firstName = scanner.next()
				val lastName = scanner.next()
				val phoneNumber = scanner.next()
				contactList.add(addContact(firstName, lastName, phoneNumber))
			}
			2 -> println(contactList)
			3 -> {
				val phoneNumber = scanner.next()
				contactList.removeIf {
					it.phoneNumber == phoneNumber
				}
			}
			else -> break
		}
	}
}




fun addContact(firstName: String, lastName: String, phoneNumber: String): Contact {
	return Contact(firstName, lastName, phoneNumber)
}