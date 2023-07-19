package com.example.hotelprodection

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.io.IOException
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import java.nio.channels.FileChannel
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var regressionModel: Interpreter
    private lateinit var classificationModel: Interpreter
    private val regressionInputSize = 0//TODO(): Set the input size for regression model
    private val classificationInputSize = 0 // TODO(): Set the input size for classification model
    private val numClasses = 0//TODO(): Set the number of classes for classification model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            regressionModel = Interpreter(loadModelFile(this," "))
            classificationModel = Interpreter(loadModelFile(this," "))
        } catch (e: IOException) {
            // Handle the exception
        }

    }
}

@Throws(IOException::class)
private fun loadModelFile(context: Context, modelPath: String): ByteBuffer {
    val fileDescriptor = context.assets.openFd(modelPath)
    val inputStream = FileInputStream(fileDescriptor.fileDescriptor)
    val fileChannel = inputStream.channel
    val startOffset = fileDescriptor.startOffset
    val declaredLength = fileDescriptor.declaredLength
    return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength)
}