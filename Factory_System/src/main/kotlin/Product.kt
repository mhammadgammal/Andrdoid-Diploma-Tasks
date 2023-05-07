import java.util.*

data class Product(
	val serialNumber: String = UUID.randomUUID().toString(),
	val quantity: Int,
	val totalSales: Int
	)