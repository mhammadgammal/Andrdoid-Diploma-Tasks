import java.util.*

fun main() {
	val productList = mutableListOf<Product>()
	val intScanner = Scanner(System.`in`)
	for(i in 1..4){
		println("Product #$i quantity")
		val quantity = intScanner.nextInt()
		println("Product #$i total sales")
		val totalSales = intScanner.nextInt()
		val product = Product(quantity = quantity, totalSales = totalSales)
		productList.add(product)
	}
	
	println(productList)
	println("high total sales ${ productList.maxBy { product -> product.totalSales } }")
	println("low quantities ${productList.minBy { product -> product.quantity }}")
	
}