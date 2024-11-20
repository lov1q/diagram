package com.example.diagram

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var entries = arrayListOf(
            BarEntry(4f,0),
            BarEntry(8f,1),
            BarEntry(6f,2),
            BarEntry(12f,3),
            BarEntry(18f,4),
            BarEntry(9f,5),
        )
        val dataSet = BarDataSet(entries,"")
        var labels = arrayListOf(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June"
        )
        val chart = BarChart(this)
        setContentView(chart)
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS)
        val data = BarData(labels, dataSet)
        chart.data = data
        chart.setDescription("Диаграмма")
    }
}