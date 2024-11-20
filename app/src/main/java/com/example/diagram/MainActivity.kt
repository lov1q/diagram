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
            BarEntry(4.78.toFloat(), 0),
            BarEntry(3.23.toFloat(), 1),
            BarEntry(3.56.toFloat(), 2),
            BarEntry(5.0.toFloat(), 3),
            BarEntry(3.55.toFloat(), 4),
            BarEntry(4.9.toFloat(), 5),
        )
        val dataSet = BarDataSet(entries,"")
        var labels = arrayListOf(
            "Иванов",
            "Сидоров",
            "Горнак",
            "Юшко",
            "Васильев",
            "Деребин"
        )
        val chart = BarChart(this)
        setContentView(chart)
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS)
        val data = BarData(labels, dataSet)
        chart.data = data
        chart.setDescription("Диаграмма")
    }
}