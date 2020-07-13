package com.yoyom15.androidkotlincanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

/**
 * Created by Yolanda de Oliveira Xavier on 13/07/2020.
 * yolandaxavier15@gmail.com
 */
class Fire @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private var widthR = 50
    private var heightR = 50
    private var rect = Rect(0,0,widthR,heightR)
    private var paint = Paint().apply {
        this.color = Color.MAGENTA
    }
    private val paintText = Paint().apply {
        this.color = Color.BLACK
        this.textSize = 24f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.let {
            it.drawRect(rect, paint)
        }
    }
}