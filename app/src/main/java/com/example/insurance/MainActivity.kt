package com.example.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Toast.makeText(this,"Position = " + position, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerAge.onItemSelectedListener = this

        buttonCalculate.setOnClickListener(){
            calculatePremium()
        }
    }

    private fun calculatePremium(){
        val position = spinnerAge.selectedItemPosition
        val gender = radioGroupGender.checkedRadioButtonId

        if(position == 0){
            //TODO calculate premium for less than 17
        }

        if(gender == R.id.radioButtonMale){
            //TODO calculate premium for male
        }

        if(checkBoxSmoker.isChecked){
            //TODO calculate premium for smoker
        }
    }

}
