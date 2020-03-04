package com.example.hosein.roomdatabaseproject.Utilities

import android.content.Context
import java.io.File
import java.util.*

object SaveImage {
    fun saveImage(context: Context, path: String): String? {
        val imageFile = File(path)

        if (!imageFile.exists()) {
            return null
        }

        var split = imageFile.name.split(".")
        val imageName = UUID.randomUUID().toString() + "." + split[(split.size) - 1]
        context.openFileOutput(imageName, Context.MODE_PRIVATE).write(imageFile.readBytes())
        return imageName

    }
}