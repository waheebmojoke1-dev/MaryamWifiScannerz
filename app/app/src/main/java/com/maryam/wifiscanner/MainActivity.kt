package com.maryam.wifiscanner

import android.app.Activity
import android.os.Bundle
import android.content.Context
import android.net.wifi.WifiManager
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showScanner()
    }

    private fun showScanner() {
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 48, 32, 32)
            setBackgroundColor(Color.rgb(18, 18, 28))
        }

        val title = TextView(this).apply {
            text = "MARYAM WI-FI SCANNER"
            textSize = 24f
            setTextColor(Color.WHITE)
        }
        layout.addView(title)

        val info = TextView(this).apply {
            textSize = 16f
            setTextColor(Color.LTGRAY)
            text = "\nWi-Fi connection information"
        }
        layout.addView(info)

        val button = Button(this).apply {
            text = "Refresh"
            setOnClickListener { updateInfo(info) }
        }
        layout.addView(button)
        updateInfo(info)
        setContentView(layout)
    }

    private fun updateInfo(view: TextView) {
        val manager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val enabled = manager.isWifiEnabled
        view.text = "\nWi-Fi: " + if (enabled) "Enabled" else "Disabled" +
            "\n\nNetwork scanning is subject to Android permissions and location settings."
    }
}
