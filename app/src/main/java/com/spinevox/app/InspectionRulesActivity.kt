package com.spinevox.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.spinevox.app.screens.SetHeightActivity
import kotlinx.android.synthetic.main.activity_inspection_rules.*

class InspectionRulesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inspection_rules)

        cl_root.setOnClickListener {
            SetHeightActivity.needToStartCamera = true
            startActivity(Intent(this, SetHeightActivity::class.java))
            finish()
        }

    }
}
