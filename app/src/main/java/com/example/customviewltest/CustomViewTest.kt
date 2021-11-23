package com.example.customviewltest

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class CustomViewTest(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    init {
        inflate(context, R.layout.custom_view, this)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.text)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomViewTest)
        textView.text = attributes.getString(R.styleable.CustomViewTest_text)
        button.text = attributes.getString(R.styleable.CustomViewTest_text)

        attributes.recycle()

    }
}